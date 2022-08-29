package Lec16

class HelloBot(
) {
    val greeting: String by lazy {
        println("초기화 로직 수행")
        getHello()
    }

    fun sayHello() = println(greeting)
}

fun getHello() = "안녕하세요"

fun main() {
    val helloBot = HelloBot()

    helloBot.sayHello()
    helloBot.sayHello()
    helloBot.sayHello()
}