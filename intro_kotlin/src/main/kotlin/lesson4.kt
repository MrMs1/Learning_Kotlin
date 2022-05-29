fun main() {
    // 範囲演算子
    // in : 対象が含まれているか
    val n1 = 10
    val n2 = 20
    val array = arrayOf(n1, n2)
    println(15 in n1..n2)
    println(15 !in n1..n2)
    println(15 in array)
    println("B" in "ABC")
}