package academy.learnprogramming.datastructures

import java.time.Year

fun main(args: Array<String>) {

    println(MyCompany.getTagLine())
    println(MyCompany.getCopyrightLine())

    val someClass1 = SomeClass.justAssign("this is the string as is")
    val someClass2 = SomeClass.upperOrLowerCase("this isn't the string as is", false)
    println(someClass1.someString)
    println(someClass2.someString)
}

class SomeClass private constructor(val someString: String) {


    companion object {
        private var privateVar = 6

        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"

        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            return if (lowerCase) {
                SomeClass(str.lowercase())
            } else {
                SomeClass(str.uppercase())
            }
        }
    }
}