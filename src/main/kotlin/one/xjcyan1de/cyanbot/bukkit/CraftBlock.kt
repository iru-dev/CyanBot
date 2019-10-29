package one.xjcyan1de.cyanbot.bukkit

import com.destroystokyo.paper.block.BlockSoundGroup
import org.bukkit.*
import org.bukkit.block.*
import org.bukkit.block.data.BlockData
import org.bukkit.inventory.ItemStack
import org.bukkit.metadata.MetadataValue
import org.bukkit.plugin.Plugin
import org.bukkit.util.BoundingBox
import org.bukkit.util.RayTraceResult
import org.bukkit.util.Vector

class CraftBlock(id: Int, location: Location) : Block {
    private val _location: Location = location
    private val _blockState: BlockState = CraftBlockState(id,this)

    override fun getLightFromSky(): Byte {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLightLevel(): Byte {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setType(type: Material) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setType(type: Material, applyPhysics: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBlockData(data: BlockData) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBlockData(data: BlockData, applyPhysics: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isPassable(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRelative(modX: Int, modY: Int, modZ: Int): Block {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRelative(face: BlockFace): Block {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRelative(face: BlockFace, distance: Int): Block {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getY(): Int = location.blockY

    override fun getPistonMoveReaction(): PistonMoveReaction {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun rayTrace(
        start: Location,
        direction: Vector,
        maxDistance: Double,
        fluidCollisionMode: FluidCollisionMode
    ): RayTraceResult? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeMetadata(metadataKey: String, owningPlugin: Plugin) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMetadata(metadataKey: String): MutableList<MetadataValue> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isLiquid(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBlockData(): BlockData {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun breakNaturally(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun breakNaturally(tool: ItemStack): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBiome(): Biome {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTemperature(): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getWorld(): World = _location.world

    override fun getChunk(): Chunk = world.getChunkAt(this)

    override fun getSoundGroup(): BlockSoundGroup {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLightFromBlocks(): Byte {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getState(): BlockState = _blockState

    override fun getState(useSnapshot: Boolean): BlockState = state

    override fun setBiome(bio: Biome) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBlockPower(face: BlockFace): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBlockPower(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLocation(): Location = _location
    override fun getLocation(loc: Location?): Location? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDrops(): MutableCollection<ItemStack> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDrops(tool: ItemStack): MutableCollection<ItemStack> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getX(): Int = location.blockX

    override fun getFace(block: Block): BlockFace? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isEmpty(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getZ(): Int = location.blockZ

    override fun isBlockFaceIndirectlyPowered(face: BlockFace): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getType(): Material = state.type

    override fun setMetadata(metadataKey: String, newMetadataValue: MetadataValue) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getData(): Byte {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isBlockFacePowered(face: BlockFace): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isBlockIndirectlyPowered(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hasMetadata(metadataKey: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isBlockPowered(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBoundingBox(): BoundingBox {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHumidity(): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}