package scopefunction

fun main() {
    /*
     スコープ関数
      also
      public inline fun <T> T.apply(block: T.() -> Unit): T {
      ・applyとほぼ同じ
      ・applyと違う点は、引数がレシーバの拡張関数ではなく、レシーバを引数に取る関数であること
      ・2つの利点があり、
      ・1.レシーバオブジェクトを名前をつけて扱える
      ・2.ラムダ式の内と外でthisの意味が変わらない
     */
    data class MyObject(
        var id: String,
        var name: String
    )

    val myObject = MyObject("1", "name").also { obj ->
        obj.id = "2"
        obj.name = "name2"
        // letだとここでobjを記載する必要がある
    }
    println(myObject.toString())
}