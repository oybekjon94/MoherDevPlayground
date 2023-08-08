package basics

/*
Fizz Fuzz
3 ga karrali son => Fizz
5 ga karrali son => Fuzz
 */
fun main(){
   for(i in 1..20){
       when{
           i % 3 == 0 -> print("Fizz")
           i % 5 == 0 -> print("Fuzz")
           else -> print(i)
       }
       // or you can write other way but same result
       //printni ichida foydalanish
       print(
           when{
           i % 4 == 0 -> "Fizz"
           i % 5 == 0 -> "Fuzz"
               else -> i
       })
   }
}