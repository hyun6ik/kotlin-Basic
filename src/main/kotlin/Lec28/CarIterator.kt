package Lec28

class CarIterator(
    val cars: List<Car> = listOf(),
    var index: Int = 0,
) : Iterator<Car> {

    override fun hasNext(): Boolean {
        return cars.size > index
    }

    override fun next(): Car {
       return cars[index++]
    }
}