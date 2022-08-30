package Lec21.kotlin

import Lec21.java.Person

fun main() {
    val person = Person()
    person.name = "hyun6ik"
    person.age = 28

    println(person.name)
    println(person.age)

    // 프로퍼티가 없음에도 Getter 메소드라면 프로퍼티처럼 사용 가능하다.
    println(person.uuid)

    // 세터가 있음에도 컴파일 오류가 발생한다. (Getter가 있어야함)
//    person.address = "서울특별시"

    // address를 가져오는 메소드를 Getter가 아닌 CustomMethod로 했기 때문에 Setter도 생성되지 않는다.
    person.myAddress()
}