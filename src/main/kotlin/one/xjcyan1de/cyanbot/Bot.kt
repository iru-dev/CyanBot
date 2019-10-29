package one.xjcyan1de.cyanbot

import com.github.steveice10.mc.protocol.MinecraftProtocol
import com.github.steveice10.mc.protocol.data.game.ClientRequest
import com.github.steveice10.mc.protocol.packet.ingame.client.ClientRequestPacket
import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerPositionRotationPacket
import com.github.steveice10.mc.protocol.packet.ingame.client.world.ClientTeleportConfirmPacket
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerJoinGamePacket
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.player.ServerPlayerHealthPacket
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.player.ServerPlayerPositionRotationPacket
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerChunkDataPacket
import com.github.steveice10.packetlib.Client
import com.github.steveice10.packetlib.Session
import com.github.steveice10.packetlib.event.session.PacketReceivedEvent
import com.github.steveice10.packetlib.event.session.SessionAdapter
import com.github.steveice10.packetlib.packet.Packet
import com.github.steveice10.packetlib.tcp.TcpSessionFactory
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import one.xjcyan1de.cyanbot.bukkit.CraftChunk
import one.xjcyan1de.cyanbot.bukkit.CraftWorld
import org.bukkit.Location
import org.bukkit.World
import java.net.Proxy

class Bot(val name: String, val password: String? = null) {
    lateinit var client: Client
    val session: Session
        get() = client.session

    var world: World = CraftWorld()
    var location: Location = Location(world,0.0,0.0,0.0)
    var entityId: Int = 0

    fun connect(host: String, port: Int = 25565,tcpSessionFactory: TcpSessionFactory = TcpSessionFactory(Proxy.NO_PROXY)) {
        client = Client(host,port,MinecraftProtocol(name,password),tcpSessionFactory)
        session.connect()

        session.addListener(object : SessionAdapter() {
            override fun packetReceived(event: PacketReceivedEvent) {
                when (val packet = event.getPacket<Packet>()) {
                    is ServerJoinGamePacket -> {
                        entityId = packet.entityId
                        GlobalScope.launch {
                            while (true) {
                                delay(1000/20)
                                session.send(ClientPlayerPositionRotationPacket(true,location.x,location.y,location.z,location.yaw,location.pitch))
                            }
                        }
                    }
                    is ServerPlayerPositionRotationPacket -> {
                        location = Location(world,packet.x,packet.y,packet.z,packet.yaw,packet.pitch)
                        session.send(ClientTeleportConfirmPacket(packet.teleportId))
                    }
                    is ServerPlayerHealthPacket -> {
                        if (packet.health == 0f) {
                            GlobalScope.launch {
                                delay(500)
                                session.send(ClientRequestPacket(ClientRequest.RESPAWN))
                            }
                        }
                    }
                    is ServerChunkDataPacket -> {
                        val column = packet.column
                        world.loadChunk(CraftChunk(world,column.x,column.z,column.chunks))
                        val chunk = world.getChunkAt(column.x, column.z)
//                        println("Загружен чанк $chunk")
                    }
                }
            }
        })
    }
}