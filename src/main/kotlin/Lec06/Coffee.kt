package Lec06

class Coffee(
    val brand: String,
    val name: String = "아메리카노",
    var price: Int = 3000,
){

    val getBrand: String
        get() = "스타벅스"

    var quantity: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }
}

class EmptyClass

fun main() {
    val coffee = Coffee("스타벅스")
    println("${coffee.name}의 가격은 ${coffee.price}이고 브랜드는 ${coffee.brand}입니다.")
    println(coffee.getBrand)
}