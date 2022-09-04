package Lec27

import java.util.*

class Customer(
    val name: String,
) : Observer {
    override fun update(o: Observable?, arg: Any?) {
        val coffee = arg as Coffee
        println("${name}이 ${coffee.name}를 받았습니다.")
    }
}