fun task6() {
    val array = intArrayOf(3, -2, 5, 1, -4, 7, 0)
    println("Массив: ${array.joinToString()}")

    // 1. Цикл for
    var productFor = 1
    var minFor = array[0]
    var maxFor = array[0]
    for (element in array) {
        productFor *= element
        if (element < minFor) minFor = element
        if (element > maxFor) maxFor = element
    }
    println("for:      произведение=$productFor, min=$minFor, max=$maxFor")

    // 2. Цикл while
    var productWhile = 1
    var minWhile = array[0]
    var maxWhile = array[0]
    var i = 0
    while (i < array.size) {
        productWhile *= array[i]
        if (array[i] < minWhile) minWhile = array[i]
        if (array[i] > maxWhile) maxWhile = array[i]
        i++
    }
    println("while:    произведение=$productWhile, min=$minWhile, max=$maxWhile")

    // 3. forEach
    var productForEach = 1
    var minForEach = array[0]
    var maxForEach = array[0]
    array.forEach { element ->
        productForEach *= element
        if (element < minForEach) minForEach = element
        if (element > maxForEach) maxForEach = element
    }
    println("forEach:  произведение=$productForEach, min=$minForEach, max=$maxForEach")

    // 4. reduce()
    val productReduce = array.reduce { acc, element -> acc * element }
    println("reduce(): произведение=$productReduce")

    // 5. min() и max()
    println("min()/max(): min=${array.min()}, max=${array.max()}")
}