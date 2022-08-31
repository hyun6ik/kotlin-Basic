package Lec22.kotlin

import Lec22.java.JavaThrow
import java.io.IOException
import kotlin.jvm.Throws

class KotlinThrow {

    // 전파 하고 싶을떄는 @Throws 애노테이션 사용
    @Throws(IOException::class)
    fun throwIOException() {
        throw IOException("Checked Exception인 IOException 발생")
    }
}

fun main() {
    val javaThrow = JavaThrow()
    javaThrow.throwIoException()

    val kotlinThrow = KotlinThrow()
    kotlinThrow.throwIOException()
}