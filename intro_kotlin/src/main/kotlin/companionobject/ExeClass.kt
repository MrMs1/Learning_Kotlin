package intro_kotlin.src.main.kotlin.companionobject

fun main() {

    // コンパニオンオブジェクト
    // クラスから直接呼び出せるが、インスタンスからは呼び出せない
    SampleClass.showCount()
    val sample = SampleClass("name", 10)
    SampleClass.showCount()

}