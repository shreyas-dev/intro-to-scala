package lectures.basics

object Chapter3Functions extends App {
  // def is keyword for function
  // followed by a function name: aFunction
  // inside a bracket val name followed by its type
  // followed by a semicolon and return type
  def aFunction(a: String,b:Int):String = {a +  " " + b}

  // No return type  needed in case of non-recursive function
  def aFunctionWith(a: String,b:Int) = {a +  " " + b}

  // No parameter less function
  def aParameterlessFunction():Int = 42

  // Calling a function is also a expression
  println(aFunction("hello",3))
  // Can be called without a function
  println(aParameterlessFunction)

  // Always prefer recursive function over while loops
  // Need return type for recursive functions
  def repeatativeFuntion(aString:String,n:Int):String = {
    if (n == 1 ) aString // no need of return here , remember everything is an expression , hence the function is evaluated to aString
    else repeatativeFuntion(aString+aString,n-1)
  }
  println(repeatativeFuntion("Hello ",3))

  // WHEN  YOU NEED LOOPS, USE RECURSION. DONT USE IMPERATIVE CODE.

  // A function with Unit return (void)
  def aFunctionWithSideEffects(aString:String):Unit = println (aString)

  // We can define an auxiliary function inside a block code and the function can be used inside the code block
  def aBigFunction(n:Int):Int = {
    // Always use return type for best practise
    def aSmallerFunction (a:Int, b:Int):Int = a+b

    aSmallerFunction(n,n+1)
  }


}
