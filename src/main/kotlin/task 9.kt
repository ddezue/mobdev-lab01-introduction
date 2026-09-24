import kotlin.math.sqrt

class Vector(val x: Double, val y: Double, val z: Double) {

    // Длина вектора
    fun length(): Double = sqrt(x * x + y * y + z * z)

    // Скалярное произведение (обычный метод)
    fun dotProduct(other: Vector): Double = x * other.x + y * other.y + z * other.z

    // Инфиксная запись
    infix fun dot(other: Vector): Double = dotProduct(other)

    // Перегрузка оператора *
    operator fun times(other: Vector): Double = dotProduct(other)

    override fun toString(): String = "Vector($x, $y, $z)"
}

// Внешняя функция скалярного произведения
private fun scalarProduct(v1: Vector, v2: Vector): Double =
    v1.x * v2.x + v1.y * v2.y + v1.z * v2.z

fun task9() {
    val v1 = Vector(1.0, 2.0, 3.0)
    val v2 = Vector(3.0, 2.0, 1.0)

    println("v1 = $v1")
    println("v2 = $v2")
    println("Длина v1: ${v1.length()}")
    println("Скалярное произведение (метод):   ${v1.dotProduct(v2)}")
    println("Скалярное произведение (infix):   ${v1 dot v2}")
    println("Скалярное произведение (оператор *): ${v1 * v2}")
    println("Скалярное произведение (внешняя функция): ${scalarProduct(v1, v2)}")
}