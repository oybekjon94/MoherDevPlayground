package basics02

/*
Nullable
Global -> bu tashqarida hammaga korinib turadigan qism hisoblanadi
va hamma funksiya uchun bir xil qiymatga ega bolib turadi
 */
//qiymatni keyinroq bermoqchi bolsak lateinitdan foy.
lateinit var name:String

//yokida nullable qilsak xam boladi
var surname:String? = null
fun main(){
//    if (surname == null){
//        surname = "Kholikov"
//    }

    surname = "Oybek" //if not give value
    //println(surname)   result: null
    println(surname?.lowercase())  //safe call  result: null but safe
    println(surname!!.lowercase()) //non-null assertion result: exception
    println((surname?: "Value is null").lowercase())  //elvis operator: result: value is null

}
