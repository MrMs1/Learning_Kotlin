fun main() {
    val (sum, max) = sumMax(1, 2, 3, 4, 5)
    println(sum)
    println(max)

    val (sum2, _) = sumMax(1, 2, 3, 4, 5)
    println(sum2)

    val pair: Pair<Int, Int> = sumMax(1, 2, 3, 4, 5)
    println(pair)
    println(pair.first)
    println(pair.second)
    // Tripleで3つも可能
}

fun sumMax(vararg array: Int): Pair<Int, Int> {
    var sum = 0
    var max = 0

    for (num in array) {
        sum += num
        if (max < num) {
            max = num
        }
    }
    return Pair(sum, max)
}