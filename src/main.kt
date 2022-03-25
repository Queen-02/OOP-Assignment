fun main(){
    var person = Human("Alan", 26,54)
    //food-weight
    person.eat(3)
    println(person.weight)

    //Human speaking
    person.speak("Hello")

    //Human's age
    person.birthday()

    //Question two
    var arnold = User("Arnold", "Collins", "arnold.collins@gmail.com", 25472356, "Arnold64")
    println(arnold.email)
    println(arnold.password)

}

class Human(var name: String,var age: Int,var weight: Int){
    //food taken
    fun eat(foodWeight: Int){
        println("I am eating ${foodWeight}kgs of food")
        weight+=foodWeight
    }

    //speak
    fun speak(speech: String){
        println(speech)
    }

    //birthday
    fun birthday(){
        age++
        println(age)
    }
}

//creating a data class that prints out two attributes
data class User(var firstName: String, var lastName: String, var email: String, var phoneNumber: Int, var password: String){

}