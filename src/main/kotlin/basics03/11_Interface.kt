package basics03

/*
Interfaces -> it describes what a class should do,
but not how it should do
-An interface provides a form
 */
interface Computer{
    fun prompt():String
    fun calculateAnswer(): Int
}
class Desktop: Computer{
    override fun prompt() = "Hello"

    override fun calculateAnswer() = 11

}
class DeepThought:Computer{
    override fun prompt() = "Thinking"

    override fun calculateAnswer() = 23
}
class Quantum:Computer{
    override fun prompt() = "Probably"

    override fun calculateAnswer() = 34
}
fun main(){
    val computers = listOf(
        Desktop(),DeepThought(),Quantum()
    )
    computers.map { it.prompt() }
    println(computers)

    computers.map { it.calculateAnswer() }
}