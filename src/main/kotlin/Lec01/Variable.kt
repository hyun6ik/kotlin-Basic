package Lec01

//Top Level에 위치한 변수
var x = 5

fun main() {

    x+=1
    println(x)

    val a: Int = 1

    val b = 1

    val c: Int
    c = 3

    //val (value)
    //var (variable)

    val d: String = "Hello"
//    d = "World" 재할당 안됩니다.

    var e: String = "Hello"
    e = "World"

    var f: Int = 123
//    f = "Hello"  Type은 변환 안됩니다.
}