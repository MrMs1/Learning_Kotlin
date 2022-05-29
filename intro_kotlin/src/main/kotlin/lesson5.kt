fun main() {

    /*
    * if　条件分岐
    * */
    val num1 = 2
    // 値の返却が可能
    val str = if (num1 > 100) {
        "100 over"
    } else {
        // else句は必須
        "100 under"
    }
    println(str)


    /*
    * when 多岐分岐
    * */
    val num2 = 5

    when (num2) {
        5 -> println("5")
        6, 7 -> {
            // コードブロックでの記載も可
            println("6 or 7")
        }
        in 11..20 -> println("11~20") // inも使用可能
        else -> println("elseも使用可能")
    }

    // 値の返却が可能
    val str2 = when (num2) {
        5 -> "5"
        6, 7 -> {
            "6 or 7"
        }
        in 11..20 -> "11~20"
        else -> "else句は必須"
    }
    println(str2)

    // データ型の判定が簡単
    val num3: Any = 50
    when (num3) {
        is Int -> println("Int")
        is Double -> println("Double")
        is String -> println("String")
    }

    /*
    * while,do-whileはJavaと同じ
    * */

    /*
    * for
    * */
    // in,範囲演算子が使用可能
    println("in演算子")
    for (i in 0..10) {
        println("i = $i")
    }
    println("until使用時")
    for (i in 0 until 10) {
        println("i = $i")
    }
    println("カウントダウン")
    for (i in 10 downTo 0) {
        println("i = $i")
    }
    println("カウントダウン 変化量の指定あり")
    for (i in 10 downTo 0 step 2) {
        println("i = $i")
    }
}