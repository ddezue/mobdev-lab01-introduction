fun task3() {
    val hiddenNumber = (0..10).random()
    println("The program has picked a number from 0 to 10. Try to guess:")

    while (true) {
        val guess = readln().toIntOrNull() ?: continue
        when {
            guess > hiddenNumber -> println("Too much")
            guess < hiddenNumber -> println("Too little")
            else -> {
                println("Guessed")
                break
            }
        }
    }
}