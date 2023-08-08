package basics03

//Infix Function
/*
Function oldiga infix sozini yozish orqali qilinadi
-o'qish uchun oson
-bu faqat bittagina parameter qabul qiladi
-

Inline function -> bu maksimal darajada va eng tez ishlaydigan code
yozishni xoxlaganda foy.
 */
fun main(){
    println(
        //infix func. qilmasdan oldin
        // 5.add(15)

        //infixdan keyin esa
        5 add 15
    )
}

infix fun Int.add(value:Int):Int{
    return this + value
}