package kotlinUtils

import kotlin.math.sqrt
import kotlin.math.pow

class UtilsFunctions {
    fun kotlinIntParser(value: String): Int = value.toInt()
    fun kotlinDoubleParser(value: String): Double = value.toDouble()
    fun kotlinStraight(a: String, b: String, c: String, x: String, y: String): Double {
        return ((a.toDouble() * x.toDouble()) + (b.toDouble() * y.toDouble()) + c.toDouble()) / (kotlinStraightSquare(a.toDouble(), b.toDouble()))
    }
    private fun kotlinStraightSquare(a: Double, b: Double): Double = sqrt((a.pow(2) + b.pow(2)))
}