fun main(){
    val myFirstDice = First(6)
    val diceRoll = myFirstDice.roll()

    println("Your ${myFirstDice.sides} sided dice rolled ${diceRoll}")

    //Replace the printing of diceRoll with printing the result of calling the roll() method on myFirstDice
    val mySecondDice = First(20)
    println("Your ${mySecondDice.sides} sided dice rolled ${diceRoll}")
}
//Modify the Dice class definition to accept an integer called numSides. The code inside your class does not change.
class First(val  numSides: Int) {
    var sides = 6

    fun roll(): Int{
        //Change the return statement to return the random number directly.
        return (1..sides).random()
    }
}


