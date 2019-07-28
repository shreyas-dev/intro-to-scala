package lectures.part1.basics

object Chapter6CallByNameAndValue extends App {

    def callByValue(x:Long) : Unit={
      println("Call By Value:"+x)
      println("Call By Value:"+x)
    }
    // => by name parameter
    def callByName(x : => Long) :Unit = {
      println("Call By Name:"+x)
      println("Call By Name:"+x)
    }
    // In call by Value function the System.nanoTime() is executed first and passed as an parameter
    callByValue(System.nanoTime())
    // In call by Name function the System.nanoTime() is taken as an expression and is evaluated
    // when required inside the function
    callByName(System.nanoTime())

    // Eg 2
    def infinite():Int= 1+infinite()

    def printFirstParameter(x:Int,y : => Int):Unit= println(x)

    // Throws StackOverflowError Exception, because first parameter is pass by value.
    // printFirstParameter(infinite(),34)

    // y is lazily loaded and is not evaluated until it is not used inside the function
    printFirstParameter(34,infinite())
}
