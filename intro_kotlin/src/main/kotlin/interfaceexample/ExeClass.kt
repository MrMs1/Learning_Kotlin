package intro_kotlin.src.main.kotlin.interfaceexample

fun main() {
    // インターフェースは多重実装可能
    val child = ChildClass("name", 10, 50, 20)
    child.healing()
}