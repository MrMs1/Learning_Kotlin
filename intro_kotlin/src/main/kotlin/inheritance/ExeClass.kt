package intro_kotlin.src.main.kotlin.inheritance

fun main() {
    val child = ChildClass("name", 10, 50)
    child.showStatus()

    // キャスト
    // アップキャスト
    val parent = child as ParentClass
    // ダウンキャスト
    val child2 = parent as ChildClass
    // スマートキャスト
    if (parent is ChildClass) {
        parent.showStatus()
    }
}