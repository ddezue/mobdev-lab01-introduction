private fun isPrime(number: Int): Boolean {
    if (number < 2) return false
    var divisor = 2
    while (divisor * divisor <= number) {
        if (number % divisor == 0) return false
        ++divisor
    }
    return true
}

fun task4() {
    println("Enter the amount of prime numbers n:")
    val amount = readln().toIntOrNull() ?: return

    if (amount < 1) {
        println("n must be >= 1")
        return
    }

    var count = 0
    var candidate = 2
    while (count < amount) {
        if (isPrime(candidate)) {
            ++count
            val suffix = when {
                count % 10 == 1 && count % 100 != 11 -> "st"
                count % 10 == 2 && count % 100 != 12 -> "nd"
                count % 10 == 3 && count % 100 != 13 -> "rd"
                else -> "th"
            }
            println("$count-$suffix number: $candidate")
        }
        ++candidate
    }
}