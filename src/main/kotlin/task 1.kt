fun task1() {
    println("Enter a positive integer:")
    val input = readln()

    if (input.isEmpty() || !input.all { it.isDigit() }) {
        println("Invalid input.")
        return
    }

    val number = input.toInt()

    val sumStr = input.first().digitToInt() + input.last().digitToInt()
    println("Method 1 (strings): $sumStr")

    val lastDigit = number % 10
    var firstDigit = number
    while (firstDigit >= 10) {
        firstDigit /= 10
    }
    println("Method 2 (arithmetic): ${firstDigit + lastDigit}")
}