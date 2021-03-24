fun main() {
    var me=Human("anastasia",24,57)
    me.eat(1)
    me.speak("it's never to late")
    me.birthday()
    var info=User("annah","karobia","karobiaannah@gmail.com",7108505,2030)
    println(info.email)
    println(info.password)

}
class Human(var name:String,var age:Int,var weight:Int){

fun eat(foodWeight:Int):Int{
    println("i am eating 1kg of food")
    weight=weight+foodWeight
    return weight
    }
fun speak(speech:String){
    println(speech)

}
    fun birthday(){
        age=age+1
        println(age)
    }

}
data class User(var first_name:String,var last_name:String,var email:String,var phone_number:Int,var password:Int ){

}
