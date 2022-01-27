fun main(){
    val myFirstDice = First(6)
    val diceRoll = myFirstDice.roll()
    val luckyNumber = 4

//use of conditional statements
    when (diceRoll){
        luckyNumber -> println("You Won!")
        1 -> println("")
        2 -> println("So sorry you rolled a 1. Try again!")
        3 -> println("Sadly, you rolled a 2. Try again!")
        4 -> println("Unfortunately you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! you rolled a 6. Try again")
    }

}
//Modify the Dice class definition to accept an integer called numSides. The code inside your class does not change.
class First(val  numSides: Int) {
    var sides = 6

    fun roll(): Int{
        //Change the return statement to return the random number directly.
        return (1..sides).random()
    }
}


