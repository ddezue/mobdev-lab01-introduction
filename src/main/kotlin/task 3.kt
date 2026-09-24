fun task3() {
    val a = (0..10).random()
    println("Программа загадала число от 0 до 10. Попробуйте угадать:")

    while (true) {
        val b = readln().toInt()
        when {
            b > a -> println("Много")
            b < a -> println("Мало")
            else -> {
                println("Угадал")
                break
            }
        }
    }
}