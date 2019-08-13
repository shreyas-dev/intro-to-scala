package lectures.part2.oops

object Chapter1BasicClass extends App {
  // object instantiation
  val person = new Person("Shreyas",21)
  println(person.age)
  println(person.x)
  println(person.greet())

}

// Constructor
// adding val to age makes it accessible by object.age
// Can specify default value
class Person(name:String, val age:Int = 0) {
  //can have fields
  val x = 2
  println(1+x)

  // Even though name is not a field it can be accessed vi this.name
  // method
  def greet(name:String):Unit = println(s"${this.name} says:Hello $name")
  //method overloading
  // here name is the parameter passed in the constructors args
  def greet ():Unit = println(s"Hi, I am $name")

  //multiple constructors
  // Make use of this keyword
  def this(name:String) = this(name,0)
  def this() = this("Shreyas")
}
