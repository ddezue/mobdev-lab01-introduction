fun task1() {
    println("Введите целое положительное число:")
    val input = readln()
    val number = input.toInt()

    // Через арифметику
    val lastDigit = number % 10
    var temp = number
    while (temp >= 10) temp /= 10
    val firstDigit = temp
    println("Способ 1 (арифметика): ${firstDigit + lastDigit}")

    // Через строки
    val firstChar = input.first().digitToInt()
    val lastChar = input.last().digitToInt()
    println("Способ 2 (строки): ${firstChar + lastChar}")
}