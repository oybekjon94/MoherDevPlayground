package basics03

fun a():Int{
    return 1
}

fun b():Int{
    return 12
}

fun c():Int{
    return 123
}

fun main(){
    val value = process(::a, ::b, ::c)()
    println(value)
}

fun process(vararg numbers: () -> Int): () -> Int {
    var result = numbers.first()
    numbers.forEach {
        if (result() >= it()) return@forEach
        result = it
    }
    return result
}