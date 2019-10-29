package one.xjcyan1de.cyanbot.bukkit

import com.destroystokyo.paper.HeightmapType
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
import org.bukkit.*
import org.bukkit.block.Biome
import org.bukkit.block.Block
import org.bukkit.block.data.BlockData
import org.bukkit.entity.*
import org.bukkit.generator.BlockPopulator
import org.bukkit.generator.ChunkGenerator
import org.bukkit.inventory.ItemStack
import org.bukkit.material.MaterialData
import org.bukkit.metadata.MetadataValue
import org.bukkit.plugin.Plugin
import org.bukkit.util.BoundingBox
import org.bukkit.util.Consumer
import org.bukkit.util.RayTraceResult
import org.bukkit.util.Vector
import java.io.File
import java.util.*
import java.util.concurrent.CompletableFuture
import java.util.function.Predicate

class CraftWorld : World {
    val chunkMap = Long2ObjectLinkedOpenHashMap<Chunk>()

    override fun setWaterAnimalSpawnLimit(limit: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPVP(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getGameRuleValue(rule: String?): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> getGameRuleValue(rule: GameRule<T>): T? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllowAnimals(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAnimalSpawnLimit(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMetadata(metadataKey: String): MutableList<MetadataValue> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun locateNearestRaid(location: Location, radius: Int): Raid? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getListeningPluginChannels(): MutableSet<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun spawnEntity(loc: Location, type: EntityType): Entity {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removePluginChunkTicket(x: Int, z: Int, plugin: Plugin): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFullTime(): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getThunderDuration(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dropItemNaturally(location: Location, item: ItemStack): Item {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setStorm(hasStorm: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBiome(x: Int, z: Int): Biome {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getNearbyEntities(location: Location, x: Double, y: Double, z: Double): MutableCollection<Entity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getNearbyEntities(
        location: Location,
        x: Double,
        y: Double,
        z: Double,
        filter: Predicate<Entity>?
    ): MutableCollection<Entity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getNearbyEntities(boundingBox: BoundingBox): MutableCollection<Entity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getNearbyEntities(boundingBox: BoundingBox, filter: Predicate<Entity>?): MutableCollection<Entity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getEntityCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isChunkLoaded(chunk: Chunk): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isChunkLoaded(x: Int, z: Int): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun spigot(): World.Spigot {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDifficulty(): Difficulty {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isChunkInUse(x: Int, z: Int): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getForceLoadedChunks(): MutableCollection<Chunk> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setMetadata(metadataKey: String, newMetadataValue: MetadataValue) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTime(): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setTime(time: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setThunderDuration(duration: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getChunkAtAsync(x: Int, z: Int, gen: Boolean): CompletableFuture<Chunk> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun regenerateChunk(x: Int, z: Int): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setTicksPerAnimalSpawns(ticksPerAnimalSpawns: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHighestBlockAt(x: Int, z: Int): Block {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHighestBlockAt(location: Location): Block {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isAutoSave(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun playSound(location: Location, sound: Sound, volume: Float, pitch: Float) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun playSound(location: Location, sound: String, volume: Float, pitch: Float) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun playSound(location: Location, sound: Sound, category: SoundCategory, volume: Float, pitch: Float) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun playSound(location: Location, sound: String, category: SoundCategory, volume: Float, pitch: Float) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sendPluginMessage(source: Plugin, channel: String, message: ByteArray) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun rayTrace(
        start: Location,
        direction: Vector,
        maxDistance: Double,
        fluidCollisionMode: FluidCollisionMode,
        ignorePassableBlocks: Boolean,
        raySize: Double,
        filter: Predicate<Entity>?
    ): RayTraceResult? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setDifficulty(difficulty: Difficulty) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTicksPerMonsterSpawns(): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHighestBlockYAt(x: Int, z: Int): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHighestBlockYAt(location: Location): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHighestBlockYAt(x: Int, z: Int, heightmap: HeightmapType): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Entity?> getEntitiesByClass(vararg classes: Class<T>?): MutableCollection<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Entity?> getEntitiesByClass(cls: Class<T>): MutableCollection<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getWorldFolder(): File {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setGameRuleValue(rule: String, value: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setAutoSave(value: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setKeepSpawnInMemory(keepLoaded: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setFullTime(time: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getChunkCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Entity?> spawn(location: Location, clazz: Class<T>): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Entity?> spawn(location: Location, clazz: Class<T>, function: Consumer<T>?): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getGameRules(): Array<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setAnimalSpawnLimit(limit: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setSpawnLocation(location: Location): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setSpawnLocation(x: Int, y: Int, z: Int): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSpawnLocation(): Location {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getWorldType(): WorldType? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPluginChunkTickets(x: Int, z: Int): MutableCollection<Plugin> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPluginChunkTickets(): MutableMap<Plugin, MutableCollection<Chunk>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun spawnFallingBlock(location: Location, data: MaterialData): FallingBlock {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun spawnFallingBlock(location: Location, data: BlockData): FallingBlock {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun spawnFallingBlock(location: Location, material: Material, data: Byte): FallingBlock {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isChunkGenerated(x: Int, z: Int): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isThundering(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTicksPerAnimalSpawns(): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTickableTileEntityCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadChunk(chunk: Chunk) {
        chunkMap[chunk.chunkKey] = chunk
    }

    override fun loadChunk(x: Int, z: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadChunk(x: Int, z: Int, generate: Boolean): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addPluginChunkTicket(x: Int, z: Int, plugin: Plugin): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setMonsterSpawnLimit(limit: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMonsterSpawnLimit(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removePluginChunkTickets(plugin: Plugin) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isGameRule(rule: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setTicksPerMonsterSpawns(ticksPerMonsterSpawns: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun rayTraceBlocks(start: Location, direction: Vector, maxDistance: Double): RayTraceResult? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun rayTraceBlocks(
        start: Location,
        direction: Vector,
        maxDistance: Double,
        fluidCollisionMode: FluidCollisionMode
    ): RayTraceResult? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun rayTraceBlocks(
        start: Location,
        direction: Vector,
        maxDistance: Double,
        fluidCollisionMode: FluidCollisionMode,
        ignorePassableBlocks: Boolean
    ): RayTraceResult? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun save() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getViewDistance(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getEmptyChunkSnapshot(
        x: Int,
        z: Int,
        includeBiome: Boolean,
        includeBiomeTemp: Boolean
    ): ChunkSnapshot {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getUID(): UUID {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getChunkAt(x: Int, z: Int): Chunk = chunkMap.getOrPut((x to z).asLong) { CraftChunk(this,x,z) }

    override fun getChunkAt(location: Location): Chunk = getChunkAt(location.blockX.shr(4),location.blockZ.shr(4))

    override fun getChunkAt(block: Block): Chunk = getChunkAt(block.x.shr(4),block.z.shr(4))

    override fun getWorldBorder(): WorldBorder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getEntity(uuid: UUID): Entity? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAmbientSpawnLimit(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dropItem(location: Location, item: ItemStack): Item {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unloadChunk(chunk: Chunk): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unloadChunk(x: Int, z: Int): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unloadChunk(x: Int, z: Int, save: Boolean): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isChunkForceLoaded(x: Int, z: Int): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hasStorm(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setWeatherDuration(duration: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMaxHeight(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getKeepSpawnInMemory(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun spawnParticle(particle: Particle, location: Location, count: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun spawnParticle(particle: Particle, x: Double, y: Double, z: Double, count: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> spawnParticle(particle: Particle, location: Location, count: Int, data: T?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> spawnParticle(particle: Particle, x: Double, y: Double, z: Double, count: Int, data: T?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun spawnParticle(
        particle: Particle,
        location: Location,
        count: Int,
        offsetX: Double,
        offsetY: Double,
        offsetZ: Double
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun spawnParticle(
        particle: Particle,
        x: Double,
        y: Double,
        z: Double,
        count: Int,
        offsetX: Double,
        offsetY: Double,
        offsetZ: Double
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> spawnParticle(
        particle: Particle,
        location: Location,
        count: Int,
        offsetX: Double,
        offsetY: Double,
        offsetZ: Double,
        data: T?
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> spawnParticle(
        particle: Particle,
        x: Double,
        y: Double,
        z: Double,
        count: Int,
        offsetX: Double,
        offsetY: Double,
        offsetZ: Double,
        data: T?
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun spawnParticle(
        particle: Particle,
        location: Location,
        count: Int,
        offsetX: Double,
        offsetY: Double,
        offsetZ: Double,
        extra: Double
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun spawnParticle(
        particle: Particle,
        x: Double,
        y: Double,
        z: Double,
        count: Int,
        offsetX: Double,
        offsetY: Double,
        offsetZ: Double,
        extra: Double
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> spawnParticle(
        particle: Particle,
        location: Location,
        count: Int,
        offsetX: Double,
        offsetY: Double,
        offsetZ: Double,
        extra: Double,
        data: T?
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> spawnParticle(
        particle: Particle,
        receivers: MutableList<Player>?,
        source: Player?,
        x: Double,
        y: Double,
        z: Double,
        count: Int,
        offsetX: Double,
        offsetY: Double,
        offsetZ: Double,
        extra: Double,
        data: T?,
        force: Boolean
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> spawnParticle(
        particle: Particle,
        location: Location,
        count: Int,
        offsetX: Double,
        offsetY: Double,
        offsetZ: Double,
        extra: Double,
        data: T?,
        force: Boolean
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> spawnParticle(
        particle: Particle,
        x: Double,
        y: Double,
        z: Double,
        count: Int,
        offsetX: Double,
        offsetY: Double,
        offsetZ: Double,
        extra: Double,
        data: T?,
        force: Boolean
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getWaterAnimalSpawnLimit(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun spawnArrow(location: Location, direction: Vector, speed: Float, spread: Float): Arrow {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : AbstractArrow?> spawnArrow(
        location: Location,
        direction: Vector,
        speed: Float,
        spread: Float,
        clazz: Class<T>
    ): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getWeatherDuration(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSeaLevel(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setSpawnFlags(allowMonsters: Boolean, allowAnimals: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLivingEntities(): MutableList<LivingEntity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getName(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> setGameRule(rule: GameRule<T>, newValue: T): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLoadedChunks(): Array<Chunk> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRaids(): MutableList<Raid> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun canGenerateStructures(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeMetadata(metadataKey: String, owningPlugin: Plugin) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unloadChunkRequest(x: Int, z: Int): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun strikeLightningEffect(loc: Location): LightningStrike {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isDayTime(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createExplosion(x: Double, y: Double, z: Double, power: Float): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createExplosion(x: Double, y: Double, z: Double, power: Float, setFire: Boolean): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createExplosion(
        x: Double,
        y: Double,
        z: Double,
        power: Float,
        setFire: Boolean,
        breakBlocks: Boolean
    ): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createExplosion(
        x: Double,
        y: Double,
        z: Double,
        power: Float,
        setFire: Boolean,
        breakBlocks: Boolean,
        source: Entity?
    ): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createExplosion(loc: Location, power: Float): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createExplosion(loc: Location, power: Float, setFire: Boolean): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createExplosion(
        source: Entity?,
        loc: Location,
        power: Float,
        setFire: Boolean,
        breakBlocks: Boolean
    ): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createExplosion(loc: Location, power: Float, setFire: Boolean, breakBlocks: Boolean): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createExplosion(
        loc: Location,
        power: Float,
        setFire: Boolean,
        breakBlocks: Boolean,
        source: Entity?
    ): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setPVP(pvp: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun refreshChunk(x: Int, z: Int): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSeed(): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPlayers(): MutableList<Player> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun rayTraceEntities(start: Location, direction: Vector, maxDistance: Double): RayTraceResult? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun rayTraceEntities(
        start: Location,
        direction: Vector,
        maxDistance: Double,
        raySize: Double
    ): RayTraceResult? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun rayTraceEntities(
        start: Location,
        direction: Vector,
        maxDistance: Double,
        filter: Predicate<Entity>?
    ): RayTraceResult? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun rayTraceEntities(
        start: Location,
        direction: Vector,
        maxDistance: Double,
        raySize: Double,
        filter: Predicate<Entity>?
    ): RayTraceResult? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTemperature(x: Int, z: Int): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getEntitiesByClasses(vararg classes: Class<*>?): MutableCollection<Entity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPlayerCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPopulators(): MutableList<BlockPopulator> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBiome(x: Int, z: Int, bio: Biome) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setChunkForceLoaded(x: Int, z: Int, forced: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun strikeLightning(loc: Location): LightningStrike {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun locateNearestStructure(
        origin: Location,
        structureType: StructureType,
        radius: Int,
        findUnexplored: Boolean
    ): Location? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTileEntityCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBlockAt(x: Int, y: Int, z: Int): Block {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBlockAt(location: Location): Block = location.chunk.getBlock(location.blockX,location.blockY,location.blockZ)

    override fun getEntities(): MutableList<Entity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllowMonsters(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hasMetadata(metadataKey: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun generateTree(location: Location, type: TreeType): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun generateTree(loc: Location, type: TreeType, delegate: BlockChangeDelegate): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getEnvironment(): World.Environment {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun playEffect(location: Location, effect: Effect, data: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun playEffect(location: Location, effect: Effect, data: Int, radius: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> playEffect(location: Location, effect: Effect, data: T?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> playEffect(location: Location, effect: Effect, data: T?, radius: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> getGameRuleDefault(rule: GameRule<T>): T? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setAmbientSpawnLimit(limit: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getGenerator(): ChunkGenerator? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setThundering(thundering: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHumidity(x: Int, z: Int): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}