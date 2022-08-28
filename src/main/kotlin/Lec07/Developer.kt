package Lec07

abstract class Developer {

    abstract var age: Int

    abstract fun code(language: String)
}

class BackendDeveloper(
    override var age: Int = 0
) : Developer() {

    override fun code(language: String) {
        println("I code with $language")
    }
}

fun main() {
    val backendDeveloper = BackendDeveloper(20)
    println(backendDeveloper.age)
    backendDeveloper.code("Kotlin")
}