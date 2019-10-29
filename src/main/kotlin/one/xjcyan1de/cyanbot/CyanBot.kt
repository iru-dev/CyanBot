package one.xjcyan1de.cyanbot

import com.github.steveice10.mc.protocol.MinecraftConstants
import com.github.steveice10.mc.protocol.MinecraftProtocol
import com.github.steveice10.mc.protocol.ServerLoginHandler
import com.github.steveice10.mc.protocol.data.game.chunk.BlockStorage
import com.github.steveice10.mc.protocol.data.game.chunk.Chunk
import com.github.steveice10.mc.protocol.data.game.chunk.Column
import com.github.steveice10.mc.protocol.data.game.entity.player.GameMode
import com.github.steveice10.mc.protocol.data.game.world.WorldType
import com.github.steveice10.mc.protocol.data.game.world.block.BlockState
import com.github.steveice10.mc.protocol.data.message.TextMessage
import com.github.steveice10.mc.protocol.data.status.PlayerInfo
import com.github.steveice10.mc.protocol.data.status.ServerStatusInfo
import com.github.steveice10.mc.protocol.data.status.VersionInfo
import com.github.steveice10.mc.protocol.data.status.handler.ServerInfoBuilder
import com.github.steveice10.mc.protocol.packet.MinecraftPacket
import com.github.steveice10.mc.protocol.packet.ingame.client.ClientChatPacket
import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerMovementPacket
import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerPositionPacket
import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerPositionRotationPacket
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerChatPacket
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerJoinGamePacket
import com.github.steveice10.mc.protocol.packet.ingame.server.ServerRespawnPacket
import com.github.steveice10.mc.protocol.packet.ingame.server.world.ServerChunkDataPacket
import com.github.steveice10.opennbt.tag.builtin.CompoundTag
import com.github.steveice10.packetlib.Client
import com.github.steveice10.packetlib.Server
import com.github.steveice10.packetlib.Session
import com.github.steveice10.packetlib.event.server.ServerAdapter
import com.github.steveice10.packetlib.event.server.SessionAddedEvent
import com.github.steveice10.packetlib.event.session.PacketReceivedEvent
import com.github.steveice10.packetlib.event.session.SessionAdapter
import com.github.steveice10.packetlib.packet.Packet
import com.github.steveice10.packetlib.tcp.TcpSessionFactory
import com.google.gson.JsonParser
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import one.xjcyan1de.cyanbot.bukkit.CraftBlockState
import org.bukkit.Material
import java.io.File
import java.io.FileReader
import java.lang.StringBuilder
import java.net.Proxy

val tcpSessionFactory = TcpSessionFactory(Proxy.NO_PROXY)

fun main() {
    CraftBlockState.materials = loadBlocks()

    val bot = Bot("pqzpn198@mail.ru", "pyUph~Cf3^HKOw95x,3+")
//    bot.connect("xjcyan1de.one")
    bot.connect("localhost")
    bot.session.addListener(object : SessionAdapter() {
        override fun packetReceived(event: PacketReceivedEvent) {
            try {
                val session = event.session
                when (val packet = event.getPacket<Packet>()) {
                    is ServerJoinGamePacket -> {
//                        session.chat("Привет суки ебаные!")
                        GlobalScope.launch {
                            delay(500)
//                            session.chat("Блок подомной: ${bot.location.add(0.0,-1.0,0.0).block.type}")
                        }
                    }
                    is ServerChunkDataPacket -> {
                        println("chunk = ${packet.column.x} ${packet.column.z}")
                    }
                    is ServerChatPacket -> {
                        val text = packet.message.fullText
                        println("Chat: $text")
                        if (text.contains("> ")) {
                            val message = text.split("> ")[1]
                            val commands = message.split(" ")
                            when (commands[0]) {
                                "Повтори" -> {
                                    val sb = StringBuilder()
                                    commands.forEachIndexed { index, s ->
                                        if (index != 0) {
                                            sb.append(s).append(" ")
                                        }
                                    }
                                    session.chat(sb.toString())
                                }
                                "Движение" -> {
                                    val x = commands[1].toDouble()
                                    val y = commands[2].toDouble()
                                    val z = commands[3].toDouble()
                                    session.chat("у сюка $x $z")
                                    bot.location.add(x, y, z)
                                }
                                "ИдиНах" -> {
                                    session.chat("ну и пошли вы нахуй")
                                    Thread.sleep(500)
                                    session.disconnect("")
                                }
                            }
                        }
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
                event.session.chat("Произошла херня: ${e.localizedMessage}")
            }
        }
    })
    while (true) {
    }
}

fun loadBlocks(): Array<Material?> {
    val blockFile = File("blocks.json")
    return if (blockFile.exists()) {
        println("Загружаем блоки...")
        val list = ArrayList<Material?>()
        val json = JsonParser.parseReader(FileReader(blockFile)).asJsonObject
        for (entry in json.entrySet()) {
            val material = entry.key
            for (state in entry.value.asJsonObject.getAsJsonArray("states")) {
                val id = state.asJsonObject["id"].asInt
                list.add(Material.matchMaterial(material))
            }
        }
        list.toTypedArray()
    } else {
        emptyArray()
    }
}

fun Session.chat(message: String) {
    send(ClientChatPacket(message))
}