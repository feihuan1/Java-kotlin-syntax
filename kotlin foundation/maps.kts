import kotlin.collections.set

//need to add value in future? use hashmap
val myMap: HashMap<String, String> = hashMapOf()

// just need values at initialisation? use map, read only
val scores: Map<String, Int> = mapOf(
    Pair("p1", 3),
    Pair("p2", 4),
    Pair("p3", 6),
)

// also can use traditional way to create map
val anotherHashMap: HashMap<String, Boolean> = HashMap()
//val anotherMap: Map<Double, String> = Map() -> this wont work, Map is a interface with read only methods

// for consistency, with arrays,and map, use hashmapOf mapOf and arrayOf

// updating/ accessing hashmap

val pets: HashMap<String, String> = hashMapOf()

// put to store or update key value pair
pets.put("Fido", "Dog")
pets["Max"] = "Cat"

// access
pets.get("Fido")
// update
pets["Max"] = "arabian mau Cat"

// remove
pets.remove("Fido")

data class Student(val name:String, val age:Int, val nationality:String)

val studentData :HashMap<String, Student> = hashMapOf()

val alex = Student("Alex", 22, "Canadian")
val richard = Student("Richard", 21, "Australian")

studentData["Al141"] = alex
studentData["RI244"] = richard

// **** MAP initialisation ****
val bandBalances: HashMap<String, Double> = hashMapOf(
    Pair("GreedyBank", -59.34),
    Pair("NiceBank", 145.78),
    Pair("BankBank", 187.23),
)

bandBalances["NiceBank"] = 1000.00
bandBalances.remove("BankBank")

// syntax sugar, to returns Pair
val reportCard: Map<String, String> = mapOf(
    "English" to "A",
    "Maths" to "B-",
    "Science" to "C+",
    "Music" to "A+"
)

// ***Type inference***
// if initialize map with key value pair, don't need specify types
val secretAccess = hashMapOf(
    "Basement" to true,
    "Science lab" to false,
    "Staff Room" to true,
    "Executive Suite" to false,
)
//can't change type once initialized

//***Final Notes***
/*
    1. key need be unique
    2. types can be nullable, but specify Map<String, Int?>
    3. hash map is called this, because whatever you have in your key is hashed in to a short unique value
 */