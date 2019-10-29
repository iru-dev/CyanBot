package one.xjcyan1de.cyanbot.bukkit

import one.xjcyan1de.cyanbot.Section
import org.bukkit.Chunk
import org.bukkit.ChunkSnapshot
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.block.Block
import org.bukkit.block.BlockState
import org.bukkit.block.data.BlockData
import org.bukkit.entity.Entity
import org.bukkit.plugin.Plugin

data class CraftChunk(
    private val _world: World,
    private val _x: Int = 0,
    private val _z: Int = 0,
    val sections: Array<Section> = Array(16) { Section(true) }
) : Chunk {
    override fun setInhabitedTime(ticks: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun contains(block: BlockData): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isForceLoaded(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPluginChunkTickets(): MutableCollection<Plugin> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getX(): Int = _x

    override fun getZ(): Int = _z

    override fun isSlimeChunk(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setForceLoaded(forced: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getInhabitedTime(): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getEntities(): Array<Entity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTileEntities(useSnapshot: Boolean): Array<BlockState> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isLoaded(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getChunkSnapshot(): ChunkSnapshot {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getChunkSnapshot(
        includeMaxblocky: Boolean,
        includeBiome: Boolean,
        includeBiomeTempRain: Boolean
    ): ChunkSnapshot {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unload(save: Boolean): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unload(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removePluginChunkTicket(plugin: Plugin): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addPluginChunkTicket(plugin: Plugin): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getWorld(): World = _world

    override fun getBlock(x: Int, y: Int, z: Int): Block {
        val id = sections[y shr 4].blocks.get(x and 15,y and 15, z and 15).id
        return CraftBlock(id, Location(world,x.toDouble(),y.toDouble(),z.toDouble()))
    }

    override fun load(generate: Boolean): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun load(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CraftChunk

        if (_x != other._x) return false
        if (_z != other._z) return false
        if (!sections.contentEquals(other.sections)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = _x
        result = 31 * result + _z
        result = 31 * result + sections.contentHashCode()
        return result
    }
}

val Pair<Int,Int>.asLong: Long
    get() = first.toLong() and 4294967295L or (second.toLong() and 4294967295L shl 32)

val Long.asIntPair: Pair<Int,Int>
    get() = this.toInt() to (this shr 32).toInt()