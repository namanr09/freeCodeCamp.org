// collections

fun main(){
    // list set and maps -> mutable and immutable (size is fixed for immutable)
    val immutableList = listOf("Apple", "Banana", "Cherry")
    val mutableList = mutableListOf("Apple", "Banana", "Cherry")

    // can we update the immutable list?
    // immutableList[0] = "Mango" // This will cause an error because immutableList is read-only

    // maps
    val immutableMap = mapOf("name" to "Alice", "age" to 30)
    val mutableMap = mutableMapOf("name" to "Alice", "age" to 30)
    // methods of maps
    println("Name: ${mutableMap["name"]}") // Accessing value by key
    mutableMap["age"] = 31 // Updating value
    println("Updated Age: ${mutableMap["age"]}") // Accessing updated value
    mutableMap["city"] = "New York" // Adding new key-value pair
    println("City: ${mutableMap["city"]}") // Accessing new key-value pair
    mutableMap.remove("age") // Removing a key-value pair
    println("After removing age: $mutableMap") // Displaying map after removal
    // Iterating over map
    for ((key, value) in mutableMap) {
        println("$key: $value") // Displaying each key-value pair
    }
    // Iterating over keys
    for (key in mutableMap.keys) {
        println("Key: $key") // Displaying each key
    }

    mutableMap.forEach { (key, value) ->
        println("$key: $value") // Displaying each key-value pair using forEach
    }
    // can we change the immutable map?
    // immutableMap["name"] = "Bob" // This will cause an error because immutableMap is read-only
    // set
    val immutableSet = setOf("Apple", "Banana", "Cherry")
    val mutableSet = mutableSetOf("Apple", "Banana", "Cherry")
    // methods of set
    println("Set: $mutableSet") // Displaying set
    mutableSet.add("Date") // Adding an element
    println("After adding Date: $mutableSet") // Displaying set after addition
    mutableSet.remove("Banana") // Removing an element
    println("After removing Banana: $mutableSet") // Displaying set after removal
    // Iterating over set
    for (item in mutableSet) {
        println("Item: $item") // Displaying each item in the set
    }
    
    // find
    val foundItem = mutableSet.find { it.startsWith("A") } // Finding an item that starts with "A"


    

}