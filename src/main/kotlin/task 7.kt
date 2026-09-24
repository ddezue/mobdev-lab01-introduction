import kotlin.math.sqrt

private fun sqr(n: Double): Double = n * n

private fun discriminant(a: Double, b: Double, c: Double): Double = sqr(b) - 4 * a * c

private fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val d = discriminant(a, b, c)
    return when {
        d > 0 -> 2
        d == 0.0 -> 1
        else -> 0
    }
}

private fun quadraticRoot(a: Double, b: Double, c: Double) {
    val d = discriminant(a, b, c)
    when (rootsNumber(a, b, c)) {
        2 -> {
            val x1 = (-b + sqrt(d)) / (2 * a)
            val x2 = (-b - sqrt(d)) / (2 * a)
            println("Корни: x1 = $x1, x2 = $x2")
        }
        1 -> {
            val x = -b / (2 * a)
            println("Корень: x = $x")
        }
        else -> println("Корней нет")
    }
}

fun task7() {
    println("Введите коэффициенты a, b, c:")
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    quadraticRoot(a, b, c)
}