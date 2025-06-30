fun main(){
    // filtering -> lamda funtion (original collection is unchanged)
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbers.filter { it % 2 == 0 }) // filters even numbers
    println(numbers.filter { it > 5 }) // filters numbers greater than 5l

    val num = mapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5
    )
    println(num.filter{it -> it.value %2 == 0})
    println(numbers.filterIndexed { index,val -> index % 2 == 0 })

    val (match, notMatch) = numbers.partition { it-> it % 2  == 0 }
}