package intro_kotlin.src.main.kotlin.visibility

class ChildClass(name: String, hp: Int, var atk: Int) : ParentClass(name, hp) {

    public override fun showStatus() {
        super.showStatus()
        println(atk)
    }
}