package Lec28

fun main() {
    val carIterable = CarIterable(listOf(Car("람보르기니"), Car("페라리")))

    val iterator = carIterable.iterator()

    while (iterator.hasNext()) {
        println("브랜드 : ${iterator.next()}")
    }
}