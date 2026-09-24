import kotlin.math.sqrt

private fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

fun task4() {
    println("Введите количество простых чисел n:")
    val n = readln().toInt()

    var count = 0
    var candidate = 2

    while (count < n) {
        if (isPrime(candidate)) {
            count++
            val suffix = when {
                count % 10 == 1 && count % 100 != 11 -> "ое"
                count % 10 in 2..4 && (count % 100 !in 12..14) -> "е"
                else -> "ое"
            }
            println("$count-$suffix число: $candidate")
        }
        candidate++
    }
}