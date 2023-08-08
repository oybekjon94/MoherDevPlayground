package basics

import java.util.Scanner

/*
1)
Enter height: 5
*
**
***
****
*****
 */
/*
2)
Enter a number: 123456
Sum of digits: 21
 */
fun main(){
    print("Enter height: ")

    val height = Scanner(System.`in`).nextInt()
    val num = height
    for (i in 0 until num){
        for (j in 0..i){
            print("*")
        }
        println("")
    }
    println("---------")

    print("Enter a number")
    var number = Scanner(System.`in`).nextInt()

    var sum = 0 // yigindini saqlab borish uchun
    while (number > 0){
        sum += number % 10
        number /= 10
    }
    println("Sum of digits: $sum")
}