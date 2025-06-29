fun main(){
    var a : Int = 10
    var b :Int = 20

    val r = a + b
    println("Addition: $r")
    val s = a - b
    println("Subtraction: $s")
    val m = a * b
    println("Multiplication: $m")
    val d = a / b
    println("Division: $d")
    val mod = a % b
    println("Modulus: $mod")
    val inc = a++
    println("Increment: $inc")
    val dec = b--
    println("Decrement: $dec")
    val eq = a == b
    println("Equality: $eq")
    val neq = a != b
    println("Not Equal: $neq")
    val gt = a > b
    println("Greater Than: $gt")
    val lt = a < b
    println("Less Than: $lt")
    val gte = a >= b
    println("Greater Than or Equal: $gte")
    val lte = a <= b
    println("Less Than or Equal: $lte")
    val and = a > 5 && b < 30
    println("Logical AND: $and")
    val or = a < 5 || b > 30
    println("Logical OR: $or")
    val not = !(a == b)
    println("Logical NOT: $not")
    val xor = (5) xor 30
    println("Logical XOR: $xor")
    val inRange = a in 1..20
    println("In Range: $inRange")
}