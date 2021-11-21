package academy.learnprogramming.section6challenge

import java.lang.Double.POSITIVE_INFINITY


fun main(args: Array<String>) {

    println("=====================1==================")
    // using a range, print 5, 10, 15, 20, 25... 5000, each number
    // on a separate line
//    for (i in 5 until 5001 step 5){
//        println(i)
//    }
    println("=====================2==================")
    // using a range, -500..0, each number on a separate line
//    for (i in -500 until 1) println(i)
    println("=====================3==================")
    // using a range, print the first 15 numbers in the
    // Fibonacci sequence, each
    // number on a separate line
    // Hint: you'll have to print the first one or two numbers
    // outside the range
    // 0, 1, 1, 2, 3, 5, 8...
    var prev0 = 0
    var prev1 = 1
    println(prev0)
    println(prev1)
    for (i in 1 until 13){ // the first two already printed
        val current = prev0 + prev1
        println(current)
        prev0 = prev1
        prev1 = current
    }
    println("=====================4==================")
    // Modify the following code so that it prints the following,
    // each number on a separate line
    // 1, 11, 100, 99, 98, 2
    for (i in 1..5) {
        println(i)
        if (i == 2)
            break
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 98) {
                println(k)
            }
            break
        }
    }

    println("=====================5==================")

    // Declare a variable called num (int) and assign it whatever you want
    val num = 100
    // Declare a variable called dnum (double) and assign it as follows:
    val dnum = when(num) {
        in 101..Int.MAX_VALUE -> -234.567
        in Int.MIN_VALUE..99 -> 4444.555
        else -> 0.0
    }
    println("dnum: $dnum")

    // solution #2
    println("dnum: ${when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        else -> 0.0
    }}")

}