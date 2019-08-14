def myTrippler(x:Int):Int = {
  x * 3
}
//can assign to a variable
val t = myTrippler(_)
//pass function to another function
println(t(3))

val x = 1 to 5
println(s" before trippling ${x.mkString(", ")}")
println(s" before trippling ${x.map(myTrippler).mkString(", ")}")

val d = (x:Int) => {x * 3}: Int
println(s" ${d(2)}")

def getVals(x:Int) = (c:Int) => {
  println(s"value of x recieved is $x, value of c: $c")
  val doubler = (x: Int ) => {x *2}:Int
  val tripple = (x:Int) => {x *3}:Int

  if ( x > 0 )
    doubler(c)
  else
    tripple(c)
}
val r = 1 to 5
val modified = r.map(getVals(-3))

var someValue:Int = _
println(s"some value sis 1 : $someValue")
someValue = 1
println(s"some value sis 1 : $someValue")


def someFloat(x:Int):Float= {
  x.floatValue()
}

val maxVal:Int = Int.MaxValue / Int.MinValue
println(s" maxVal calculated $maxVal")







