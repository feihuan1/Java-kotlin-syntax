import kotlin.reflect.KProperty

private object Uninitialized

class SimpleLazy<T>(private val initializer: () -> T) {
    private var cached: Any? = Uninitialized

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        if (cached === Uninitialized) {
            cached = initializer()
        }
        @Suppress("UNCHECKED_CAST")
        return cached as T
    }
}

fun <T> lazy(initializer: () -> T): SimpleLazy<T> = SimpleLazy(initializer)

class Shop {

    var isOpen = false

    lateinit var manager: String

//    lazy means only run when called
    val inventory: Inventory by lazy {
        Inventory(25, 50,10,15)
    }

    fun open(personInCharge: String) {
        manager = personInCharge
        isOpen = true
    }

    fun close() {
        isOpen = false
    }

    fun checkInventory(): Inventory {
        return inventory
    }

    data class Inventory(
        val phones: Int,
        val chargers: Int,
        val headphone: Int,
        val memoryCard: Int,
    )
}

val phoneShop = Shop()

phoneShop.isOpen // false
phoneShop.manager

phoneShop.open("Feihuan")
phoneShop.isOpen // true
phoneShop.manager  // feihuan
phoneShop.checkInventory()

class Counter {

    val sumOfOneToTen = 55

    // prevent complex code running when not needed
    private val sumOfOneToFifty: Int by lazy {
        var total = 0

        for(i in 1..50) {
            total += i
        }

        total
    }

    fun calculateSumOf1to50() = sumOfOneToFifty

}

var counter = Counter()

println(counter.calculateSumOf1to50())
println(counter.sumOfOneToTen)