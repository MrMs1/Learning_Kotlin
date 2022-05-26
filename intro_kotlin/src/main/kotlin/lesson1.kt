fun main(){
    // 変数
    var num = 10
    // 定数
    val str = "hello"   // 再代入不可
    println("$num")     // $で中身を表示可能
    println(num::class) // データ型の表示

    // 宣言時にデータ型の指定が可能
    // 整数
    val byte: Byte = 10   //  8 bit
    val short: Short = 10 // 16 bit
    val int: Int = 10     // 32 bit
    val long: Long = 10   // 64 bit
    val long2 = 10L

    // 少数
    val double: Double = 1.0 // 64 bit
    val float: Float = 1.0F  // 32 bit

    // 整数 符号なし
    val unsignedByte: UByte = 255U   //  8 bit

    // 進数表現
    val num16 = 0xF0
    val num2 = 0b1111_0000
    println(num16)
    println(num2)

    // 文字、文字列
    val string: String = "hello"
    val char: Char = 'c'

    // 真理値
    val boolean: Boolean = true

    // Any どの型でも代入できる
    var any: Any = 10
    any = "any"
}
