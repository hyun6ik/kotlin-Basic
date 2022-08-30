package Lec20

fun main() {

    val list = mutableListOf(printHello)
    list[0]()

    call(printHello)
    printMessage("안녕하세요")

    val list2 = listOf("a", "b", "c")
    val printStr: (String) -> Unit = { println(it)}
    forEachStr(list2, printStr)

    outerFunc()()

    val numberList = listOf("1", "2", "3")
    numberList
        .map(String::toInt)
        .forEach(::println)
}

val callReference = ::printHello

val sum: (Int, Int) -> Int = { x:Int, y:Int -> x + y }

val sum2 = {x: Int, y: Int -> x + y}

fun outerFunc(): () -> Unit {
    return {
        println("이것은 익명함수!")
    }
}

fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for (item in collection) {
        action(item)
    }
}

val printMessage: (String) -> Unit = { message: String -> println(message)}

val printMessage2: (String) -> Unit = {message -> println(message)}

val printMessage3: (String) -> Unit = { println(it)}

val plus: (Int, Int) -> Int = {a, b -> a + b}

val printHello: () -> Unit = { println("Hello")}

// 함수를 인자로 받아 실행하는 함수
fun call(block: () -> Unit) {
    block()
}

val func: () -> Unit = {}

fun printNo() = println("No")
