package basics04

/*
Exceptionni oldini olishni eng oson yoli
 */
fun main(){
    val input = readLine()
    //agarda oxshasa ishlaydi yokida null qaytaradi
    val myInt = input?.toIntOrNull()

    if (myInt != null){
        println(myInt)
    }else{
        println("Enter digits only")
    }
}