package basics03

/*
A higher-order function is a function that takes
 functions as parameters, or returns a function.

bundan oldingi filedagi codeni HighOrderFunction oorqali
oson yozib koramiz
 */
fun main(){
    val myButton = Button2()

    myButton.setOnClickListener {
        println("I am clicked")
    }
    myButton.click()
}
class Button2{
    private lateinit var onClickListener: () -> Unit

    fun setOnClickListener(listener: () -> Unit){
        this.onClickListener = listener
    }

    fun click(){
        onClickListener()
    }
}