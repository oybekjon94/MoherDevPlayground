package basics03

/*
Set And Map
List bilan Setni farqi Listda bitta element istalgancha takrorlanib kelaveradi]
Setda esa unaqa emas
 */

fun main(){
    //Set<String>() qilib yozsak error beradi
    //u faqat interface yani ichida kop funksiyalari bor
    //shuning uchun interfacelarni birorta classda implement qilish
    //orqali ishlatamiz

    //HashSet Setdan extend olgan
    val mySet = HashSet<String>()
    mySet.add("Hello")
    mySet.add("Hello")
    mySet.add("Hello")
    mySet.add("Hello")
    println(mySet)  //result: Hello
    //agarda remove qilsak setimiz bo'shab qoladi

    //contains() -> shu narsa bormi?
    println(mySet.contains("Hello"))
    println(mySet.containsAll(listOf("Hello","Hi")))


    //Map
    /*
    Map key va valuedan iborat bolib uning qiymatlarini harita orqali
    boglab ketadi.
    bu xam interface
     */
    val userAges = HashMap<String,Int>() //key , value
    userAges["Oybek"] = 29
    userAges["Sardor"] = 24
    println(userAges["Oybek"]) // result: 29

    println(userAges.containsValue(24))

    println(userAges.contains("Sardor"))

    //agar remove qilmoqchi bolsak
    userAges.remove("Sardor")

    //getOrDefault -> mobodo bolmasa defaulut qiymatni beradi
    println(userAges.getOrDefault("Sherbek",30))

    //biz userAgesdagi barchasini chiqarmoqchimiz
    //forEachdan foy. forEachni ichida for bor
    userAges.entries.forEach{
        println(it)
    }

}