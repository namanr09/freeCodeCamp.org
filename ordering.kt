fun main(){
    // ordering lists
    val numbers = listOf(5, 3, 8, 1, 2)
    val sortedNumbers = numbers.sorted() // Sorts the list in ascending order
    println(sortedNumbers) // Output: [1, 2, 3, 5, 8]
    val reversedNumbers = numbers.sortedDescending() // Sorts the list in descending order
    println(reversedNumbers) // Output: [8, 5, 3, 2, 1]
    val names = listOf("Alice", "Bob", "Charlie")
    val sortedNames = names.sortedBy { it.length } // Sorts by the length of the names
    println(sortedNames) // Output: [Bob, Alice, Charlie]
    val sortedNamesDescending = names.sortedByDescending { it.length } // Sorts by the length of the names in descending order
    println(sortedNamesDescending) // Output: [Charlie, Alice, Bob]
    val numbersWithIndices = numbers.withIndex() // Creates a list of indexed values
    val sortedWithIndices = numbersWithIndices.sortedBy { it.value } // Sorts by the value of the indexed elements
    println(sortedWithIndices) // Output: [(3, 1), (4, 2), (2, 3), (1, 5), (0, 8)]
    val sortedByIndex = numbersWithIndices.sortedBy { it.index } // Sorts by the index of the elements
    println(sortedByIndex) // Output: [(0, 5), (1, 3), (2, 8), (3, 1), (4, 2)]
    val numbersReversed = numbers.reversed() // Reverses the order of the list
    println(numbersReversed) // Output: [2, 1, 8, 3, 5]
    val namesReversed = names.reversed() // Reverses the order of the names
    println(namesReversed) // Output: [Charlie, Bob, Alice]
    val numbersShuffled = numbers.shuffled() // Shuffles the list randomly
    println(numbersShuffled) // Output: Random order of numbers


    // sorting 2d lists
    val twoDList = listOf(
        listOf(3, 1, 2),
        listOf(6, 4, 5),
        listOf(9, 7, 8)
    )
    val sorted2DList = twoDList.map { it.sorted() } // Sorts each inner list


    val nums = listOf(
        Pair(1,2),
        Pair(3,1),
        Pair(2,3)
    )
    val sortedPairs = nums.sortedBy { it.first } // Sorts by the first element of the pairs


    // compartor 
    val comparator = compareBy<Pair<Int, Int>> { it.first }.thenBy { it.second }
    val sortedPairsWithComparator = nums.sortedWith(comparator) // Sorts using the custom comparator   
    
    fun sum(){
        // perfect
    }
    

}