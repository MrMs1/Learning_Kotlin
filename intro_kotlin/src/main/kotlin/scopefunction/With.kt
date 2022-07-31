package scopefunction

fun main(){
    /* スコープ関数
        with
        public inline fun <T, R> with(receiver: T, block: T.() -> R): R {
        ・拡張関数ではない
        ・第一引数に任意の型
        ・第二引数は、第一引数をレシーバとするメソッド
        ・特定のインスタンスに対する複数の操作をする時に使用
     */
    val s = with("hoge") {// thisは省略可能
        println(this.uppercase())
        println(this.lowercase())
        this
    }
    println(s) //=> HOGE
}