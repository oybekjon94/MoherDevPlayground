package basics02
/*
filter() -> bu biz xoxlagan narsani olishda masalan: "12a" stringdagi
12ni int typega ozgartirishda
true false qaytaradi
 */
fun main(){
    val string = "12a"
    val number = string.filter {
        it.isDigit()
    }.toInt()
    println(number)
}