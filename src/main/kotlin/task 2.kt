fun task2() {
    var count = 0
    var sum = 0.0
    println("Enter numbers (0 to finish):")

    while (true) {
        val number = readln().toDoubleOrNull() ?: continue
        if (number == 0.0) break
        ++count
        sum += number
    }

    println("Count: $count")
    println("Sum: $sum")
    if (count > 0) {
        println("Average: ${sum / count}")
    } else {
        println("No numbers were entered")
    }
}