package academy.learnprogramming.helloworld

import java.io.FileInputStream
import java.io.DataInputStream
import java.io.EOFException


fun main(args: Array<String>) {

    val di = DataInputStream(FileInputStream("testfile.bin"))
    var si: String

    try {
        while (true) {
            si = di.readUTF()
            println(si)
        }
    }
    catch (e: EOFException) {
        
    }

    // Try-with-resources in java = just call a method with USE.

}