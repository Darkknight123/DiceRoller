
fun main(){
    val myFirstDice = First()

    println(myFirstDice.sides)
}

class First {
    var sides = 6

    fun roll(){
        val randomNumber = (1..6).random()
        println(randomNumber)
    }
}


