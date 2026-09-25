fun task6() {
    val numbers = intArrayOf(2, 5, 3, 8, 1, 4)
    println("Array: ${numbers.joinToString()}")

    var productFor = 1L
    var minFor = numbers[0]
    var maxFor = numbers[0]
    for (element in numbers) {
        productFor *= element
        if (element < minFor) minFor = element
        if (element > maxFor) maxFor = element
    }
    println("for: product=$productFor, min=$minFor, max=$maxFor")

    var productWhile = 1L
    var minWhile = numbers[0]
    var maxWhile = numbers[0]
    var index = 0
    while (index < numbers.size) {
        productWhile *= numbers[index]
        if (numbers[index] < minWhile) minWhile = numbers[index]
        if (numbers[index] > maxWhile) maxWhile = numbers[index]
        ++index
    }
    println("while: product=$productWhile, min=$minWhile, max=$maxWhile")

    var productEach = 1L
    var minEach = Int.MAX_VALUE
    var maxEach = Int.MIN_VALUE
    numbers.forEach { element ->
        productEach *= element
        if (element < minEach) minEach = element
        if (element > maxEach) maxEach = element
    }
    println("forEach:  product=$productEach, min=$minEach, max=$maxEach")

    val productReduce = numbers.reduce { accumulator, element -> accumulator * element }
    println("reduce(): product=$productReduce")

    println("min()/max(): min=${numbers.min()}, max=${numbers.max()}")
}