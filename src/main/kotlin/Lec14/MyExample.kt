package Lec14

class MyExample {
    fun message() = println("클래스 출력")
}

fun MyExample?.printNullOrNotNull() {
    if (this == null) {
        println("널인 경우에만 출력")
        return
    }
    println("널이 아닌 경우에만 출력")
}

fun main() {
    var myExample: MyExample? = null
    myExample.printNullOrNotNull()

    myExample = MyExample()
    myExample.printNullOrNotNull()
}