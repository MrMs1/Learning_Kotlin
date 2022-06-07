package intro_kotlin.src.main.kotlin.companionobject

class SampleClass(name: String, hp: Int) {

    init {
        count++
    }

    companion object {
        var count = 0
        fun showCount() {
            println(count)
        }
    }
}