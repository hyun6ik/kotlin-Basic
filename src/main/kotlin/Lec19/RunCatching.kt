package Lec19

fun getStr(): Nothing = throw Exception("예외 발생 기본 값으로 초기화")

fun getNull() = null

fun main() {

//    val result = try {
//        getStr()
//    } catch (e: Exception) {
//        println(e.message)
//        "기본값"
//    }

    val result = runCatching { getStr() }
        .getOrElse {
            println(it.message)
            "기본값"
        }

    val isNull = runCatching { getNull() }
        .getOrNull()



    val default = runCatching { getStr() }
        .getOrDefault("기본값")

    val map = runCatching { "안녕" }
        .map {
            "${it}하세요"
        }.getOrThrow()

    val recover = runCatching { getStr() }
        .recover { "복구" }
        .getOrNull()

    println(result)
    println(isNull)
    println(default)
    println(map)
    println(recover)


    val exception = runCatching { getStr() }
        .exceptionOrNull()

    exception?.let {
        println(it.message)
        throw it
    }
}