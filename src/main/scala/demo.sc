//creating variables
// Scala is type inference language , however you can provide the return types

print( "hello world 1111")

val a: String = "this is a hello world string"

println(a)

var b = " I am a variable"
println(b)
b = "I am changed variable value now"
println(b)

def min(x:Int , y : Int) : Int = {
  if (x < y )
       return x
  else
     return y
}

def min1(x:Int , y : Int) : Int = {
  if (x < y )
     x
  else
     y
}

def min2(x:Int , y : Int)  = {
  if (x < y )
    x
  else
    y
}

println("minumum is :"+min(5,4))
println("minumum1 is :"+min1(5,4))
println("minumum1 is :"+min2(5,4))

val map = Map(1 -> "a" , 2 -> "b")
for ((k,v) <- map) printf(" value of k is : %s , v is : %s \n", k, v)
map.keySet.foreach(keyVal => printf(" value of key set is %s\n",keyVal) )
map.values.foreach(values => printf(" value of value is %s\n",values) )






