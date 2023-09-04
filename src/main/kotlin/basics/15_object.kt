package basics

import javax.xml.crypto.Data

/*
bizda qandaydir bir marta yaralish kere va bosqa yaralmasligi kere
agarda classdan har safar object chaqirganimizda xar doim xar xil object yaratiladi
masalan biz database bir marta yaralishi kere va olishimiz va joylash kere boladi
bizga bir dona object kere bolganda

 */
fun main(){
    val person = Person1("Oybek",12)
    person.counter = 10
    val person2 = Person1("Sherbek",17)
    person2.counter = 0
    println(person.counter) //result: 10
    println(person2.counter) //result: 0

    val dataBase = DataBase
    dataBase.counter = 10
    val database2 = DataBase
    println(dataBase) //result: 10
    println(database2) //result:10
}
object DataBase{
    var counter = 0
}
class Person1(val name:String, val age:Int){
    var counter = 0

}