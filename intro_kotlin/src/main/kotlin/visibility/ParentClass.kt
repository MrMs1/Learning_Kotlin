package intro_kotlin.src.main.kotlin.visibility

open class ParentClass(val name: String, val hp: Int) { // openで継承可能にする

    protected open fun showStatus() {  // openでオーバーライド可能にする
        println(name)
        println(hp)
    }
}