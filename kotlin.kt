val os = "androidx"
fun main() {
     val ver = if(os == "android") 
    	10 
    	else 
    	println("Hello World")
        
    
    fun whenBlock() {
    when(os) {
        "android" -> println("its android")
        "ios" -> println("its ios")
         else -> println("something different")
         //println("something different")
         //println("something different")
         
         
    }
    }
    whenBlock()
        
}

fun calculate(x: Int=10, y: Int=9, operation: (Int, Int) -> Int): Int {  // 1
    println("calculate invoked")
    return operation(x, y)                                          // 2
}

fun sum(x: Int, y: Int) = x + y                                     // 3

fun main() {
    //var defaultfun = calculate(::sum)
    val sumResult = calculate(4, 5, ::sum)                          // 4
    val mulResult = calculate(5, 5) { a, b -> a * b }               // 5
    println("sumResult $sumResult, mulResult $mulResult")
}
