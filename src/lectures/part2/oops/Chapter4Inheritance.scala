package lectures.part2.oops

object Chapter4Inheritance extends App{
  // Scala has only single class inheritance

  class Animal {
    // Can't be extended
    protected val creatureType = "wild"
    private def eat = println("nonom")
    protected def eating = println("nonom")
  }
  sealed class Cat extends Animal {
    def crunch  :Unit = {
      eating
      println("Crunch Crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  //constructor behave in a different way in scala

  class Person(name:String,age:Int){
    def this(name:String) = this(name,0)
  }
  // Even at class level we need to provide Person constructor params to extend
  //  class Adult(name:String,age :Int,idCard) extends Person -> Invalid
  //  class Adult(name:String,age :Int,idCard) extends Person(name,age) -> Valid

  class Adult(name:String,age :Int,idCard) extends Person(name) // Valid cause constructor exists with name param

  // Overriding

  class Dog extends Animal {
    // Use override key word
    // It even works for val var too
    override val creatureType = "domestic"
    override def eating: Unit = println("crunch,crunch")
  }
  // The following is also valid, override in constructor
  class Dog1(override val creatureType:String) extends Animal
  val dog = new Dog
  dog.eating

  //type substitution (polymorphism)
  val unknownAnimal = new Dog()
  unknownAnimal.eating



  /* preventing overrides
    1. use word "final"
    2. use final on class
    3. seal the class (sealed keyword) - you can extend
       classes in this file but prevent extensions in other file

   */

  // All numeric class types are final and String is also final
}
