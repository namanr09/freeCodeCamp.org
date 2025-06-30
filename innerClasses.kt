fun main(){

    val listView = ListView(arrayOf("Item 1", "Item 2", "Item 3"))
    val listViewItems = listView.ListViewItems()
    listViewItems.displayItems(0) // Displaying the first item
    listViewItems.displayItems(1) // Displaying the second item
    listViewItems.displayItems(2) // Displaying the third item



    val dog = Dog("Buddy", 3,, "ni")
    val vroom = Vroom()
    vroom.hello 
}

class ListView(val items : Array<String>){
    inner class ListViewItems{
        fun displayItems( position : Int) {
            // for (item in items) {
                println(items[position])
            // }
        }
    }
}

// inheritence 
open class Animal(var name: String , var age: Int ) {
    open fun sound() {
        println("Animal makes a sound")
    }
}
class Dog(name :String , age : Int, val breed : String) : Animal(name,age) {
    override fun sound() {
        println("Dog barks")
    }
}


// interfaces 
// what are interfaces?
// An interface is a contract that defines a set of methods and properties that a class must implement.
interface Vehicle {
    val hello : String // This is a property with a default value
    get() = "Hello from Vehicle" // Default implementation of the property
    fun start()
    fun stop()
}
class Vroom() : Vehicle {
    // override val hello: String = "Hello from Vroom"
    override fun start() {
        println("Car is starting")
    }

    override fun stop() {
        println("Car is stopping")
    }
    // val nice : String = "This is a nice car"
}