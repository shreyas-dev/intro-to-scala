package lectures.part2.oops

// Class level functionality -> Like in Java , accessing a static field using Person.age
// without instantiating the class.
object Chapter3Objects extends App {
  // SCALA DOES NOT HAVE CLASS LEVEL FUNCTIONALITY ("static")
  // It has something even better called object

  // Objects do not receive Args
  // Cannot be instantiated
  object Person {
    val N_EYES = 2

    def canFly:Boolean = false

    // This is called factory method
    // Sole purpose of this method is to produce Person instance
    def apply(mother:Person,father:Person) = new Person("Son")
  }
  class Person(name:String) {
    // instance level functionality
  }
  println(Person.N_EYES)
  // OBJECTS IN JAVA vs SCALA

  // Objects in Scala are Singleton , which can't be instantiated
  val shreyas = Person
  val jackMa = Person
  // Returns true
  println(shreyas == jackMa)

  // Companions -> Writing Object and class in the class to separate
  // singleton and non singleton members

  val shreyasPerson = new Person("shreyas")
  val partner = new Person("Partner")
  val bobbie = Person (shreyasPerson,partner) // This looks like a constructor but it's not.


  // Scala Applications = Scala object with
  // def main(args:Array[String]):Unit -> this is converted into JVM based byte code
}
