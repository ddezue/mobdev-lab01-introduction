import kotlin.math.sqrt

class Vector(val x: Double, val y: Double, val z: Double) {

    fun length(): Double = sqrt(x * x + y * y + z * z)

    fun dot(other: Vector): Double = x * other.x + y * other.y + z * other.z

    infix fun scalar(other: Vector): Double = this.dot(other)

    operator fun times(other: Vector): Double = this.dot(other)

    override fun toString(): String = "Vector($x, $y, $z)"
}

fun scalarProduct(first: Vector, second: Vector): Double =
    first.x * second.x + first.y * second.y + first.z * second.z

fun task9() {
    val firstVector = Vector(1.0, 2.0, 3.0)
    val secondVector = Vector(3.0, 2.0, 1.0)

    println("v1 = $firstVector")
    println("v2 = $secondVector")
    println("Length of v1: ${firstVector.length()}")
    println("Method dot(): ${firstVector.dot(secondVector)}")
    println("Infix scalar: ${firstVector scalar secondVector}")
    println("Operator *: ${firstVector * secondVector}")
    println("External function: ${scalarProduct(firstVector, secondVector)}")
}