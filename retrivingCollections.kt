fun main(){
    // slicing 
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slicedNumbers = numbers.slice(2..5) // Slices from index 2 to 5 (inclusive)
    println(slicedNumbers) // Output: [3, 4, 5, 6]
    println(numbers.slice(0 until 2)) // Slices from index 0 to 1 (exclusive) Output: [1, 2]
    println(numbers.slice(numbers.size -1 downTo 0)) // Slices from the last index to the first index Output: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

    // takeWhile 
    val numbers2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val takenNumbers = numbers2.takeWhile { it < 5 } // Takes elements while the condition is true
    println(takenNumbers) // Output: [1, 2, 3, 4]

    // dropWhile
    val numbers3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val droppedNumbers = numbers3.dropWhile { it < 5 } // Drops elements while the condition is true
    println(droppedNumbers) // Output: [5, 6, 7, 8, 9, 10]

    // chunked
    val numbers4 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val chunkedNumbers = numbers4.chunked(3) // Splits the list into chunks of size 3
    println(chunkedNumbers) // Output: [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10]]

    // windowed
    val numbers5 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val windowedNumbers = numbers5.windowed(3, 2) // Creates a sliding window of size 3 with a step of 2
    println(windowedNumbers) // Output: [[1, 2, 3], [3, 4, 5], [5, 6, 7], [7, 8, 9], [9, 10]]

    println(numbers.sumOf(){it -> it*2}) // Output: 110
}