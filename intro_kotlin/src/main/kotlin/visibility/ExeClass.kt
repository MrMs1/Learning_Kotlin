package intro_kotlin.src.main.kotlin.visibility

fun main() {

    /*
    * 可視性
    *  internal : 同一モジュール内からアクセス可能
    *  public   : デフォルトの修飾子
    *  protected: 現在のクラス、サブクラスからアクセス可能
    *  private  : 現在のクラスのみ
    *
    * */
    val child = ChildClass("name", 10, 50)
    child.showStatus()
}