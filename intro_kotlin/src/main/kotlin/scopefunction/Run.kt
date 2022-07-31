package scopefunction

fun main(){
    /*
    * スコープ関数
    *  run
    * public inline fun <T, R> T.run(block: T.() -> R): R {
    * ・任意の型の拡張関数
    * ・任意の型をレシーバとする関数が引数
    * ・letとwithを合わせたようなもの
    * ・nullableなオブジェクトに対して複数の処理をする時に使用
    * */
    val foo = "foo";
    foo?.run{
        println(this.uppercase())
        println(this.lowercase())
    }

}