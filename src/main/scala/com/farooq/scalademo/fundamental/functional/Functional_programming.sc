import scala.annotation.tailrec
"""
What is functional programming?
  Functional programming is a way of writing software/code with pure functions and immutable values

   Why functional programming?
    Different approach to solve the problems , library design and data analysis

   What is a pure function?
      Input determines the output
      function doesn't change its input value
      function doesn't do anything else except computing an output
      It doesn't need to read/write anything from outside of the function
      No side effects ie anything

   Referential Transparency
       A function is referential transparent , if we can replace it with a
       corresnponding value without changing the programs behavior, given an input doesn't change sqrt(4) can be changed to 2?

   Why pure functions?
      safe programming
      functional composition or modular
      Easy to test
      Memoization : caching of deterministic functions results for later use
      can be lazy


   What is a first function
      If you can treat a function as a value , its a first class function
      i.e You can assign it to a variable
          You can pass it as an argument to other functions
          You can return it as a value

   What is a higher order function
       If a function does atleast one of the below
           pass function as arguments
           return function as result
"""
   def myTrippler(x:Int):Int = {
     x * 3
   }
   //can assign to a variable
   //can assign to a variable
   val t = myTrippler(_)
//pass function to another function
println(t(3))

val x = 1 to 5
println(s" before trippling ${x.mkString(", ")}")
println(s" before trippling ${x.map(myTrippler).mkString(", ")}")

  """
    What is an Anonymous function
     A function without any name is name anonymous function
     example :
         general function
          def myTrippler(x: Int):Int =  x*3
         Anonymous function
         This is also called function literal
         (x:Int) => {x * 3}: Int

     """
//Example of anonymous function
val d = (x:Int) => {x * 3}: Int
println(s" ${d(2)}")
"""
What is the purpose of anonymous function
  Inline function for one time use
  If you want do not want to clutter your api specs
"""
//Example
def getVals(x:Int) = (c:Int) => {

  println(s"s{value of x recieved is $x}")
  val doubler = (x: Int ) => {x *2}:Int
  val tripple = (x:Int) => {x *3}:Int

  if ( x > 0 )
    doubler(c)
  else
    tripple(c)
}
val r = 1 to 5
val modified = r.map(getVals(-3))

"""
  Why do need pass around functions > It's so confusing
  greater readability and abstraction
"""
//Example
 val employees: Array[String] = Array("farooq", "Srini", "Nazeer")
 // traditional way
 //for( i <- 0 to employees.length-1){
 //   println(s"bonus announcements ${employees(i)}")
 //}

def announceBonus(x:String)= {
   println(" bonus for : "+ x + "\n")

}
//take this collection and loop and apply some function
employees foreach  announceBonus

"""
   Immutability
   How can we program without modifying the data
   What are its benefits
     Adopts from mathematical approach
     Helps to create pure functions
     Helps to avoid certain problems
       like thread safety
       Example of data pipeline


   Example of factorial in tradional way
   versus recursive
  """
def fact(x:Int):Int = {
  var factVal = 1
  println(" I am here in fact with x "+x)
  if(x <= 0)
     return factVal
  else
    for (i <- 1 to x ){
      factVal *= i
    }
    factVal
  //println("fact Value = "+ factVal)
}
fact(5)

//Rewrite using recursion
def factRecursive(x:Int) : Int= {
  if (x <=0)
    1
  else
    x * factRecursive(x -1)
 }
println(s"factorial recursive ${factRecursive(5)}")


def factRectailRec(x:Int) : Int= {
  @tailrec
  def fact1(x:Int , currentFact:Int = 1):Int ={
      if(x <=0 )
        return currentFact
      else
        fact1(x-1 , currentFact * x)
  }
  fact1(5)
}
println(s"factorial recursive tail rec modified ${factRectailRec(5)}")

"""
Scala is  a strict
  variable assigment and function parameters
    It evaluates the expression only once
"""
//Example
val s = fact(1)/ fact(2)

//passing functions as parameters
def printAgain(x:Int)={
  println("I am in printAgain functions")

}

printAgain(fact(10)/fact(15))

//Higher order func, because f is used twice it revaluates f again
def printSomething(f: => Int ) = {
  val i = f
  println("I am in print Something function")
  i + i

}

printSomething(fact(10)/fact(15))



val maxVal:Int = Int.MaxValue + Int.MaxValue
println(s" maxVal calculated $maxVal")

val maxVal1:Int = 2 / Int.MinValue
println(s" maxVal calculated $maxVal1")



def checkLazy()={
  var x = { println("x"); 15 }
  lazy val y = { println("y"); x+1 }
  println("-----")
  x = 17
  println("y is: " + y)
}

checkLazy()

def fabinocciStream(a:Int , b :Int) : Stream[Int] = {
  a #:: fabinocciStream(b, a + b)
}

val str1 = fabinocciStream(1,2)

str1.takeWhile(_<10) foreach println

lazy val lazee:Int = 100




















