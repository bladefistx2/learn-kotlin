package academy.learnprogramming.helloworld


fun main(args: Array<String>) {
    println("=====================1==================")
    for (i in 1..5) {
        println(i)
    }
    println("=====================2==================")
    for (num in 1 until 20 step 4) {
        println(num)
    }
    println("=====================3==================")
    for (i in 10 downTo 1) {
        println(i)
    }
    println("=====================4==================")
    val s = "goodbye"
    val sRange = 0..s.length

    for (i in 20 downTo 10 step 5) {
        println(i)
    }
    println("=====================5==================")
    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ"


    val hello = "Hello"
    for (c in hello) {
        println(c)
    }

    val stepRange = 3..15
    println("=====================6==================")
    val stepThree = stepRange.step(3)
    for (n in stepThree) {
        println(n)
    }
    println("=====================7==================")
    // Get indices of array
    val seasons = arrayOf("spring", "summer", "winter", "fall")
    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    seasons.forEach { println(it) }// seasons.forEach { ::println() }
    seasons.forEachIndexed { index, value -> println("$value is season number $index")}

    val notASeason = "whatever" !in seasons
    println(notASeason)
    println("=====================8==================")
    val notInRange = 32 !in 1..10
    println(notInRange)
    println("=====================9==================")
    val str = "Hello"
    println("is 'e' in $str ? ${'e' in str}")
    println("is 'e' !in $str ? ${'e' !in str}")
    println("=====================10==================")

    for (i in 1..3) {
        println("i = $i")
        outerLoop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k == 7) {
                    break@outerLoop
                }
            }
        }
    }


}
