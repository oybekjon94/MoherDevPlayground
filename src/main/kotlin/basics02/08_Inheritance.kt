package basics02

open class Parent{
    open fun show(){
        println("Parent::show()")
    }
}
class Child:Parent(){
    override fun show() {
        println("Child::show()")
    }
}
class Sibling:Parent(){
    override fun show() {
        println("Sibling::show")
    }
}
fun main(){
    var child:Parent = Parent()
    val parent = child
    parent.show()
}