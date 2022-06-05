package intro_kotlin.src.main.kotlin

class SetterGetter {

    var name: String                    // varの場合、セッターゲッターが暗黙的に設定されている。valはゲッターのみ。
        set(value) {                    // 明示的にセッター（ゲッター）の内容を変更することが可能
            field = if (value == "") {  // fieldをnameにしてしまうとセッターの再帰呼び出しになり、実行時にエラーとなる
                println("name is brank")
                "noname"
            } else {
                value
            }
            /*    if (value == "") {  直接代入しない場合の記載方法
                    println("name is brank")
                    field = "noname"
                } else {
                    field = value
                }*/
        }

    constructor(name: String) {
        this.name = name
    }
}