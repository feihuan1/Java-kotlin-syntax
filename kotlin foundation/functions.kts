fun makeNoise(): Unit {
    println("line")
}

makeNoise()

fun greet(name: String) {
    println("Hello $name!")
    return Unit
}

greet("Eric")

fun birthdayCake(name: String, age: Int) {
    println("Happy birthday $name, now, blow out your $age candles!")
}

birthdayCake("Alex", 30)

fun multiply(num1: Int, num2:Int): Int {
    return num1 * num2
}

val result = multiply(5,3)

/// *** 3 ways do one line func

// regular way, with curly braces,
fun square(num: Int): Int {
    return num * num
}
// with type
fun square2(num: Int): Int = num * num
// no type
fun square3(num: Int) = num * num