package intro_kotlin.src.main.kotlin.abstractclass

abstract class ParentClass(val name: String, val hp: Int) { // abstractで抽象クラス

    abstract fun showStatus()   // abstractで抽象メソッドにする。抽象クラス出なければ抽象メソッドは記載できない。

}