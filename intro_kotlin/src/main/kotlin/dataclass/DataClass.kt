package intro_kotlin.src.main.kotlin.dataclass

fun main() {

    /*
    * データクラス
    *  メソッドを持つことはできない
    *  プライマリコンストラクタに設定した変数に対して
    *  equals,toString,copy,componentN,hashCodeが設定される
    * */
    val f1 = Fruits("りんご", 100)
    val f2 = Fruits("りんご", 100)

    f1.area = "青森"
    f2.area = "長崎"

    println(f1)
    println(f1 == f2)

    val f3 = f1.copy(name = "トマト")
    println(f3)

    println(f2.component1())

    val (name, price) = f1
    println(name)
    println(price)
}