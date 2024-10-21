fun main() {
    sayHello("Batman", 20)
    val retrieveData = false
    if (retrieveData){
        getData("hello")
    }else{
        showMessage()
    }

    val greater = getMax(3,5)
    println(" The greater no. is : $greater")
    val bigNumber = maxNumber(3,1)
    println(" The bigger  no. is : $bigNumber")


}

fun sayHello(name: String, age: Int) {  // name and age are 'val' type so can't be reassigned
    println("Hello, $name aged $age")
}

fun getData(data: String) {
    println("your data is $data")
}
fun showMessage() {
    println("there is error")
}

//NOW WE WILL SEE HOW TO RETURN A VALUE FROM FUNCTION
fun  getMax(a: Int,b : Int) : Int {
    val max = if (a>b) a else b
    return max  // THE FUNCTION ENDS WHEN IT ENCOUNTERS THE RETURN STATEMENT. YOU CAN WRITE 'RETURN' STATEMENT TO FUNCTIONS WITHOUT GETTING ANY VALUE FROM IT AND IT WILL DO SAME.
// return if(a>b) a else b  //  shorter way
}

// SINGLE EXPRESSION FUNCTION CONSIDER ABOVE 'getMax' for example

// fun getMax(a : Int, b: Int) = if(a>b) a else b //

// ABOVE IS THE EXAMPLE OF HOW TO WRITE A SINGLE EXPRESSION FUNCTION.


// FOR TWO RETURN STATEMENTS
fun maxNumber(a: Int,b: Int): Int {
    if (a>b){
        return a
    }else{
        return b
    }
}
