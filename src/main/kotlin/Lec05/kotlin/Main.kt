package Lec05.kotlin

fun main() {
    Thread.sleep(1)

    try {
        throw Exception()
    } catch (e: Exception) {
        println("예외 발생")
    } finally {
        println("finally 실행")
    }

    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("예외 발생")
    }
    println(a)

    val b: String? = null
    val c = b ?: failFast("b is null")
    println(c.length)
}

fun failFast(message: String): Nothing {
    throw IllegalArgumentException(message)
}