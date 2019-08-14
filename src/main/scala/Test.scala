class Test {

}



object MRSIGLETON{

  def justPrint(inputStr: String){
    println(" prinitng line :",inputStr)
  }

  def main(args:Array[String]): Unit ={
    MRSIGLETON.justPrint("hello world singleton")

  }
}