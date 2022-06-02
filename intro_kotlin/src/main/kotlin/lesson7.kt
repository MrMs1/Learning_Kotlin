fun main() {
    val num = calcSquareArea(10, 20)
    println(num)
    val num2 = calcSquareArea(10) // この引数の渡し方ではheightにのみデフォルト引数が設定されている場合はエラーになる
    println(num2)
    println(calcSquareArea(height = 10)) // 名前付き引数
}

fun calcSquareArea(height: Int, width: Int = 5) = height * width