import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println

// *** Interfaces **

//** What **

/*     Definition of interface: A point where two system/subject meet and interact

        Example: A computer User -> A computer. there is the "User Interface"
        The user can use a mouse to click icons to request the computer ti do thinks and return things
        The computer then returns its output to the user on the same screen/interface
        The user does not directly control the computer; the circuit board, or read the bytecode data
        Instead, the computer and the user meet in this "user interface"
 */

//interfaces are very simple,We type 'interface' then the name of interface
interface CoffeeProvider {

    fun serveCoffee()

    fun greet(name: String): String

}

// it's very same as abstract class/method
//abstract class CoffeeProvider2 {
//    abstract fun serveCoffee()
//
//    abstract fun greet(name: String): String
//}

// interface like a contract, if something is CoffeeProvider, it promises to have these methods

// WHY, it can hide method for different but similar task
class EazeeCoffee : CoffeeProvider {

    override fun serveCoffee() {
        theEazeeMethod()
    }

    override fun greet(name: String): String {
        return "welcome to Eazee Coffee, $name"
    }

    fun theEazeeMethod() {
        // magic of making a coffee
        println("Here is the Coffee")
    }
}

val eazeeCoffe: CoffeeProvider = EazeeCoffee()

eazeeCoffe.greet("eric")
eazeeCoffe.serveCoffee()

class Coffee4u: CoffeeProvider {
    override fun serveCoffee() {
        theMethod4u()
        println("yum, enjoy your Coffee4u cofee")
    }

    override fun greet(name: String): String {
        return "Greetings $name! we have Coffee for u"
    }

    fun theMethod4u() {

    }
}

class Bestkoffee: CoffeeProvider {
    override fun serveCoffee() {
        bestCoffeeMethod()
        println("this is the best coffee")
    }

    override fun greet(name: String): String {
        return "you made the best choice $name!"
    }

    fun bestCoffeeMethod() {

    }
}

//WHY 2 we don't need to make whole class available to other parts of the code, just the interface methods

val bestKoffee: Bestkoffee = Bestkoffee()
bestKoffee.bestCoffeeMethod()

val bestKoffee2: CoffeeProvider = Bestkoffee()

bestKoffee2.serveCoffee()

//Why 3 many different type of thing can implement an interface
// some times inheritance don't work
// all things could be coffee provider, a shop, a vending machine, a person, a shop can inheritance a building
// interfaces allow a really simple way that any class can promise to fulfil certain methods
class ManWithBicycle: CoffeeProvider {
    override fun serveCoffee() {
        goGetCoffee()
        println("there you go....")
    }

    override fun greet(name: String): String {
        return "hi $name, dont make me go too far"
    }

    fun goGetCoffee() {

    }
}

val shop1: CoffeeProvider = Coffee4u()
val shop2: CoffeeProvider = Bestkoffee()
val shop3: CoffeeProvider = Coffee4u()
val man: CoffeeProvider = ManWithBicycle()

val coffeeProviders:Array<CoffeeProvider> = arrayOf(shop1, shop2, shop3, man)

for (provider in coffeeProviders) {
    println(provider.greet("Eric"))
    provider.serveCoffee()
}