package exercises.part2.oops

object Chapter1Oops extends App {
  val c = new Counter(1)
  c.increment.increment.print
  c.increment(5).print
}
/*
      Novel and a Writer

      Writer: first name , last name ,age
              - method full name

      Novel : name, year of release ,author (Writer)
        - authorAge
        - isWrittenBy(author)
        - copy (new year of release ) = new instance of Novel
   */
class Writer (firstName:String,lastName:String,val age:Int=0){
  def fullName():Unit = println(s"$firstName $lastName")
}
class Novel(name:String,year:Int=0,author:Writer){
  def authorAge():Int = this.author.age
  def isWrittenBy(author: Writer):Boolean = author == this.author
  def copy (newYear:Int):Novel = new Novel(this.name,newYear,this.author)
}
/*
    Counter class
      - receives an int value
      = method current count
      - method to increment/decrement => new Counter
      - overload inc/dec to receive an amount
 */
class Counter (val count:Int = 0){
  def currentCount ():Int = this.count
  def increment ():Counter = new Counter(count+1)
  def decrement():Counter = new Counter(count-1)
  def increment(newCount:Int):Counter = {
    if ( newCount <= 0) this
    else increment().increment(newCount-1)
  }
  def decrement(newCount:Int):Counter= {
    if (newCount<= 0 )this
    else decrement().decrement(newCount-1)
  }
  def print():Unit= println(s"Value:"+this.count)
}
