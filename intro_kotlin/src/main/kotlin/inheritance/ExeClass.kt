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


    //　オブジェクト式 一時的なサブクラスを作成し、変数へ代入できる
    val tempChild = object : ParentClass("temp", 10) {
        override fun showStatus() {
            println("temp")
        }
    }
    tempChild.showStatus()

    // オブジェクト宣言のインスタンスを使用
    AppInfo.display()
    AppInfo.name = "GAME OVER"
    AppInfo.display()

}