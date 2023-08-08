package basics03

/*
Extencion function
bu ozimiz yaratgan class emas boshqalarning yoki
kotlin classlaridan foy. function yaratish
ancha qulay
 */
fun main(){
   val myObject = "Hello"

    println(myObject.hello())
}
//String classdan foy. double() ni qilmoq
fun String.hello():String{
    return this + this // bu this -> Stringni qaytarib beradi
}