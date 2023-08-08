package basics03

/*
High Order Function -> keyingi fileda mana shu codeni high  order function
orqali oson yozilishini koramiz
 */
fun main(){
     val myButton = Button()

    //object -> bu yangi object yaratilsin
    myButton.setOnClickListener(object :OnClickListener{
        override fun onClick() {
            println("I am clicked")
        }

    })
    myButton.click()
}

class Button{
    private lateinit var listener :OnClickListener
    fun setOnClickListener(listener: OnClickListener){
        this.listener = listener
    }

    fun click(){
        listener.onClick()
    }
}

interface OnClickListener{
    fun onClick()
}