package academy.learnprogramming.helloworld

import java.math.BigDecimal

fun main(args: Array<String>){
    //Strings:
    val hello1 = "Hello"
    val hello2 = "Hello"

    println("hello1 is referentially equal to hello 2: ${hello1 === hello2}")
    var mutable = 2988
    val any: Any = "baa baa bLack shEEp"
    if (any is String){
        println(any.uppercase())
    }

    val myCharInt = 65
    println(myCharInt.toChar())

    // Arrays:
    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4)

    val evenNumbers = Array(16) { i -> i * 2 }

    val allZeroes = Array(100) { 0 }

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    for (element in mixedArray) {
        println(element)
    }
    // Primitive int array
    val myIntArray = intArrayOf(3, 9, 434, 2, 33)
    // or uninitialized
    var someOtherArray = IntArray(5)

    val str: String? = "This isn't null"
    str?.let { println(it) }

    val str4 : String? = null
    val anotherStr = "This isn't nullable"
    println(str4 == anotherStr)

    val str2 = str!!
    val str3: String = str2.uppercase()
    println(str3)

    val nullableInts = arrayOfNulls<Int>(5)
    for (i in nullableInts) {
        println(i)
    }
    println(nullableInts[3].toString())


}