class SampleClass(
    var name: String = "default name",
    var hp: Int = 10
) {// プライマリコンストラクタ コンストラクタ内でデフォルト値の設定が可能

    constructor(name: String) : this(name, 50) // セカンダリコンストラクタ
}