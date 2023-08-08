package practice


/*
    *
   * *
  * * *
 * * * *
 */
fun main(){
    val n = 5
    for (i in 0 until n){
        for (j in 0 until n-i){
            print(" ")
        }
        for (k in 0 until i){
            print("* ")
        }
        println("")
    }
}