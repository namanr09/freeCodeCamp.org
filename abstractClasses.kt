// abstract classes
// An abstract class cannot be instantiated and can contain abstract methods
// that must be implemented by subclasses.

abstract class Funk {
    abstract val name: String
    abstract fun sound()

    fun info() {
        println("This is an animal named $name")
    }

}
class Pug : Funk() {
    override val name: String = "Dog"
    
    override fun sound() {
        println("Dog barks")
    }
}