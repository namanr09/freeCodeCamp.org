fun main(){
    val numbers = listOf(1, 2, 3, 4, 5)
    val groupedNumbers = numbers.groupBy { it%2 == 0 }
    println(groupedNumbers) // Output: {false=[1, 3, 5], true=[2, 4]}
    val groupByKeySelector = numbers.groupBy (keySelector = {it%2 ==0}, valueTransform = {it*2})
    println(groupByKeySelector) // Output: {false=[2, 6, 10], true=[4, 8]}
}