package basics02

/*
In Kotlin, an interface is a fundamental concept used to define a contract
or a set of method signatures that a class must implement. It allows you
 to define a blueprint for a group of related classes, ensuring that they
 provide specific behavior or functionality. Interfaces play a crucial role
 in achieving abstraction, modularity, and polymorphism in your code.
 */
interface MyInterface {
    //define two abstract method
    fun doSomething()
    fun doAnotherThing()
}
//to implement an interface in a class,you use the ":"
class MyClass:MyInterface{
    override fun doSomething() {
        //implementation
    }

    override fun doAnotherThing() {
        //implementation
    }

}
//A single class can implement multiple interfaces by
//separating them with commas:
//class AnotherClass : MyInterface, SomeOtherInterface