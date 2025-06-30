//
// import Foo
fun main() {
    val car : Car = Car()
    // val intt = Int.MAX_VALUE 
    car.name = "Toyota"
    println("Car Name: ${car.name}")
    // println("private function: ${car.ni()}") // This will cause an error because ni() is private
    val foo = Foo()
    foo.greet()
    
}

class Car{
    var name = ""
    var speed = 0
    var color = ""
    var model = ""
    init{
        println("Car is created")
    }
    // convert color to lowercase
    // This is a custom getter for the color property   
    var lo = color.lowercase() 

    private fun ni() {
        println("This is a private function")
    }
    // constructor(name: String, speed: Int, color: String, model: String) {
    //     this.name = name
    //     this.speed = speed
    //     this.color = color
    //     this.model = model
    // }
    // constructor () {

    // }
    // getter and setter for name
    var carName: String
        get() = name
        set(value) {
            name = value
        }
    // getter and setter for multiple properties
}

// parameters as properties
class Car2(val name: String, val speed: Int, val color: String, val model: String) {
    // The primary constructor automatically creates properties
    // You can also add methods or additional properties here
    fun displayInfo() {
        println("Car Name: $name, Speed: $speed, Color: $color, Model: $model")
    }
    init {
        println("Car is created")
    }
}

// enum class for car types
enum class CarType {
    SEDAN, SUV, TRUCK, COUPE, CONVERTIBLE
}
// data class for car with properties
data class Car3(val name: String, val speed: Int, val color: String, val model: String) {
    // Data classes automatically generate equals(), hashCode(), and toString() methods
    fun displayInfo() {
        println("Car Name: $name, Speed: $speed, Color: $color, Model: $model")
    }
    init {
        println("Car is created")
    }
}