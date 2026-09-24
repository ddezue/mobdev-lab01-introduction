fun task2() {
    var count = 0
    var sum = 0
    var number: Int

    println("Вводите числа (0 — завершение):")
    do {
        number = readln().toInt()
        if (number != 0) {
            count++
            sum += number
        }
    } while (number != 0)

    val average = if (count > 0) sum.toDouble() / count else 0.0
    println("Количество чисел: $count")
    println("Сумма: $sum")
    println("Среднее арифметическое: $average")
}