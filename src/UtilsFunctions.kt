package kotlinUtils

import kotlin.math.sqrt
import kotlin.math.pow

class UtilsFunctions {
    fun kotlinIntParser(value: String): Int = value.toInt()
    fun kotlinStraight(a: Double, b: Double, c: Int, x: Int, y: Int) = (a * x) + (b * y) + c / kotlinStraightSquare(a, b)
    private fun kotlinStraightSquare(a: Double, b: Double): Double = sqrt((a.pow(2) + b.pow(2)))
}