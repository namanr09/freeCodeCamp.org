fun main(){
    var a = 10
    // println(a)
    // println(sayHello(name = "Kotlin"))
    // println(add(b = 5, a = 10))

    if(a & 1 == 0) {
        println("a is even")
    } else {
        println("a is odd")
    }
}

fun sayHello(name: String): String {
    println("Hello, $name!")
    return "Hello, $name!"
}

fun add(a: Int, b: Int): Int  = if (a > b ) a  else b

// default parameters
fun greet(name: String = "World", greeting: String = "Hello"): String {
    return "$greeting, $name!"
}



fun sum(vararg numbers: Int): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}
fun sumMore(vararg numbers : Int) {
    numbers.forEach { number ->
        println(number)
    }
}




// loops 
fun loops(){

    for (i in 1..5) {
        println("Iteration $i")
    }
    // include 5
    for (i in 1 until 5) {
        println("Iteration $i")
    }
    // do not include 5

    // reverse order
    for (i in 5 downTo 1) {
        println("Iteration $i")
    }

    for (i in 1..10 step 2) {
        println("Iteration $i")
    }
    var a = 10
    while (a < 20) {
        println("a is $a")
        a++
    }
    do {
        println("a is $a")
        a++
    } while (a < 30)

    // continue and break
    for (i in 1..10) {
        if (i == 5) {
            continue // skip the rest of the loop when i is 5
        }
        if (i == 8) {
            break // exit the loop when i is 8
        }
        println("Iteration $i")
    }
    if(1){
        println("This is true")
    } else {
        println("This is false")
    }

    // Operation	Kotlin Syntax	Equivalent C/C++
    //     AND	        a and b	        a & b
    //     OR	        a or b	        a | b
    //     XOR	        a xor b	        a ^ b
    //     Inversion (NOT)	a.inv()	    ~a
    //     Left shift	a shl b	    a << b
    //     Right shift	a shr b	    a >> b
    //     Unsigned shift	a ushr b	    a >>> b (Java)
}