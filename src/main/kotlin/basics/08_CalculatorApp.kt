package basics

import java.util.Scanner

/*
Enter first number: 12
Enter second number: 2
Enter operation (+ - * / < > <= >=):
Answer: 24
 */
fun main(){
    val scanner = Scanner(System.`in`)

    print("Please Enter first number: ")
    val first = scanner.nextInt()

    print("Please Enter second number: ") //alt + j => bittada bir numberni ozgartirish
    val second = scanner.nextInt()

    print("Enter operation (+ - * / < > <= >=)")
    val operation = scanner.next() // next() => bu string oqib olish uchun

    print("Answer: ")
    when(operation){
        "+" -> println(first + second)
        "-" -> println(first - second)
        "*" -> println(first * second)
        "/" -> println(first / second)
        "<" -> println(first < second)
        ">" -> println(first > second)
        "<=" -> println(first <= second)
        ">=" -> println(first >= second)
    }
}