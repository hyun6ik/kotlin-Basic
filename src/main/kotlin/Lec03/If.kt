package Lec03

fun main() {

    // if.. else 사용
    val job = "Backend Developer"

    if (job == "Backend Developer") {
        println("개발자")
    } else {
        println("개발자 아님")
    }

    // 코틀린의 if.. else는 표현식이다.
    val age: Int = 10

    val str = if (age > 20) {
        "성인"
    } else {
        "청소년"
    }

    // 코틀린은 삼항 연산자가 없다.
    val a = 1
    val b = 2
    val c = if (b>a) b else a

}