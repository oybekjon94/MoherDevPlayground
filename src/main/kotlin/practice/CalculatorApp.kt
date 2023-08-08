package practice

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    print("Enter your first number: ")
    val first = scanner.nextInt()

    print("Enter your second number: ")
    val second = scanner.nextInt()

    print("+ - * /")
    val operation = scanner.next()

    print("Answer: ")
    when(operation){
        "+" -> println(first + second)
        "-" -> println(first - second)
        "*" -> println(first * second)
        "/" -> println(first / second)
    }
}