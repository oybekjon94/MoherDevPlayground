package basics

/*
Arithmetic operators
Assignment operators
Comparison operators
Logical operators */

fun main(){
//Arithmetic operators
// + - * / % ++ --
    var a = 15
    val b = 10

    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)

    ++a //pre increment
    println(a)
    a-- //post decrement
    println(a)

    println("---------------")

    //Assignment operators
    // =
    val assign = 12

    println("----------------")

    //Comparison operators
    //> < >= <= !=
    println(a>b)
    println(a<b)
    println(a>=b)
    println(a>=b)
    println(a!=b)

    //Logical operators
    // && || !

        var x = 5
        println(x > 3 && x < 10) // returns true because 5 is greater than 3 AND 5 is less than 10

        var p = true
        println(!p)

        println(!true)

        //우선순위 => (),!,&&,||
        println(true || true && false || !true)
        println((true || true) && false || !true)

        println((12 % 2 > 2 % 12) == (12 % 12 == 0) && 2 / 10 > 0)

        println(12 <= 11 || true && ((12 % 2 > 2 % 12) == (12 % 12 == 0) && 2 / 10 > 0))

    }