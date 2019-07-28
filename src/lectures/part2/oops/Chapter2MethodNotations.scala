package lectures.part2.oops

// Need this import to enable postfix notation
import scala.language.postfixOps

object Chapter2MethodNotations extends App {

  // Writing Person class inside the object to remove ambiguity
  // of Person class present in Chapter1BasicClass
  class Person(val name:String,favouriteMovie:String){
    def likes (movie:String) : Boolean = movie == favouriteMovie
    // u can use + - & or any other operations for function names
    def +(person: Person):String = s"${this.name} is hanging out with ${person.name}"
    def unary_!() : String = s"${this.name} likes ${this.favouriteMovie}!!!"
    // Function with no params
    def isAlive : Boolean = true

    def apply(): String = s"${this.name} is applied"
  }

  val shreyas = new Person("shreyas","Interstellar")
  // This is valid is equivalent to shreyas.likes("Interstellar)
  // These are called infix notation (syntactic sugar)
  println(shreyas likes "Interstellar")

  val vegeta = new Person("vegeta","DragonBallZ")
  // + is an operations but a method
  println(shreyas + vegeta)

  // ALL OPERATORS ARE METHOD
  println(1+2)
  // Both are equivalent
  println(1.+(2))

  // Prefix notation
  // Unary Operators like -1,+1
  val x = -1        // 1.unary_-
  val y = 1.unary_- // equivalent to -1

  // unary prefix only work with - + ~ !
  // equivalent shreyas.unary_!()
  println(!shreyas)


  // postfix notation
  // this is available only for methods which has no parameters
  // This causes confusion for few people hence not recommended
  println(shreyas isAlive)

  // Apply method
  println(shreyas.apply())
  // equivalent to shreyas.apply()
  println(shreyas()) // It breaks the barrier with OOPS and Functional Programming

}
