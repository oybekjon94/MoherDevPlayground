package basics03

/*
sigir har 3 yilda bittadan tugadi va 20 yilda jami
nechta sigirga kopayadi
1: 1
2: 1
3: 1
4: 2  // 4yilda bitta tugib ikkitaga kopaydi
5: 3
6: 4
7: 5
 */
fun main(){
   for (i in 1..30){
       println("$i: ${getCows(i)}")
   }
}
fun getCows(years:Int):Int{
    //firmada boshida bitta sigir bor
    val ages = MutableList(1){0}

    for (year in 0 until years){
        for (i in ages.indices){
            if (ages[i] >= 3){
                ages.add(0)
            }
            ages[i]++
        }
    }
    return ages.size
}
