class ArrayProcessor(private val array: IntArray) {

    fun sumPositive(): Int {
        var sum = 0
        for (element in array) {
            if (element > 0) sum += element
        }
        return sum
    }

    fun product(): Long {
        var product = 1L
        for (element in array) {
            product *= element
        }
        return product
    }

    fun average(): Double {
        if (array.isEmpty()) return 0.0
        return array.sum().toDouble() / array.size
    }
}

fun task8() {
    val processor = ArrayProcessor(intArrayOf(1, -2, 3, 4, -5, 6))
    println("Сумма положительных: ${processor.sumPositive()}")
    println("Произведение: ${processor.product()}")
    println("Среднее арифметическое: ${processor.average()}")
}