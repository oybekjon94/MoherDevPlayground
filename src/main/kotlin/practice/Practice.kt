package practice

fun main(){
    val number = 5
    if (number % 2 > 0){
        println("Juft")
    }else{
        println("Toq")
    }
    //Kotlin indices
    var text  = "Kotlin"
    for (item in text.indices){
        println(text[item])
    }
}