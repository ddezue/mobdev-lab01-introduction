fun main() {
    while (true) {
        println("=== Menu ===")
        println("1  - Sum of first and last digit")
        println("2  - Input numbers until 0")
        println("3  - Guess the number")
        println("4  - First n prime numbers")
        println("5  - Array elements greater than neighbors")
        println("6  - Product, min, max of array")
        println("7  - Quadratic equation")
        println("8  - Class with an array")
        println("9  - Vector class (3D)")
        println("10 - Vehicle hierarchy")
        println("0  - Exit")
        print("Your choice: ")

        when (readln().toIntOrNull()) {
            1 -> task1()
            2 -> task2()
            3 -> task3()
            4 -> task4()
            5 -> task5()
            6 -> task6()
            7 -> task7()
            8 -> task8()
            9 -> task9()
            10 -> task10()
            0 -> {
                println("Exiting the program.")
                return
            }
            else -> println("Invalid input. Try again.\n")
        }
        println()
    }
}