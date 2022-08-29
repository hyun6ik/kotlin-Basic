package Lec16

class LateInit {

    lateinit var text: String

    fun printText() {
        text = "안녕하세요"

        if (this::text.isInitialized) {
            println("초기화됨")
            return
        }
        println(text)
    }
}

fun main() {
    val test = LateInit()
    test.printText()
}