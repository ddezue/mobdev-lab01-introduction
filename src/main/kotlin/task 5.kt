fun task5() {
    val numbers = intArrayOf(1, 5, 3, 7, 2, 9, 4, 6, 8)
    println("Array: ${numbers.joinToString()}")

    println("Elements greater than their neighbors:")
    var found = false
    for (index in 1 until numbers.size - 1) {
        if (numbers[index] > numbers[index - 1] && numbers[index] > numbers[index + 1]) {
            println(numbers[index])
            found = true
        }
    }
    if (!found) println("No such elements")
}