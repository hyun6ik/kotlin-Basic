package Lec08

interface Wheel {

    fun roll()
}

interface Cart : Wheel{

    var coin: Int

    val weight: String
        get() = "20KG "

    fun add(product: Product)

    fun rent() {
        if (coin > 0) {
            println("카드를 대여합니다.")
        }
    }

    override fun roll() {
        println("카트가 굴러갑니다.")
    }
}

interface Order

class MyCart(
    override var coin: Int
) : Cart, Order {

    override fun add(product: Product) {
        if (coin <= 0) println("코인을 넣어주세요.")
        else println("${product.name}이(가) 카트에 추가되었습니다.")
    }
}

fun main() {
    val myCart = MyCart(100)
    myCart.rent()
    myCart.roll()
    myCart.add(Product("삼겹살", 18000))
}