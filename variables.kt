// 44mins 
// This file is part of the freeCodeCamp.org curriculum.
// Variables 

fun main(){
    var a: Int = 10
    a = 20 // reassigning the value of a
    // a = "hello" // This will cause an error because a is of type Int

    val b: String = "hello" // val is used to declare a constant
    // b = "world" // This will cause an error because b is a constant

    // type of variables in kt
    var c: Byte = 10
    // Byte can hold values from -128 to 127
    var d: Short = 20
    // Short can hold values from -32768 to 32767 -> 2^15
    // Int can hold values from -2,147,483,648 to 2,147,483,647 -> 2^31
    var e: Long = 30L
    // Long can hold values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 -> 2^63
    // Float can hold values with decimal points, but with less precision than Double
    var f: Float = 10.5F
    // Double can hold values with decimal points with more precision than Float
    var g: Double = 20.5
    // Char can hold a single character
    var h: Char = 'A'
    // Boolean can hold true or false
    var i: Boolean = true
    // String can hold a sequence of characters
    // In Kotlin, String is a class, not a primitive type

    // unsigned types
    var u: UByte = 10u
    var v: UShort = 20u
    var j: String = "Kotlin"
    val intMax : Int = Int.MAX_VALUE
    val byteMax : Byte = Byte.MAX_VALUE
    val UByteMax : UByte = Byte.MAX_VALUE.toUByte()
    // funtion to check type of variable
    // fun checkType(vararg args: Any) {
    //     for (arg in args) {
    //         println("Type of $arg is ${arg::class.simpleName}")
    //     }
    // }
    // checkType(a, b, c, d, e, f, g, h, i, j, u, v)
    println("hello world $a $b $c $d $e $f $g $h $i $j") 
}