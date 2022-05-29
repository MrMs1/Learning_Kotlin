fun main() {

    /*
    * 配列
    * */
    val array: Array<Int> = arrayOf(10, 20, 30)
    println(array[0])
    array.forEach { println(it) }

    val array2 = intArrayOf(10, 20)

    val array3 = arrayOfNulls<String?>(5)
    array3.forEach { println(it) }

    /*
    * コレクション
    * */
    val list = listOf(10, 20, 30) // 変更不可
    println(list[0])

    val list2 = mutableListOf(10, 20, 30) // 変更可
    list2[0] = 100
    println(list2[0])

    /*
    * セット
    * 順番の概念がなく、重複不可
    * */

    val set = mutableSetOf(10, 20)
    println(set)

    set.add(40)
    set.add(40) // エラーにならないが、重複追加されない
    println(set)

    /*
     * マップ
     * キーの重複は不可
     */
    val map = mapOf<String, String>(
        "apple" to "リンゴ",
        "melon" to "メロン"
    )
    println(map)
}