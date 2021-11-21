package academy.learnprogramming.challenges

fun main(args: Array<String>) {

    // 1. Declare a non-nullable float variable two ways,
    // and assign it the value -3847.384
    val f1 = -3847.384f
    val f2 = (-3847.384).toFloat()

    // 2. Now change both of those variable declarations into nullable variables.
    val f3: Float? = -3847.384f
    val f4: Float? = (-3847.384).toFloat()

    // 3. Now declare an array of type non-nullable Short. Make it size 5,
    // and assign it the values 1, 2, 3, 4, and 5.
    val shorts = arrayListOf<Short>()
    val shortArray = shortArrayOf(1, 2, 3, 4, 5)
    val shortArray2: Array<Short> = arrayOf(1, 2, 3, 4, 5)


    // 4. Now declare an array of nullable Ints and initialize it with the values
    // 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, etc., all the way up to 200.
    val ints = Array<Int?>(40){i -> i * 5}


    // 5. You have to call a Java method with the following signature from Kotlin:
    // public void method1(char[] charArray). Declare an array that you could
    // pass to the method and initialize it with the values 'a', 'b', and 'c'.
    val charArray = charArrayOf('a', 'b', 'c')


    // 6. Given the following code:
    val x: String? = "I AM IN UPPERCASE"
    // Using one line of code, declare another string variable,
    // and assign it x.toLowerCase() when x isn't null,
    // and the string "I give up!" when x is null.
    val x2 = x?.lowercase() ?: "I give up!"

    // 7. Now use the let function to (a) lowercase the string, and then
    // (b) replace "am" with "am not" in the result
    x?.let{ println(x.lowercase().replace("am", "am not")) }

    // 8. You're really, really confident that the variable myNonNullVariable can't
    // contain null.
    // Change the following code to assert that myNonNullVariable isn't null
    // (and shoot yourself in the foot!)
    val myNonNullVariable: Int? = null
    myNonNullVariable.toString()

    data class Car(val color: String, val model: String, val year: Int) {

    }

    val car = Car("blue", "Toyota", 2015)
    println(car) // toString is auto-generated
    val car2 = Car("blue", "Toyota", 2015)
    println(car == car2) // equals is auto-generated
    val car3 = car.copy()
    println(car3)
    val car4 = car.copy(year = 2016, color = "green")
    println(car4) // copy but change only certain attributes

    fun multiply(num1: Int, num2: Int, label: String = "The answer is:") =
        "$label ${num1 * num2}"

    // Extension functions. i.e. extend String
    // Inline functions
}