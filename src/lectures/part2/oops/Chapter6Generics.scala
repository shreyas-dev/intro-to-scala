package lectures.part2.oops

class Chapter6Generics extends App {
  // Use A for generics , just like how T is in java
  // This is an INVARIANT LIst, Go to the bottom for explanation
  class MyList[A]{
    // use of type A
  }
  class  MyMap[Key,Value]

  val listOfThings = new MyList[Int]
  val listOfThingsInStrings = new MyList[String]

  // Objects can't be parameterised
  // Generic methods
  object MyList{
    def empty[A]:MyList[A] = ???
  }
  val emptyList = MyList.empty[Int]

  // variance Problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // Question: If Cat extends Animal , Does LIST of cat extends LIST OF ANIMAL?
  // There are 3 Answers to that question
  // 1. CoVariance
  // 2. InVariant
  // 3. CONTRAVARIANT

  // 1. Yes List[Cat] extends List[Animal] , this is called COVARIANCE
  // We make use of + symbol to tell the compiler of covariance
  class CoVarianceList[+A]
  val  animal:Animal = new Cat
  // Valid as CoVarianceList
  val animalList:CoVarianceList[Animal] = new CoVarianceList[Cat]

  // animalList.add(new Dog()) -> HARD QUESTION -> should be
  // possible but will pollute the data in the list
  // ANSWER is we return a list of Animal


  // 2. No => InVariance
  class InVariantList[A]

  // Not Valid
  //  val inVariantList:InVariantList[Animal] = new InVariantList[Cat]


  // 3. Hell no, CONTRAVARIANT
  class Trainer[-A]

  // I want a trainer to train my cat
  val contravariantList:Trainer[Cat] = new Trainer[Animal]


  // Bounded Types
  // allow you to use your generics classes only for certain type that are a
  // subclass of a different type or superclass of a different type

  // Class Cage accept classes which are subclass of a Animal
  class Cage [ A <:Animal] (A:Animal)
  val cage = new Cage[Animal](new Dog)

  class Cage1[A >: Animal ](A:Animal)

  class MyList1[+A]{
    // This means for if to a list of A I put in a B , then this list
    // will turn into list of B
    def add[B >: A](element: B) :MyList1[B] = ???
    /*
      Where
       A - Cat
       B = Dog  = Animal
     */
  }
}
