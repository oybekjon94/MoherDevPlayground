package basics02

/*
Data class-> bu malumotlarni saqlab turish uchun class
xamda bu classda constructor bolishi kere va kamida bitta ozgaruvchi bolishi kere
 */
fun main(){
    val myCar =Car2("White")

    myCar.drive()
    myCar.stop()
}
data class Car2(
    //boshga joyga korinmaydigan qilish uchun private
    var color:String
){
    fun drive(){
        println("I am driving")
    }
    fun stop(){
        println("I am stoping")
    }
}