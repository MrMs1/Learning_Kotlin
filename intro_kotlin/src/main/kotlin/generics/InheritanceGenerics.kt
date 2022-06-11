package intro_kotlin.src.main.kotlin.generics

import intro_kotlin.src.main.kotlin.interfaceexample.ParentClass

class InheritanceGenerics<T : ParentClass>(var value: T) {
    fun display() {
        value.showStatus()
    }
}