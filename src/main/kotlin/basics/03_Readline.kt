package basics

/*
Reads a line of input from the standard input stream.
 */
fun main(){
    print("What is your name?: ")

    val name = readLine()

    println(name)

    println("-----------------")

    print("How old are you?: ")

    val age = readlnOrNull()

    println(age)

    println("-----------------")

    println("What is your job?: ")

    val job = readln()

    println(job)

}