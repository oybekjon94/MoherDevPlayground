package basics04

import com.google.gson.Gson

/*
Serialization -> ketma ketlashtirish
bizda biror bir malumot turi bor internetga yubormoqchi bolsak yoki bolmasa
filega joylab qoymoqchi bolsak biz uni oddiy object korinishida emas
text korinishiga otkizib keyin ishlatishimiz kere boladi.yokida netdan kelayotgan
malumotlarni text korinishidan objeect korinishiga otkazishimiz kere boladi.

mana shu pastdagi  code xam Seriliazitonga uxshaydi
 */
fun main(){
    val student = Student(
        id = 1,
        name = "Sardor",
        courses = listOf("Math","Chemistry")
    )
    //shu Student classni Gson korinishga otkazib olamiz
    //kutubxonadan object yaratib quyamiz
    val gson = Gson()

    val studentJson = gson.toJson(student)

    println(studentJson)
}
//mana shu korinish Json deyiladi
//{"id":1,"name":"Sardor","courses":["Math","Chemistry"]}

//keyingi fileda Json korinishdan classg otkazishni korib chiqamiz

