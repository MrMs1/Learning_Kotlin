package scopefunction

fun main() {
    /*
     スコープ関数
      apply
      public inline fun <T> T.apply(block: T.() -> Unit): T {
      ・withのレシーバを返したい時に使用する版
      ・withでは戻り値としてthisを明記するがapplyではレシーバを返却するため記載しなくても良い
      ・
     */
    val s = mutableListOf(10, 20, 30).apply {
        println(this)
        this[0] = 5
        this[1] -= 10
        this[2] *= 2
    }
    println(s)
}