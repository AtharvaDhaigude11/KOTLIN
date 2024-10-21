fun main(){
    val max = max(2,4,3)
    println("$max")
}
fun max(a : Int, b : Int) = if (a>b) a else b
fun max(a: Double, b: Double ) = if (a>b) a else b
fun max (a: Int, b: Int, c :Int ): Int{
    if (a>=b && a>=c){
        return a
    }else if (b>=a && b>=c){
        return b
    }else{
        return c
    }
}