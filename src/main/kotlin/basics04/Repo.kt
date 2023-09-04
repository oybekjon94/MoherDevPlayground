package basics04

/*
Repository
bu malumotlar saqlash uchun malumotlar ombori

Singleton pattern -> butun app davomida bitta instance bolishi kere
//Repo instance
 */
class Repo {

     //repodan yangi instance yaratilishini cheklash uchun
    //constuctorni xam private qilishimiz kere boladi
    private constructor()

    //private yani mana shu studentni tashqaridan chaqira olmasin
    //faqat bu yerdagi add va get func larini foydalana olsin
    private val students = mutableListOf<Student>()

    fun add(student: Student){
        students.add(student)
    }

    fun getStudent(): List<Student>{
        return students
    }


    //companion -> dost object yaratadi.yana tepadi  Repo classdan instance olmay turib
    //foydalanmasdan ichidagi memberlarni ishlatsa boladi. va bu memberlar
    //uchun bir xil bolib turaveradi.chunki bu alohida object

    //Single pattern design
    companion object{
        //Reponi instanceni saqlab turish uchun
        private lateinit var repo: Repo

        fun getInstance():Repo{
            //:: togridan togri memberni chaqirganda
            if (this::repo.isInitialized.not()){
                repo = Repo()
            }
            return repo
        }

    }
}