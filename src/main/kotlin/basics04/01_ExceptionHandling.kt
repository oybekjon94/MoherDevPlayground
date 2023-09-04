package basics04

import java.util.InputMismatchException
import java.util.Scanner

/*
Exception Handling -> xatoliklarni oldini olish uchun
-agarda biz consolda int emas soz yozsak InputMistMatchExcaption beradi.
buning uchun biz try xamda catchni ishlatamiz.
-iloji boricha kamro ishlatish kere boladi
-chunki xotiradan joy egallaydi .buni orniga if else dan xam foydalansa boladi

- IOException - bu input va output yoki internetlar bilan ishlaganimizda chiqadigan Exception
 */
fun main(){
    val scanner = Scanner(System.`in`)

    try {
        val myInt = scanner.nextInt()

        println(myInt)
    }catch (e:Exception){
        println("Xatolik yuz berdi")


    }catch (e:InputMismatchException){
        println("dsv")
    }
    //bu yakunlab beradi
    finally {
        println("yakunlash")
    }

    //  try catchsiz exceptionni oldini olish
    val list = ArrayList<Int>(10)

    if (list.size >= 12){
        val myInt = list[11]
        println(myInt)
    }
}
