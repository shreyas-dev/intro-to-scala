package exercises.part2.oops

object Chapter5MyList extends App {
  abstract class MyList {
    /*
        head = first Element of the list
        tail = remainder of the list
        isEmpty = is this list empty
        add(int) => new list with this element added in the front
        toString => a string representation of the list
     */
    def head: Int
    def tail: MyList
    def isEmpty:Boolean
    def add(element:Int):MyList
    def getAllElements:String
    // polymorphic call
    override def toString: String = "[ "+this.getAllElements+" ]"
  }

  // ??? means nothing
  object Empty extends MyList {
    override def head: Int = throw new NoSuchElementException

    override def tail: MyList = throw new NoSuchElementException

    override def isEmpty: Boolean = true

    override def add(element: Int): MyList = new Const(element,Empty)

    override def getAllElements: String = ""
  }

  class Const(h:Int,t:MyList) extends MyList {
    override def head: Int = this.h

    override def tail: MyList = this.t

    override def isEmpty: Boolean = false

    override def add(element: Int): MyList = new Const(element,this)

    override def getAllElements: String =
      if(t.isEmpty) h+""
      else s"$h ${this.t.getAllElements}"
  }

  val list = new Const(2,new Const(4,new Const(5,Empty)))
  list.add(6)
  println(list.head)
  // polymorphic call
  println(list.toString)

}
