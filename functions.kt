fun main(){
    var a = 10
    println(a)
    println(sayHello(name = "Kotlin"))
    println(add(b = 5, a = 10))
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