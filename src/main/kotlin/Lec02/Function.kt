package Lec02

// 기본적인 함수 선언 스타일
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 표현식 스타일
fun sum2(a: Int, b: Int): Int = a + b

// 표현식 & 반환타입 생략
fun sum3(a: Int, b: Int) = a + b

// 몸통이 있는 함수는 반환 타입을 제거하면 컴파일 오류가 생긴다.
//fun sum4(a: Int, b: Int) {
//    return a + b
//}

// 반환타입이 없는 함수는 Unit을 반환한다.
// Unit은 생략 가능
fun printSum(a: Int, b: Int): Unit {
    println("$a + $b = ${a + b}")
}

// Default Parameter
fun greeting(
    message: String = "안녕하세요!!"
) {
    println(message)
}

fun log(
    level: String = "INFO",
    message: String,
) {
    println("[$level] $message")
}

fun main() {
    log(message = "인포 로그")
    log(level = "DEBUG", "디버그 로그")
    log("WARN", message = "워닝 로그")
    log(level = "ERROR", message = "에러 로그")

}