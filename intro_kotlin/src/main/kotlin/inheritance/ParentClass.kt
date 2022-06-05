package intro_kotlin.src.main.kotlin.inheritance

open class ParentClass(val name: String, val hp: Int) { // openで継承可能にする

    open fun showStatus() {  // openでオーバーライド可能にする
        println(name)
        println(hp)
    }
}