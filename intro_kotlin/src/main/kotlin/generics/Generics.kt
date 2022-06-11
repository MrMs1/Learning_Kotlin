package intro_kotlin.src.main.kotlin.generics

// T:Typeの略
// E:Elementの略
class Generics<T>(var value: T) {
    fun display() {
        println(value)
    }
}