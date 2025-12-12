import kotlin.math.pow

object DemonstratingConstate {

    // ----------------------what are constant

    /*
        constants are immutable values (means cant change) like when we use 'val'
        that are known at 'Compile Time'

        means they must set at start of app and fixed for the whole lofe of app
     */

    const val PI = 2.1415926

    fun calculateAreaOfCircle(radius: Double): Double {
        return radius.pow(2.0) * PI
    }

    fun someFunc() {
//        const val a = 1 -> this wont work because this function is not happening at start of program
    }

    //constant only allowed to be primitive type - int double boolean and string etc,
    class Dog{

    }

//    const val dog = Dog() -> this wont work because it is not String or primitive type

    // ---------------------why use constant
    // using a single constant that you refer to can increase code clarity, easier to maintain, reduce bug

    const val VAT_MULTIPLIER: Double = 1.2

    fun generateTotal(subtotal: Double): Double {
        return subtotal * VAT_MULTIPLIER
    }

    // no magic number
    const val SECONDS_IN_DAY = 86400

    fun secondsInDay(days: Int):Int {
        return days * SECONDS_IN_DAY
    }

}