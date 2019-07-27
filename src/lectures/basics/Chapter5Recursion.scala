package lectures.basics

import scala.annotation.tailrec

object Chapter5Recursion extends App {
  def factorial(n:Int):BigInt  = {
    if(n <= 1) 1
    else n * factorial(n-1)
  }
  // Print's 0 or throws stack over flow exception
  println(factorial(5000))


  // A Tail Recursive function is a function where recursion is the last expression of the block
  def anotherFactorial(n:Int):BigInt = {
    // tailrec Annotation checks will throw an error if it's not a Tail Recursion function
    @tailrec
    def factorialHelper(x:Int,accumulator: BigInt):BigInt = {
      if (x <= 1) accumulator
      else factorialHelper(x-1,x*accumulator)
    }
    factorialHelper(n,1)
  }

  println(anotherFactorial(5000))
}
