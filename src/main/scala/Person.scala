import java.util.logging.Level

class Person(var name: String , var location:String,var lastName:String = "") {
  def this(name: String,  lastName:String){
    this(name, location="Not specified", lastName="" )
  }

}

object Person{
  def main(args: Array[String]){

    val p1 = new Person(name = "farooq", lastName = "Mohammed")
    print(p1.location)

    MRLOGGER.log(Level.INFO, "from person class")
  }

}

//Single tone object

object MRLOGGER{

  def log(level: Level,string : String){
    println("calling from log")
    printf("%s %s",level,string)
  }

  def main(args: Array[String]) {
    MRLOGGER.log(Level.INFO,"Hello from scala")
  }
}


