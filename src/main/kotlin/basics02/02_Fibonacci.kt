package basics02

// 0 1 1 2 3 5 8 13 21 ..
fun main(){
    for (i in 1..10){
        println(fibonacci(i))
    }
    //or
    //println(fibonacci(5))
}
fun fibonacci(n:Int):Int{
    if (n <= 1){
        return 1
    }
    //pastdagi return elseni vazifasini bajaradi

    //n kelganda ozidan oldingi bitta son va unga qoshiladi
    //ozidan oldingi ikkinchi son
    return fibonacci(n - 1) + fibonacci(n - 2)
}