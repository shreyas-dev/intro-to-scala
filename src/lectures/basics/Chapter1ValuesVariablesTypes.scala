package lectures.basics

object Chapter1ValuesVariablesTypes extends App {

    //  Vals are immutable
    // No Semicolon required
    val x:Int=32
    //Used to print with \n
    println(x)

    // Compiler can infer types.
    val x1=21

    // ; are multiple statements in same line. Not recommended though
    val s:String = "A string";val anotherString="goodbye"

    //Character initialization
    val aChar:Char ='a'

    //Boolean initialization
    val aBoolean: Boolean = true

    //Int,Short,Long,Byte
    val anInt:Int = x
    val aShort:Short = 221
    val aLong1:Long = 12l
    val aLong2:Long = 1212121211121112L
    val abyte:Byte = 12

    //Float,Double
    val aFloat = 3.14f
    val aDouble = 3.14


    //variables
    var aVariable:Int = 2

    //var can be reassigned
    aVariable = 5 // these are called side effects . These are useful because allow of us to see that they are doing.

    // Programs with no side effects are simpler to understand.

}
