package lectures.part2.oops

object Chapter5AbstractDataTypes extends App {

  // Abstract, can't be instantiated
  abstract class Animal {
    // abstract val
    val creatureType:String
    val creatureName:String = "animal"
    // abstract method
    def eat:Unit
  }

  class Dog extends Animal{
    // Override keyword is optional as creatureType is not defined in parent
    val creatureType: String = "domestic"
    // Override keyword is mandatory as creatureName is defined in parent
    override val creatureName: String = "dog"
    override def eat: Unit = println("crunch,crunch")
  }
  // TRAITS
  trait Carnivore {
    def eat (animal:Animal) :Unit
    // Traits can also have definitions
    val preferredMeal:String = "fresh meat"
  }

  trait ColdBlooded
  // Class can have multiple Traits
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "wild"
    override val creatureName: String = "crocodile"
    override def eat(animal: Animal): Unit = println(s"I am a ${this.creatureName} and I'm eating a ${animal.creatureName}")
    override def eat: Unit = println("crunch,crunch")
  }

  val dog = new Dog
  val croc = new Crocodile
  // Synthetic sugar
  croc eat dog

  // traits vs abstract classes
  // 1 - traits do not have  constructor parameters
  // 2 - multiple traits may be inherited by the same class
  // 3 - traits are behavior , abstract classes are a "thing"


}
