fun main() {
    var x = 10
    var y = 15

    println("x + y = ${x+y}")
    println("x - y = ${x-y}")
    println("x * y = ${x*y}")
    println("x / y = ${x/y}")
    println("x % y = ${x%y}")

    var result = x + y
    println("\nresult of x + Y is $result")
    result +=2
    println("result + 2 = $result")
    result -=2
    println("result - 2 = $result")
    result *=2
    println("result * 2 = $result")
    result /=2
    println("result / 2 = $result")
    result %=2
    println("result % 2 = $result\n\n")

    /*
      IF ELSE STATEMENTS
     */
    val myNum = 9
    if (myNum >145)
    {
        println("The no is Greater than 145")
    }
    else if(myNum>=120){
        println("The no is Greater Than equal to 120")
    }
    else{
        println("Invalid")
    }

}