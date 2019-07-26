package lectures.basics

object Chapter2Expressions extends App {
  val x = 1 + 2 // Expression, the compiler will assign x with 3 and also with type Int
  // mathematical expression include
  // + - * / & | ^ << >> <<< (left shift with zero extension) >>> (right shift with zero extension)
  println( 3 == x) // Logical Operators

  var aVariable = 3
  aVariable +=3 // equals to aVariable = aVariable + 3 ... side effects
  println(aVariable)

  // Instruction vs Expressions
  // Something to do (Like Java , you always tell the compiler to do this,that) vs Value , every single bit compute with the value

  // If expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 4 else 2  // This is called IF expression and not an instruction
  println(aConditionedValue)
  println(if (aCondition) 4 else 2)


  // There are loops in scala but are not imperative and not recommended and only runs on var and not val

  var i = 0
  while (i < 10){
    println(i)
    i += 1
  }

  // Never write this again
  // Everything in scala is an expression, only val,imports ,var are not expression.

  val aWeirdValue = (aVariable = 3) // this statement returns a Unit , which is similar to a void in Java/C, which means
                                    // don't return anything.
  println(aWeirdValue)              // prints nothing

  val  aWhile = while (i < 10){     // a while return a unit.
    println(i)
    i += 1
  }

  // side effects : println ,whiles ,reassigning returns unit.
  //Code blocks
  val aCodeBlock = {
    val y = 2 // outside the block y is not available called scope.
    val z = y +1
    println()
    if (z > 2) "hello" else "goodbye" // the last expression inside the block is the value of the block.
  }
  println(aCodeBlock)
}
