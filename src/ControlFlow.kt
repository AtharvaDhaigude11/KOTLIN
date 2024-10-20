import kotlin.math.min

fun main() {
    // WHEN statement
    val alarm = 10
    when (alarm) {
        12 -> println("Alarm is 12")
        20 -> println("Alarm is 20")
        else -> println("Exits the WHEN block")
    }
    /*
    IN WHEN BLOCK we pass the argument or variable in parentheses and compare the its value with the values we list in
    curly braces.
    '->' we compare the values on left side of this operator and if the value match then execute the code on the right.
     */
    val time = 19
    when (time) {
        in 1..10 -> println("the no. is in the range 1...10\n ")// you can also write an expression to check in a range
        // !in 1 ..10 -> println("the no. is in the range 1...10 ")// here we have used logical NOT operator
        13, 7, 14 -> println("the time is $time") // we can also write the expressions in one line like this
        else -> println("the time is $time")
    }

    // using when as a expression for variable
    val text = when (time) {
        in 1..10 -> {
            "the no. is in the range 1...10 $time text1"
        }

        13, 7, 14 -> {
            "the time is $time text2"
        }
        else -> {
            "the time is $time text3"
        }
    }
    println(text)
    // other way
    val minute = when {
        time < 10 -> " the minute is less than  to $time" // NOTE: here all expressions must be boolean 
        time == 10 -> " the minute is equal to $time"
        time > 10 -> " the minute is greater than  $time"
        else -> "NOT IN THE RANGE "
    }
    println(minute)
}
