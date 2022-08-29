package Lec12

import java.time.LocalDateTime

object Singleton {

    val a = 1234

    fun printA() = println(a)
}

fun main() {
    println(Singleton.a)
    Singleton.printA()

    println(DatetimeUtils.DEFAULT_FORMAT)

    val now = DatetimeUtils.now
    println(DatetimeUtils.same(now, now))
}

object DatetimeUtils {

    val now: LocalDateTime
        get() = LocalDateTime.now()

    const val DEFAULT_FORMAT = "YYYY-MM-DD"

    fun same(a: LocalDateTime, b: LocalDateTime): Boolean {
        return a == b
    }
}
