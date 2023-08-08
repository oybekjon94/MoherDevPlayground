package basics03

fun main(){
    val map = HashMap<Int,String>()
    map[3] = "A"
    map[2] = "B"
    map[4] = "C"
    map[2] = "D"
    map[3] = "E"
    println(map)  //{2=D, 3=E, 4=C}

    val set = HashSet<String>()
    set.add("B")
    set.add("C")
    set.add("A")
    set.add("A")
    set.add("D")
    set.add("B")
    println(set) //[A, B, C, D] ketma-ketlikda bir xil qiymatlarni result

}