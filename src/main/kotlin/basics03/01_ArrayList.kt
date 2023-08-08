package basics03

/*
ArrayList -> biz dasturlash davomida bizga bittadan kopro malumotlarni
ushlab turishi kere boladi.
 */
fun main(){
    //arrayda 100 ta element joylay olamiz
    //xotiraga borib 100 ta elementga joy oladi
    //kamchilik tomoni xotiradan ortiqcha joy egallab turadi
    //bir yaratilgandan keyin ozgartirib bolmaydi
     val arrays = Array(100) { 0 }
    arrays[0] = 12
    arrays[99] = 13
    println(message = arrays)

    //arrayni kamchiliklarini Listlar toldiradi
    //bunda tolib qolsa add qilsa boladi
    //agarda biz ozgartirmoqchi bolsak MutabbleListdan foy. kere
    val list = List(100){0}
    // list.add(1)   error

    //boshlanishiga 5ta joy egalladik
    //va uni srazu 0 bilan initialize qildik
    //agar sizeni 0 qilsak faqat biz add qilgan num lar chiqadi
    val list2 = MutableList(5){0}
    list2.add(12)
    list2.add(12)
    list2.add(12)
    list2.add(123)
    list2.remove(123)
    //removeAt bu index boyicha olib tashlaydi
    list2.removeAt(2)
    println(list2)

}