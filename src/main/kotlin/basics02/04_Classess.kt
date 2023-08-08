package basics02

/*
Classess - bu OOPning bir bolagi hisoblanadi.
Bizning appdagi xar xir qism ex) button,text mana shular obyekt hisoblandadi
Obyektlarni biz classlar orqali yaratib olamiz
Classlarni biz template deb qarasak boladi
 */
fun main(){
    val myCar = Car("White","Ferrari")

    myCar.drive()
    myCar.stop()

    println("I have a ${myCar.color} ${myCar.model}")
}
class Car{
    //property
     var color:String
     var model:String

    //constructor ->  Konstruktor - bu sinf ob'ekti birinchi navbatda o'zgaruvchilar
    // yoki xususiyatlarni ishga tushirish uchun yaratilganda chaqiriladigan maxsus
    // a'zo funktsiyasi.
    //eng birinchi bolib chaqiriladi
     //secondary primary
    constructor(carColor:String, model:String){
        color = carColor
        //this bu scopdan tashqaridagini chaqoradi
        //yani this bu reference
        this.model = model
    }
    fun drive(){
        println("I am driving")
    }
    fun stop(){
        println("I am stopping")
    }
}