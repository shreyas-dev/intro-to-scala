package exercises.part2.oops

object Chapter6Generics extends App {

  // Lets make Mylist generic


  abstract class MyList[+A] {
    /*
        head = first Element of the list
        tail = remainder of the list
        isEmpty = is this list empty
        add(int) => new list with this element added in the front
        toString => a string representation of the list
     */
    def head: A
    def tail: MyList[A]
    def isEmpty:Boolean
    def add[B >: A](element:B):MyList[B]
    def getAllElements:String
    // polymorphic call
    override def toString: String = "[ "+this.getAllElements+" ]"
  }

  // ??? means nothing
  object Empty extends MyList[Nothing] {
    override def head: Nothing = throw new NoSuchElementException

    override def tail: MyList[Nothing] = throw new NoSuchElementException

    override def isEmpty: Boolean = true

    override def add[B >: Nothing](element: B): MyList[B] = new Const(element,Empty)

    override def getAllElements: String = ""
  }

  class Const[+A](h: A,t:MyList[A]) extends MyList[A] {
    override def head: A = h

    override def tail: MyList[A] = this.t

    override def isEmpty: Boolean = false

    def add[B >: A](element: B): MyList[B] = new Const(element,this)

    override def getAllElements: String =
      if(t.isEmpty) h+""
      else s"$h ${this.t.getAllElements}"
  }

}
