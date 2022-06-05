package intro_kotlin.src.main.kotlin.inheritance

// 継承
// プライマリコンストラクタを使用する場合の記載方法
class ChildClass(name: String, hp: Int, var atk: Int) : ParentClass(name, hp) {

    // セカンダリコンストラクタを使用する記載方法
    /*
    class ChildClass: ParentClass{
        constructor(name: String, hp: Int, atk: Int) : super(name, hp) {
            this.atk = atk
        }
    }
    */

    override fun showStatus() { // overrideで親クラスのメソッドをオーバーライド
        super.showStatus()
        println(atk)
    }
}