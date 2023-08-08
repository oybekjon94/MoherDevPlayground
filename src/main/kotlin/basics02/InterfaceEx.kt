package basics02

interface MyInterface2{
    val test: Int  //abstract property

    fun foo() : String //abstract method

    fun hello() {  //method with default implementation
        println("Hello there, pal!")
    }
}
class InterfaceImp:MyInterface2{
    override val test: Int = 25

    override fun foo() = "Lol"
}
fun main(){
    val obj = InterfaceImp()

    println("test = ${obj.test}")
    print("Calling hello(): ")

    obj.hello()

    print("Calling and printing foo(): ")
    println(obj.foo())
}