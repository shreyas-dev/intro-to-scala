package lectures.part1.basics

object Chapter7DefaultAndNameArgs extends App {
  // specifying accumulator as 1 if not specified during function call
  def factorial(n:Int,accumulator:Int = 1):Int={
    if (n <= 1) 1
    else factorial(n-1,n*accumulator)
  }

  println(factorial(3))

  // Multiple Defaults Value
  def savePicture(format:String = "jpg",  width:Int = 1920, height:Int=1080):Unit = {
    println("Picture Saved")
  }
  // Invalid function call as compiler doesn't know to which the parameter the value
  // savePicture(1)
  // savePicture("jpg") also invalid
  // Specifying parameters in the function call itself
  savePicture(width = 800,height = 720,format = "png")

}
