fun main() {
    // 高階関数:引数や戻り値に関数を指定
    val func = ::calcA
    println(func(10, 5))
    val n1 = calcB(5, 10, ::calcA)
    println("n1 = $n1")

    // ラムダ式
    val n2 = calcB(5, 10, { x: Int, y: Int -> x + y }) // これを
    val n3 = calcB(5, 10) { x: Int, y: Int -> x + y }  // こうできる
    println(n3)

    // it
    val num = funcB(1, ::funcA)
    println(num)
    val num2 = funcB(1) { x: Int -> x + 1 }
    val num3 = funcB(1) { it + 1 }          // itを使用して省略できる
    println(num3)

    // 無名関数
    val num4 = calcB(5, 10, fun(x: Int, y: Int): Int = x + y) // ラムダ式とは違い引数の型を指定できる
}

fun calcA(a: Int, b: Int) = a + b
fun calcB(a: Int, b: Int, func: (Int, Int) -> Int) = func(a, b)

fun funcA(a: Int) = a + 1
fun funcB(a: Int, func: (Int) -> (Int)) = func(a)