class ArrayProcessor(private val numbers: IntArray) {

    fun sumPositive(): Int {
        var sum = 0
        for (element in numbers) if (element > 0) sum += element
        return sum
    }

    fun product(): Long {
        var result = 1L
        for (element in numbers) result *= element
        return result
    }

    fun average(): Double {
        if (numbers.isEmpty()) return 0.0
        return numbers.sum().toDouble() / numbers.size
    }
}

fun task8() {
    val numbers = intArrayOf(1, -2, 3, -4, 5)
    println("Array: ${numbers.joinToString()}")

    val processor = ArrayProcessor(numbers)
    println("Sum of positive:${processor.sumPositive()}")
    println("Product: ${processor.product()}")
    println("Average: ${processor.average()}")
}