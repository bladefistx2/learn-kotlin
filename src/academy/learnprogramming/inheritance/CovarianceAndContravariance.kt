package academy.learnprogramming.inheritance

fun main(args: Array<String>) {

    val shortList: List<Short> = listOf(1, 2, 3, 4, 5)
    convertToInt(shortList)

    /////////////////////////////// Use-site variance
    val cars1 = mutableListOf(Car(), Car())
    val cars2: MutableList<Car> = mutableListOf()
    copyCars(cars1, cars2)

    val fords1 = mutableListOf(Ford(), Ford())
    val fords2: MutableList<Ford> = mutableListOf()
    copyCars(fords1, fords2)

    copyCars(fords1, cars2) // This can only be done with use-site (mix of cov+contra)

}

fun convertToInt(collection: List<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
    //collection.add(25.3)
}

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
}

fun waterGarden(garden: Garden<Flower>) {}

open class Flower {}

class Rose: Flower() {}

class Garden2<out T: Flower>(var something: @UnsafeVariance T) {

    val flowers: List<T> = listOf()

    fun pickFlower(i: Int): T = flowers[i]
//    fun plantFlower(flower: T) {
//
//    }

}

class Garden<out T: Flower>(private var something: T) {

    val flowers: List<T> = listOf()

    fun pickFlower(i: Int): T = flowers[i]
//    fun plantFlower(flower: T) {
//
//    }

}
///////////////////////////// Use-site variance
fun <T: Car> copyCars(source: MutableList<out T>, destination: MutableList<T>) {
    for (car in source) {
        destination.add(car)
    }
}
open class Car {}

class Ford: Car() {}