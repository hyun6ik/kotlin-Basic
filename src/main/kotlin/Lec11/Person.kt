package Lec11

data class Person(
    val name: String,
    val age: Int,
)

fun main() {
    val person1 = Person(name = "hyun6ik", age = 28)
    val person2 = Person(name = "hyun6ik", age = 28)
    println(person1 == person2)

    val set = hashSetOf(person1)
    println(set.contains(person2))

    val person3 = person1.copy()
    val person4 = person1.copy(name = "stranger")

    println(person1 == person3)
    println(person1 == person4)

    val (name, age) = person1

    println("이름 = ${person1.component1()}, 나이 = ${person1.component2()}")

    println("이름 = $name, 나이 = $age")
}
