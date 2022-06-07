package intro_kotlin.src.main.kotlin.enumobject

fun main() {
    // enum
    val day: Week = Week.Sun
    println(day.value)

    if (day == Week.Sun) {
        println("Sunday")
    }

    when (day) {
        Week.Sun -> println(true)
    }

    // シールドクラス
    var s: Status = Status.Enable
    s = Status.Error("error")
}