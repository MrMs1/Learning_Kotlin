fun main() {

    // 関数
    val str = message("hello")
    println(str)

    message2()

    // 可変長引数
    println(union(1, 2, 3, 4, 5))

    val intArray = intArrayOf(1, 2, 3)
    // スプレッド演算子
    println(union(*intArray))
}

fun message(str: String): String {
    return "message = $str"
}

fun message2() = "hello" //returnのみの関数はこのように簡略化できる


fun union(vararg array: Int): String {

    var str = ""

    for (num in array) {
        str += num
    }
    return str
}