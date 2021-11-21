package academy.learnprogramming.challenges

fun main(args: Array<String>) {
    val mtb = KotlinMountainBike(33, 1000, 25, 7)
    mtb.printDescription()
    val bike = KotlinBicycle(1, 1)
    bike.printDescription()

    val bike2 = KotlinMountainBike("green",1, 2, 1)
    bike2.printDescription()
    println("===")
    println(KotlinMountainBike.availableColors)
    println("===")
    KotlinMountainBike.availableColors.forEach(::println)
}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 1, val type: String = "") {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() = println("""
        The $type bike is in gear $gear 
        with a cadence of $cadence 
        travelling at the speed of $speed.
    """.trimIndent())
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 1):
    KotlinBicycle(cadence, speed, gear, "mountain") {
        constructor(color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 1):
            this(seatHeight, cadence, speed, gear) {
            println("mtb color is $color")
        }

    override fun printDescription(){
            super.printDescription()
            println("The seat hight is $seatHeight mm.")
        }

    companion object {
        val availableColors: List<String> = listOf("blue", "red", "green", "black")
    }
}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int):
    KotlinBicycle(cadence, speed, gear, "road") {
        override fun printDescription(){
            super.printDescription()
            println("The tire width is $tireWidth mm.")
        }
    }

