package Lec28

class CarIterable(
    val cars: List<Car> = listOf()
) : Iterable<Car>{

    override fun iterator(): Iterator<Car> {
        return CarIterator(cars)
    }
}