package one.xjcyan1de.cyanbot.pathfinding

import org.bukkit.Location

class PathPoint(
    // текущая точка
    var point: Location,
    // расстояние от старта
    var pathLengthFromStart: Double = 0.0,
    // примерное расстояние до цели
    var heuristicEstimatePathLength: Double = 0.0,
    // способ движения
    var moveAction: MoveAction = MoveAction.WALK,
    // точка из которой пришли сюда
    var cameFrom: PathPoint? = null
) {
    // еврестическое расстояние до цели
    val estimateFullPathLength: Double
        get() = heuristicEstimatePathLength+pathLengthFromStart

}