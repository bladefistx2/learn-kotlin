package academy.learnprogramming.datastructures

import java.time.Year

fun main(args: Array<String>) {

    println(MyCompany.getTagLine())
    println(MyCompany.getCopyrightLine())
}

object MyCompany {

    private val currentYear = Year.now().value

    fun getTagLine() = "My company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear My Company. All rights reserved."
}