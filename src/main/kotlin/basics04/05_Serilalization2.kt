package basics04

import com.google.gson.Gson

/*
Deserialization
bu yerda biz Jsondan class formatga otkazamiz
 */
fun main(){
    val gson = Gson()

    //Json korinishdan  oddiy kotlin korinishiga otkazib beradi
    val studentJson = "{\"id\":1,\"name\":\"Sardor\",\"courses\":[\"Math\",\"Chemistry\"]}"
    val student = gson.fromJson(studentJson,Student::class.java)?: return

    println(student)

}