import kotlin.math.sqrt

fun sqr(number: Double): Double = number * number

fun discriminant(a: Double, b: Double, c: Double): Double = sqr(b) - 4 * a * c

fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val d = discriminant(a, b, c)
    return when {
        d > 0 -> 2
        d == 0.0 -> 1
        else -> 0
    }
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    val d = discriminant(a, b, c)
    when (rootsNumber(a, b, c)) {
        2 -> {
            val firstRoot = (-b + sqrt(d)) / (2 * a)
            val secondRoot = (-b - sqrt(d)) / (2 * a)
            println("Two roots: x1 = $firstRoot, x2 = $secondRoot")
        }
        1 -> {
            val onlyRoot = -b / (2 * a)
            println("One root: x = $onlyRoot")
        }
        else -> println("No roots (D < 0)")
    }
}

fun task7() {
    println("Enter coefficients a, b, c (each on a new line):")
    val a = readln().toDoubleOrNull() ?: return
    val b = readln().toDoubleOrNull() ?: return
    val c = readln().toDoubleOrNull() ?: return

    if (a == 0.0) {
        println("This is not a quadratic equation (a = 0)")
        return
    }
    quadraticRoot(a, b, c)
}