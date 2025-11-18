import java.sql.DriverManager.println

class KotlinClass{

    var aClassProperty: String? = null

    fun aClassFunction() {
        println("Class function")
    }
}

val classTest = KotlinClass()
classTest.aClassFunction()

//constructors immediately follow the class name, and adding car makes the value

class ClassWithConstructor(var aClassProperty: String, var aNullableProperty: String?, val aFixedProperty: Int, private var aSecretProperty: String) {

    override fun toString(): String {
        return "ClassWithConstructor(aClassProperty=$aClassProperty, aNullableProperty=$aNullableProperty...)"
    }
}

val constructorText = ClassWithConstructor("Vin Nornam", "This could be null", 5, "Secret text")

println(constructorText.toString())
constructorText.aClassProperty = "Changed..."

// ************DATA classes******************
// we can use a 'data' if class only holding values
// this come with few benefits, one is a useful descriptive 'toString()' method
data class MyDataContainer(val someData: String, val someMore: Boolean, val yetMore: Int)

val dataClassTest = MyDataContainer("hey", true, 5)
// println on data class
println(dataClassTest) // MyDataContainer("hey", true, 5)