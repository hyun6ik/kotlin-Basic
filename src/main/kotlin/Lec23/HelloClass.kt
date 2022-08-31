package Lec23

class HelloClass {

    companion object {

        @JvmStatic
        fun hello() = "hello!"
    }
}

object HiObject {

    @JvmStatic
    fun hi() = "hi!"
}

fun main() {
    val hello = HelloClass.hello()
    val hi = HiObject.hi()
}