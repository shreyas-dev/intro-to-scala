package exercises.basics

import scala.annotation.tailrec

object Chapter4Recursion extends App {
 // Create a Tail recursion function for
  /*
    1. Concatenate a string n times.
    2. isPrime tail recursion
    3. Fibonacci Function
   */

  @tailrec
  def concat(string: String,n:Int,accumulator:String):String = {
    if (n <=0) accumulator
    else concat(string,n-1,string+accumulator)
  }
  println(concat("Hello",3,""))

  def isPrime (n: Int):Boolean = {
    @tailrec
    def isPrimeHelper(t:Int,accumulator:Boolean):Boolean = {
      if (!accumulator) false
      else if (t<=1) true
      else isPrimeHelper(t-1,!(n%t==0)&& accumulator)
    }
    isPrimeHelper(n/2,true)
  }
  println(isPrime(53))


  def fibonacci (n:Int):Int = {
    @tailrec
    def fib(i:Int,last:Int,nextToLast:Int):Int ={
      if ( i >= n) last
      else fib(i+1,last+nextToLast,last)
    }
    if (n>=2)
      fib(2,1,1)
    else
      1
  }
  println(fibonacci(8))
}
