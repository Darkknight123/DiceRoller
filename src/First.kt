fun main(){

    abstract class Dwelling(private var residents: Int){

      abstract  val buildingMaterial: String
      abstract val capacity: Int

      fun hasRoom(): Boolean{
          return residents < capacity
      }
    }
    // a subclass of Dwelling
    class SquareCabin(residents: Int) : Dwelling(residents){
        override val buildingMaterial = "Wood"
        override val capacity = 6

    }

    //instance of SquareCabin
    val squareCabin = SquareCabin(6)

    println("\nSquare Cabin\n======")
    println("Capacity:${squareCabin.capacity}")
    println("Material: ${squareCabin.buildingMaterial}")
    println("Has room? ${squareCabin.hasRoom()}")


    //A subclass of Dwelling it inherits from it
    open class RoundHut(residents:Int):Dwelling(residents){

        override val buildingMaterial = "Straw"
        override val capacity = 4
    }

    //instance of RoundHut
    val roundHut = RoundHut(3)

    with(roundHut){
        println("\nRoundHut\n=======")
        println("Capacity:${capacity}")
        println("Material:${buildingMaterial}")
        println("Has Room?: ${hasRoom()}")
    }

    //roundtower subclass
    open class RoundTower(residents:Int, val floors: Int=2):RoundHut(residents){
        override val buildingMaterial = "Stone"
        override val capacity = 4

    }

    //instace of roundTower
    val roundTower = RoundTower(4)

    with(roundTower){
        println("\nRoundHut\n=======")
        println("Capacity:${capacity}")
        println("Material:${buildingMaterial}")
        println("Has Room?: ${hasRoom()}")
    }
}



