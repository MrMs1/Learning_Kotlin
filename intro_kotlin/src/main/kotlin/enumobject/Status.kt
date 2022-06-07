package intro_kotlin.src.main.kotlin.enumobject

// シールドクラス
//　シールドクラス内のクラス、同一ファイルの別クラスからのみ継承できる
sealed class Status {
    object Enable : Status()
    object Disable : Status()
    class Error(val str: String) : Status()
}

// enumの拡張ができたり
enum class StatusTest {
    Enable,
    Disable,
    Error
}
