package basics02

/*
Abstract -> biz qolib sifatida abstrack class ochib quyamiz
xamda shu qolibdan extent olgan xolda boshqa classlarni
yaratib ishimizni osonlashtirib ketaveramiz
 */
abstract class Person(name:String){
    init {
        println("My name is $name")
    }
    fun displaySSN(ssn:Int){
        println("My SSN is $ssn")
    }
    abstract fun displayJob(description:String)
}
class Teacher(name:String):Person(name){
    override fun displayJob(description: String) {
        println(description)
    }
}
fun main(){
    val jack = Teacher("Jack Smith")
    jack.displayJob("I am a math teacher")
    jack.displaySSN(23123)
}