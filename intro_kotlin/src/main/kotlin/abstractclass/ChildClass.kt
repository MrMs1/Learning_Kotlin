package intro_kotlin.src.main.kotlin.abstractclass


class ChildClass(name: String, hp: Int, var atk: Int) : ParentClass(name, hp) {

    override fun showStatus() { // overrideで親クラスのメソッドをオーバーライド
        println(name)
        println(hp)
        println(atk)
    }
}