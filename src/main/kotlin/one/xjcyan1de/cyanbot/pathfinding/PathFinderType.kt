package one.xjcyan1de.cyanbot.pathfinding

class PathFinderType(
    val walk: Boolean,
    val jump: Boolean,
    val fall: Boolean,
    val swim: Boolean,
    val maxFallDistance: Int,
    val jumpHeight: Int,
    val jumpDistance: Int
)  {
    companion object {
        val NORMAL = PathFinderType(
            walk = true,
            jump = true,
            fall = true,
            swim = false,
            maxFallDistance = 3,
            jumpHeight = 1,
            jumpDistance = 1
        )
    }
}