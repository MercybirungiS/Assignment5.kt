fun main() {
var details=Human ("Hope",17,50.67.toFloat() )
    details.eat(4)
    details.speak("I love Kotlin")
    details .birthday()
    var student =User ("Mercy","Ssozi","mercyssozi@gmail.com","+256 780 256884","Qwerty567")
    println(student.phoneNumber)
    println(student.lastName )
}
class Human(var name:String,var age:Int , var weight:Float){
    fun eat(foodWeight: Int){
    weight=foodWeight +weight
        println("I am eating $foodWeight kgs of food")
        println(weight )
    }
     fun speak(speech: String ){
         println(speech )
     }
    fun birthday(){
        println(age+1)
    }
}
data class User(val firstName:String,val lastName:String,var email:String,val phoneNumber:String,var passWord:String){

}



