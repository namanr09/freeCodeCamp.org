fun main() {
    val names :Array<String> = arrayOf("Alice", "Bob", "Charlie")
    // The reference (val) can't be reassigned, but elements can be changed.

    val namess = arrayOf("Alice", "Bob", "Charlie")
    for(i in names){
        println(i)
    }
    for (i in names.indices) { // 0 to names.size - 1
        println("Index $i: ${names[i]}")
    }

    // array of any type
    val mixedArray = arrayOf(1, "Hello", 3.14, true)
    for (element in mixedArray) {   
        println(element)
    }
}