class Address(val street:String , val city:String , state : String){
   private var _pincode:String = ""

   def pincode = _pincode
   def pincode_(value:String) {
     if(_pincode.isEmpty){
       _pincode = value
     }
   }


}

object Address{

  def main(args: Array[String]){

    def apply(    val street: String,     , val city: String ,     , state: String): Address = new Address(
    val street,
    val city, state
    )

    val addr1 =  Address(street = "pavonia", city="Jersey city", state="NJ")
    addr1._pincode="1234"

    println(addr1.pincode toString)

  }
}


