package intro_kotlin.src.main.kotlin.inheritance

// オブジェクト宣言
// シングルトンのインスタンスとして扱われるため、コンストラクタは作成できない
object AppInfo {
    var name: String = "GAME"

    fun display() {
        println(name)
    }
}