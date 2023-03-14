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
    fun kotlinCircleRadius(s: String, a: String, pi: Double): Double {
        return sqrt((360.0 * s.toDouble()) / (a.toDouble() * pi) )
    }
    fun kotlinWeightedAverage(notesWeight: DoubleArray, notes: Array<String>): Double {
        var total = 0.0
        for((index, item) in notes.withIndex()){
            total += item.toDouble() * notesWeight[index]
        }
        return (total / notesWeight.sum())
    }
    fun kotlinSecondsToMinutesAndHours(valueInSeconds: String): String {
        val hours = valueInSeconds.toDouble() / 3600.0
        val minutes = valueInSeconds.toDouble() % 3600.0 / 60.0
        val seconds = valueInSeconds.toDouble() % 3600 % 60 % 60
        return "Horas: ${hours.toInt()},\n Minutos: ${minutes.toInt()}, \n Segundos: ${seconds.toInt()}"
    }
}