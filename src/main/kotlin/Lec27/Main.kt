package Lec27

fun main() {
    val barista = Barista()
    barista.orderCoffee("아이스 아메리카노")

    val customer1 = Customer("고객1")
    val customer2 = Customer("고객2")
    val customer3 = Customer("고객3")

    barista.addObserver(customer1)
    barista.addObserver(customer2)
    barista.addObserver(customer3)

    barista.makeCoffee()

}