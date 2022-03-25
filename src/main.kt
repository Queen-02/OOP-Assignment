fun main(){
    var person = Human("Alan", 26,54)
    //food-weight
    person.eat(3)

}

class Human(var name: String,var age: Int,var weight: Int){
    //food taken
    fun eat(foodWeight: Int){
        println("I am eating ${foodWeight+weight}kgs of food")
    }

    //speak
    fun speak(speaking: String){
        
    }
}