package intro_kotlin.src.main.kotlin.generics

import intro_kotlin.src.main.kotlin.interfaceexample.ChildClass
import intro_kotlin.src.main.kotlin.interfaceexample.ParentClass

fun main() {
    val str: Generics<String> = Generics<String>("aaa")
    str.display()
    val int: Generics<Int> = Generics(1)
    int.display()

    val p = InheritanceGenerics(ChildClass("name", 10, 50, 10))
    p.display()
}