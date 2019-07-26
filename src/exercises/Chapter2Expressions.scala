package exercises

object Chapter2Expressions extends App {

  // difference btw "hello world" and println ("hello world")
  // first one is hello world(string ) second one is of the value of Unit where println is a side effect
  val someValue = {
    2<3
  }
  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

  // value of someValue and someOtherValue
  println(someValue)
  println(someOtherValue)
}
