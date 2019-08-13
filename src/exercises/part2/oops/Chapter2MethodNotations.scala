package exercises.part2.oops

object Chapter2MethodNotations extends App {
  /*
      1. Overload the + operator
         mary + "the rockStar" => new person "Mary (the rockStar) "

      2. Add an age to the Person Class
        Add a unary + operator => new person with "age + 1"
        +mary => mary with the age incrementer

      3.  Add a "learns" method in the Person class => "Mary learns scala"
          Add a learnsScala method, calls learns method with "scala"
          Use it in postfix notation

      4. Overload the apply method
          mary.apply(2) => "Mary watched Inception 2 times"
   */
    class Person(val name:String,val age:Int=0){
      def +(rockStarName:String):Person = new Person(s"${this.name} $rockStarName",age)
      def unary_+ : Person = new Person(this.name,this.age+1)
      def learns(course:String):String = s"${this.name} learns $course"
      def learnsScala():String = learns("scala")
      def apply(times:Int):String = s"${this.name} watched Inception $times ${if(times == 1) "time" else "times" }"
      def apply(): String = s"${this.name} is applied"
    }
    val person = new Person("shreyas",23)
    println(person(1))
    println((person + "B").name)
    println((+person).age)

}
