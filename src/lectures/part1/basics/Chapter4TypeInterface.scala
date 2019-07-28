package lectures.part1.basics

// What compiler knows without us telling about it.
// Eg:- 1.Function with no return type
//      2. val message = "Hello,world" what compiler does val message:String = "Hello,world"
object Chapter4TypeInterface extends App {
  // Compiler will try to find out the return type.  If block returns a 0 which is
  // a Int, but else block has another function call and it tries to find the return of that
  // and this way compiler gets confused and throws an error
  def factorial (n:Int):Int = {
    if (n >=1) 1
    else n * factorial(n-1) // error is thrown
  }

}