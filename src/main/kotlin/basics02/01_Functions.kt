package basics02

/*
Functions -> In Kotlin, functions are used to encapsulate a piece of
behavior that can be executed multiple times. Functions can accept input
parameters, return values, and provide a way to encapsulate complex logic
 into reusable blocks of code.
 */
fun main(){
    println(add(12,12))
}
fun add(a: Int, b: Int): Int {
    return a + b
}
//fun add(a: Int, b: Int) = a + b