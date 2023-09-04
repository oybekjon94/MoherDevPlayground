package basics04

fun main(){
    /*
    birinchi biz menularni chiqarib olishimiz kere.bu menu programmadan
    qayta qayta chiqib ketmaslligi kere
     */
    while (true){
        print("1.Add    2.List   3.Quit    Input (1-3):")
        val input = readLine()?.toIntOrNull()

        //agarda user xato kiritsa biz unga xato kiritding deyishimiz kere boladi
        if (input == null){
            println("Invalid input")
            continue
        }
        when(input){
            1 -> addStudent()
            2 -> list()
            3 -> break
            else -> println("Invalid input")
        }

    }
}
fun list(){
    val repo = Repo.getInstance()
    println(String.format("%-10s\t\t%-20s\t\t%s", "IO", "NAME", "COURSES"))
    repo.getStudent().forEach {
        println(String.format("%-10d\t\t%-20s\t\t%s", it.id, it.name, it.courses.joinToString()))
    }
}

tailrec fun addStudent(){
    print("IO: ")
    val id = readLine()?.toIntOrNull()
    if (id == null){
        println("Invalid argument")
        return addStudent()
        //return bolganda keyin
        //pastdagi keyingi codelarga otmiydi
    }
    print("Name: ")
    val name = readLine() ?: ""

    print("Enter courses separated by commas: ")
    val courses = readLine() ?: ""

    //split -> bu ajratmoq
    val student = Student(id, name, courses.split(","))
    val repo = Repo.getInstance()
    repo.add(student)
}