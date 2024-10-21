 fun main(){
     sendMessage("Alexa")
     sendMessage("Bixby")
     sendMessage("Siri","How may i help you")
     println(sum(10,20,30,40,50,60,70,80,90))
 }
 fun sendMessage(name: String,message: String =" / "){ // HERE 'MESSAGE' IS DEFAULT PARAMETER
     println("Name: $name Message: $message")
 }
 // FOR VARARG (it is used to pass indefinite arguments to function)
 fun sum(vararg numbers: Int): Int {
     var result = 0
     for (number in numbers){
         result += number
     }
     return result
 }
