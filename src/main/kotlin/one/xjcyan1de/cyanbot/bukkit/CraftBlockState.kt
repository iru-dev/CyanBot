package one.xjcyan1de.cyanbot.bukkit

import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
import org.bukkit.Chunk
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.block.Block
import org.bukkit.block.BlockState
import org.bukkit.block.data.BlockData
import org.bukkit.material.MaterialData
import org.bukkit.metadata.MetadataValue
import org.bukkit.plugin.Plugin

class CraftBlockState(private val id: Int, block: Block) : BlockState {
    private val _block: Block = block

    override fun getLightLevel(): Byte {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setRawData(data: Byte) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setType(type: Material) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBlockData(data: BlockData) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getY(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setData(data: MaterialData) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(force: Boolean): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(force: Boolean, applyPhysics: Boolean): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeMetadata(metadataKey: String, owningPlugin: Plugin) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMetadata(metadataKey: String): MutableList<MetadataValue> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBlockData(): BlockData {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getWorld(): World = block.world

    override fun getRawData(): Byte {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getChunk(): Chunk = block.chunk

    override fun getLocation(): Location = block.location

    override fun getLocation(loc: Location?): Location? = block.getLocation(loc)

    override fun getX(): Int = block.x

    override fun isPlaced(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getZ(): Int = block.z

    override fun getType(): Material = materials[id]!!

    override fun setMetadata(metadataKey: String, newMetadataValue: MetadataValue) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getData(): MaterialData {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hasMetadata(metadataKey: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBlock(): Block = _block

    companion object {
        var materials: Array<Material?> = emptyArray()
    }
}