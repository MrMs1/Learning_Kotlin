fun main() {

    // nullについて
    val str: String? = null
    println(str?.length)
    println(str ?: "".length) // エルビス演算子

    // null許容型から非許容型への変換
    val list: MutableList<Int> = mutableListOf(10, 20, 30)
    val num: Int? = list.minOrNull()

    // スマートキャスト
    if (num != null) {
        println(num * 2)
    }

    // !!
    val num2: Int = num!!
    println(num2 * 2) // numがnullの場合、エラーになる
}