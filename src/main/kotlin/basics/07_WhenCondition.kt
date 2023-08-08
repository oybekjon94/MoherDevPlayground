package basics

fun main(){
    print("What si your name?: ")

    val name = readLine()

    when(name){
        "Oybek" -> println("Hello $name")
        "Sherbek" -> println("Hi $name")
        "Nurbek" -> {
            println("Hii $name")
        }
        else -> println("Access denied")
    }
    // ozgartirib foydalansa xam boladi
    when{
        name == "Oybek" -> println("Hii $name")
        name == "Alli" -> println("Hello $name")
        name == "Bekki" -> println("Hello $name")
        else -> println("Access denied")
    }
}