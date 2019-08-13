package lectures.part1.basics

// This lecture explains String operations provided by Scala
object Chapter8StringOps extends App {
  val string = "Hello, I am learning Scala!"

  // Java Commons Operations

  // charAt(index) returns char at an index starting from 0. l in this case
  println(string.charAt(2))

  // substring(start,end) returns a sub-string of s string from start index to end index starting from 0
  println(string.substring(7,11))

  // Splits the string with regex provided and converts it into list.
  println(string.split(" ").toList)

  // Boolean operation to check whether string starts with the specified regex
  println(string.startsWith("Hello"))

  // Replaces the regex found in the string with the replacement provided
  println(string.replace(" ","-"))

  //Converts the string to lowercase
  println(string.toLowerCase())

  // Prints the number of characters in the string
  println(string.length)

  // Scala specific String operations

  val aNumberString = "2"
  // Converts an string integer to integer
  val aNumber = aNumberString.toInt

  // +: is used to suffix
  // :+ is used to prefix
  println('a' +: aNumberString  :+ 'z')

  // Reverses the string
  println(string.reverse)

  // Returns a string until the index specified
  println(string.take(3))

  // String Interpolation


  val name = "Shreyas"
  val age = 21

  // the starting s indicates the compiler to replace variables with it's value
  // this is called S-Interpolation
  val greeting = s"Hello , I am $name and I am $age years old"
  // Using {} to evaluate expressions inside the interpolation
  val greetingWithOnePlus = s"Hello , I am $name and I am ${age+1} years old"

  // F-Interpolation
  // S-Interpolation + printf like format

  val speed = 1.20f
  var burgersToEat = f"$name%s can eat $speed%2.2f burgers per minute"
  println(burgersToEat)

  // raw Interpolation
  // \n is printed literally and is not escaped
  println(raw"This is a \n newline character")
  // But in case of vals it is escaped
  val escaped = "This is a \n newline character"
  // \n is escaped to newline
  println(raw"$escaped")


}
