package basics04

/*
try catchdan foydalanmasdan Exceptionni oldini olish
 */
fun main(){
    val input = readLine()
    if (input.isDigits()){
        val myInt = input!!.toInt()
        println(myInt)
    }else{
        println("Enter digits only")
    }
}

fun String?.isDigits():Boolean{
    if (this == null){
        return false
    }
    this.forEach {char ->
        if (char.isDigit().not()){
            return false
        }
    }
    return true
}