package Lec07

open class Dog {

    open var age: Int = 0

    open fun bark() {
        println("멍멍멍")
   }
}

open class Bulldog(
    override var age: Int = 0
) : Dog() {

    final override fun bark() {
        println("컹컹")
    }
}

class ChildBulldog : Bulldog() {
    override var age: Int = 0
}

fun main() {
    val dog = Bulldog(age = 2)
    println(dog.age)
    println(dog.bark())
}