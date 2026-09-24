fun main() {
    while (true) {
        println("\n===== МЕНЮ =====")
        println("1  - Сумма первой и последней цифры")
        println("2  - Ввод чисел до 0")
        println("3  - Угадай число")
        println("4  - N простых чисел")
        println("5  - Элементы больше соседних")
        println("6  - Произведение, min, max массива")
        println("7  - Квадратное уравнение")
        println("8  - Класс с массивом")
        println("9  - Класс Vector")
        println("10 - Наследование Vehicle")
        println("0  - Выход")
        print("Выберите задание: ")

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
                println("Выход из программы.")
                return
            }
            else -> println("Неверный выбор. Попробуйте снова.")
        }
    }
}