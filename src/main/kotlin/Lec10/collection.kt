package Lec10

import java.util.LinkedList

fun main() {

    // immutable
    val currencyList = listOf("달러", "유로", "원")

    // mutable
    val mutableCurrencyList = mutableListOf<String>()
    mutableCurrencyList.add("달러")
    mutableCurrencyList.add("유로")
    mutableCurrencyList.add("원")

    mutableListOf<String>()
        .apply {
            add("달러")
            add("유로")
            add("원원")
       }

    // immutable set
    val numberSet = setOf(1, 2, 3, 4)

    // mutable set
    mutableSetOf<Int>()
        .apply {
            add(1)
            add(2)
            add(3)
            add(4)
        }

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)

    // mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap["two"] = 2

    // Collection Builder
    // Collection Builder 는 내부에선 mutable 반환은 immutable
    val numberList = buildList {
        add(1)
        add(2)
        add(3)
    }

    // linkedList
    val linkedList = LinkedList<Int>()
        .apply {
            addFirst(3)
            add(2)
            addLast(1)
        }

    // arrayList
    val arrayList = ArrayList<Int>()
        .apply {
            add(1)
            add(2)
            add(3)
        }

    // 컬렉션 반복
    val iterator = currencyList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    for (currency in currencyList) {
        println(currency )
    }

    currencyList.forEach{
        println(it)
    }

    // for loop -> map
    val upperList = listOf("A", "B", "C")
    val lowerList = upperList
        .map { currency ->
            currency.lowercase()
        }
    println(lowerList)

    // filter
    val filterLowerList = upperList
        .filter { it == "A" || it == "C" }
        .map { it.lowercase() }
    println(filterLowerList)
}