fun main(){
    //val text: String = null  // if You write like this to assign null value in KOTLIN then it will throw an error
    // To assign null value we  use '?' after the Data Type to make it NULLABLE
    val text: String? = null //this does not give an error.
    println(text)

   // val text2: String? = "ALEX"
   // println(text2.length)    THIS WILL GIVE AN ERROR AS THE COMPILER SAYS THAT FIRST CHECK WHETHER THE VALUE IS NULL BEFORE PERFORMING

   var text2 : String? = "Alex"
   /*if (text2 != null)
   {
       println(text2.length)
   }else{
       println("the value is null ")
   }*/
   // a short way to write above code is
   println(text2?.length) // this will give the same result here '?' comparable to IF block we wrote above

   // FOR NULL POINTER EXCEPTION
    text2  = null
   // println(text2!!.length)  // HERE WITH THE USE OF '!!' WE CAN THROW THE NULL POINTER EXCEPTION

   // ELVIS OPERATOR '?:'

   var text3 = text2 ?: "the variable is null"  // what ELVIS OPERATOR is doing here is, if the text2 has null value the
                                    //  assign the value on the right and if text2 has value then assign it to text3.
    println(text3)
}