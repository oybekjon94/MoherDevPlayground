package basics

/*
Conditionals => xar xil shartlar quyishga aytiladi
Kotlin has the following conditionals:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use when to specify many alternative blocks of code to be executed
 */
fun main(){
    print("What is your name?: ")
    print("What is your surname?: ")

    val name = readLine()

    if (name == "Oybek"){
        println("Hello $name")
    }else if (name == "Sherbek"){
        println("Hi $name")
    } else{
        println("Access denied")
    }
}