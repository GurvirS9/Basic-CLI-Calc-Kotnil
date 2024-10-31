package main

fun add(x: Float, y: Float) = x + y
fun minus(x: Float, y: Float) = x - y
fun times(x: Float, y: Float) = x * y
fun divide(x: Float, y: Float) = x / y
fun mod(x: Float, y: Float) = x % y

fun main() {
    do {
        println(
            """
            Calculation Menu
            1. Addition
            2. Subtraction
            3. Multiplication
            4. Division
            5. Remainder
            """.trimIndent()
        )
        println("Enter your choice: ")
        val choice = readln().toInt()

        println("Enter first number: ")
        val x = readln().toFloat()
        println("Enter second number: ")
        val y = readln().toFloat()

        val res = when (choice) {
            1 -> add(x, y)
            2 -> minus(x, y)
            3 -> times(x, y)
            4 -> divide(x, y)
            5 -> mod(x, y)
            else -> println("Invalid")
        }
        println("Result of operation: $res")
        println("Want to do more calculation? ")
        val c = readln().lowercase()
    } while (c=="y")
}