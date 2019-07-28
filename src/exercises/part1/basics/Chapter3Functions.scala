package exercises.part1.basics

object Chapter3Functions extends App {
  /*
      1. A greeting function (name,age) => "Hi , my name is $name and I am $age years old"
      2. Factorial function 1 * 2 * 3 * 4 *....*n
      3. A Fibonacci Function f(1) = 1 , f(2) =1 f(n)=f(n-1)+f(n-2)
      4. Find n is a prime
   */
    def greet(name:String,age:Int):String = "Hi,my name is "+name+" and I am "+age+" years old.\n"

    def factorial(n:Int):Long = {
      if (n == 0) 1
      else
        n*factorial(n-1)
    }
    def fibonacci (n:Int):Int = {
      if (n == 1)  1
      else if ( n == 2) 1
      else fibonacci(n-1)+fibonacci(n-2)
    }
    def isPrime(n:Int):Boolean = {
      def isPrime(i:Int):Boolean={
        if(i <= 1) true
        else n % i != 0 && isPrime(i-1)
      }
      val i = n/2
      isPrime(i)
    }
    println(factorial(6))
    println(fibonacci(8))
    println(isPrime(4))



}
