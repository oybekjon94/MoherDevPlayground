package basics03

import java.lang.StringBuilder

/*
kop sozlarni bitta qiladigan funksiya yozamiz
 */
fun main() {
    val myStrings = listOf("Hello", "World", "!!!")
    println(myStrings.join("[","]",", "){ current ->
        return@join current.lowercase() // bu yerdagi return@ -> aniq mana shuni returrn qil
        //xamda bu yerda returnni yozmasa xam boladi
    })
}

fun List<String>.join(
    prepend: String = "",
    append: String = "",
    separator: String = " ",
    transform: ((current: String) -> String)? = null
): String {

    // biz parameterlarni bir biriga qushib result qilsak boladi lekin
    //har bir paramdagi string alohida joy egallay shuning uchun
    // biz StringBuilderni ishlatamiz
    //prepend + append   //ortiqcha joy

    val sb = StringBuilder(prepend)
    forEachIndexed { index, current ->
        sb.append(transform?.invoke(current) ?: current)
        //oxirgi element bolmasa append qilib ketaman
        if (index != size - 1) {
            sb.append(separator)
        }

    }
    sb.append(append)
    return sb.toString()
}
// ctrl + shift + alt + l   // codeni tartibli qilib beradi
