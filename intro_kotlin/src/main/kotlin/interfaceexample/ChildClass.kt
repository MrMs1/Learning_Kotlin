package intro_kotlin.src.main.kotlin.interfaceexample


class ChildClass(name: String, hp: Int, var atk: Int, override var heal: Int) : ParentClass(name, hp), Heal {

    override fun showStatus() { // overrideで親クラスのメソッドをオーバーライド
        println(name)
        println(hp)
        println(atk)
    }

    override fun healing() {
        hp += heal
        println("$heal healing")
    }
}