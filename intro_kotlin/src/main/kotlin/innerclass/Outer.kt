package intro_kotlin.src.main.kotlin.innerclass

import javax.swing.JSpinner

class Outer(val num: Int) {
    lateinit var obj: Inner

    inner class Inner(val num: Int) {
        fun display() {
            // 外側のクラスのプロパティにアクセスする
            println("@Outer = ${this@Outer.num}")
            println("Inner = $num")
        }

    }
}