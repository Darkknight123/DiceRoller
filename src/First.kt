
fun main(){
    val myFirstDice = First()
    val diceRoll = myFirstDice.roll()

    println("Your ${myFirstDice.sides} sided dice rolled ${diceRoll}")

    myFirstDice.sides = 20
    println("Your ${myFirstDice.sides} sided dice rolled ${diceRoll}")
}

class First {
    var sides = 6

    fun roll(): Int{
        val randomNumber = (1..sides).random()
        return randomNumber
    }
}


