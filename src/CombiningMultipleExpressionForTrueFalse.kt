fun main() {
// HERE WE WILL SEE LOGICAL AND OPERATOR
    val isStudent = true
    val marks = 100
    if (isStudent && marks >= 80) {
        println("AS BOTH OF THE GIVE CONDITION ARE SATISFIED THE IF BLOCK IS EXECUTED\n")
    } else {
        println("AS NONE OF THE GIVE CONDITION IS SATISFIED THE ELSE BLOCK IS EXECUTED")
    }

// HERE WE WILL SEE LOGICAL OR OPERATOR

    val num1 = 3
    val num2 = -3
    if ((num1 > 0) || (num2 == 0)) {
        println("AS ONE OF THE GIVE CONDITION IS SATISFIED THE IF BLOCK IS EXECUTED")
    } else {
        println("AS NONE OF THE GIVE CONDITION IS SATISFIED THE ELSE BLOCK IS EXECUTED")
    }

    // NOW WE WILL SEE HOW TO PASS IF AND ELSE STATEMENT AS EXPRESSION TO VARIABLE.

    val x = 3
    val y = 5
    val text = if (x > 0 || y < 5)
        "\nthis is text1 which will execute when IF returns true"
    else 5
    /* we can assign an int value as well and this holds true because if the IF condition holds true then and only then the value of
     IF BLOCK is assigned which is string otherwise the value in the ElSE block is assigned and its type will be inferred. */
    println("$text")
}