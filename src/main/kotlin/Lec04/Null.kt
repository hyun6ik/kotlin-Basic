package Lec04

fun main() {
    // null 할당 불가능
//    val a: String = null
//
//    var b: String = "aabbcc"
//    b = null

    var a: String? = null
    // nullable 컴파일 체크
//    a.length
    a?.length

    // Elvis 연산자
    val b: Int = a?.length ?: 0

    val nullableStr = getNullStr()

    val nullableLength = nullableStr?.length ?: "null인 경우 반환".length
    println(nullableLength)

    val nullableStrLength = getLengthIfNotNull(nullableStr)
    println(nullableStrLength)
}

fun getNullStr(): String? = null

fun getLengthIfNotNull(str: String?): Int = str?.length ?: 0