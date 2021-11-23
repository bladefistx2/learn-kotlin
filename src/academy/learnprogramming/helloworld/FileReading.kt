package academy.learnprogramming.helloworld

import java.io.File

fun main(args: Array<String>) {
    File("testfile.txt").readText() // Up to 2GB
    File("testfile.txt").reader().readText() // No limit, but must close reader manually.
    // BEST:
    File("testfile.txt").reader().forEachLine { println(it) } // read line by line
    File("testfile.txt").reader().useLines { it.forEach {  println(it) } } // use = will close the reader

    //new InputStreamReader(new FileInputStreamReader(new File("testfile.txt")), "UTF-8")
}