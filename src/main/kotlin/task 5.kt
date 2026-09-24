fun task5() {
    val array = intArrayOf(1, 5, 2, 8, 3, 9, 4, 7, 6)

    println("Массив: ${array.joinToString()}")
    println("Элементы, которые больше соседних:")
    for (i in 1 until array.size - 1) {
        if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
            println(array[i])
        }
    }
}