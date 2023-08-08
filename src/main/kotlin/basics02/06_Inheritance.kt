package basics02

/*
Inheritance
Interface
Abstract class
Type Casting
 */
/*
Inhertince-> bir ota classdan farzandlari undagi ozgaruvchi va qiymatlarni foydalanadi
 */
fun main(){
    //type casting
    val cat:Pet = Cat()
    val dog:Pet = Dog()

    cat.sound()

    val myCat = cat as Cat
    myCat.sound()
}
//voris ota classdan foydalana olish uchun ota classni open qilishimiz kere
open class Pet{
    open val name:String = ""
    val color:String = ""

    //ovoz chiqarmaydi
    open fun sound(){
        println("")
    }
}
class Cat:Pet(){
    //endi mushugimiz ovoz chiqarishi uchun override qilinadi yani qayta foy.
    override fun sound() {
        println("Meow")
    }
}

class Dog:Pet(){
    override val name: String = "Simba"
    override fun sound() {
        //super bu ota classdagi fun.ni chaqiradi
        super.name
        println("Wow")
    }
}