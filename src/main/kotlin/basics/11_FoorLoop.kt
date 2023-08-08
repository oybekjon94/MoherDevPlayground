package basics

/*
Often when you work with arrays, you need to loop through all of the elements.
To loop through array elements, use the for loop together with the in operator:
In Kotlin, the for loop is used to loop through arrays, ranges, and other things
 that contains a countable number of values.
 */
fun main(){
    for (i in 1..10){
        print(i)
    }
    println()
    //-------------
    var range = 1..15
    for (a in range){
        print(a)
    }
    println()
    //down to
    for (k in 10 downTo 1){
        print(k)
    }
    println()
    //until
    for (l in 1 until 9){
        print(l)
    }
    println()
    //step
    for (o in 1..10 step 2){
        println(o)
    }
    //break => you can stop program
    var num = 1
    while (true){
        if (num == 10){
            break
        }
        print(num++)
    }
    println()
    //continue => bu usha teng bolgan qismini tasha ketib keyingi iteratsiyaga otadi
    var num2 = 0
    while (true){
        num2++
        if (num2 == 10){
            continue
        }
        print(num2)

        if (num2 == 20){
            break
        }
    }
}