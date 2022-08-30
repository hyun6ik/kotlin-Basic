package Lec17

data class Tuple(
    val a: Int,
    val b: Int,
)

fun plus(tuple: Tuple) = tuple.a + tuple.b

fun plus2(pair: Pair<Int, Int>) = pair.first + pair.second

fun main() {
    val tuple = Tuple(1, 3)
    println(plus(tuple))

    println(plus2(Pair(2,4)))

    val pair = Pair("A", 1)
    val newPair = pair.copy(first = "B")
    println(newPair)

    val b = newPair.component1()
    println(b)

    val toList = newPair.toList()
    println(toList)

    val triple = Triple("A", "B", "C")
    println(triple)
    val newTriple = triple.copy(third = "D")
    println(newTriple.component3())

    val (a, bb, d) = newTriple
    println("$a $bb $d")

    val list = newTriple.toList()

    val map = mutableMapOf("현식" to "개발자")
    for ((key, value) in map) {
        println("${key}의 직업은 ${value}입니다.")
    }

    val pairMap = mutableMapOf(Pair("현식", "개발자"))
    for ((key, value) in pairMap) {
        println("${key}의 직업은 ${value}입니다.")
    }
}