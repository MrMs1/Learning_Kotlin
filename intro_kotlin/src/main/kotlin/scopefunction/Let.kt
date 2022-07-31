package scopefunction

import java.util.*

fun main() {
    /*
     スコープ関数
      let
      public inline fun <T, R> T.let(block: (T) -> R): R {
      ・任意の型の拡張関数
      ・引数は関数
      ・nullableな変数に対して使用
     */
    val s = "hoge".let { it.uppercase() }
    println(s) //=> HOGE

    // nullableな変数に対しての使用例
    fun upperCase(str : String?) :String?{
        return str?.let { it.uppercase() }
    }
    // nullでない時は処理結果を返却、nullの時はnullを返却
    var foo: String? = "foo"
    println(upperCase(foo)) // FOO
    foo = null
    println(upperCase(foo)) // null
}