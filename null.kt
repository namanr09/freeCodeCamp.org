fun main(){
    // null values
    var a: String? = null // nullable type
    println(a) // prints: Hello, Kotlin!
    a = "Hello, Kotlin!" // reassigning the value of a
    println(a) // prints: Hello, Kotlin!
    if(a != null) println(a.length) // prints: Hello, Kotlin!

    // 
    print(a?.length)
    // prints: 13
    // safe call operator (?.) is used to access the length property of a nullable type
    // if a is null, it will not throw a NullPointerException, instead it will return null
    // Elvis operator (?:) is used to provide a default value if a is null
    val length = a?.length ?: 0 // if a is null, length will be 
    val str = a ?: "string"
    println(a!!.length) // prints: 13
}