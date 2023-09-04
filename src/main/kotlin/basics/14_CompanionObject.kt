package basics

/*
Companion object: Aytaylik bizda Classimiz bor usha classdagi bazi bir variable yoki method-
larini usha classdan instance(object) qilib yaratmasdan foydalanishimiz kere bolib qoldi
bizda Person classdan uni ichadagi parameterlaridan foydalanish uchun fun main() ichida
birinchi object yaratish kere boladi.
lekin componion object qilsak fun mainda object yaratmasdan chaqirishimiz mumkin
companion object boshqa tillardagi static vazifasini yaratib beradi

 */
fun main(){
    // Person.name birinchi object yaratish kere  //error

    //agarda show() func ni chaqirmoqchi bolsak
    val person = Person("Oybek",12)
    person.show()
    //endi companion object chaqirmoqchi bolsak
    Person.printMe()
}
class Person(val name:String, val age:Int){
    //companion object nom bersak xam bermasak xam boladi
    //uni ichidan xoxlagancha variable xamda func yozishimiz mumkin
    //com. objectni ichidan biz tashqaridagi narsalarni chaqira olmaymiz
    //lekin tashqaridan comp. object ichidagi narsalarni kora olamiz
    companion object {
        val string = "Companion object String"
        fun printMe(){
            println(string)
        }
    }
    //tashqaridan printMe() kora olamiz
    fun show(){
        printMe()
    }
}