// -------------named object--------------
// works like obj in JS, replace static property/method in JAVA
// No "," !!!
object CountryCode {
    const val UNITED_STATES = "US"
    const val CHINA = "CH"
    fun getFullName(code: String): String {
        return when (code) {
            UNITED_STATES -> "United States Of America"
            CHINA -> "republic of China"
            else -> "UNKNOWN COUNTRY"
        }
    }
}

CountryCode.UNITED_STATES // "US"


//-------------companion object----------

class Employee(val name: String, val grade: String) {

    fun printDetails() {
        println("Name: $name")
        println("Grade: $grade")
        println("Company name: $COMPANY_NAME")
    }

    companion object {
        const val COMPANY_NAME = "E Corp"

        fun isAdmin(employee: Employee): Boolean {
            return employee.grade == "Executive"
        }
    }
}
// don,t need instance
Employee.COMPANY_NAME // "E Corp

val employeeVin = Employee("Vin", "Junior")
val employeeMax = Employee("Max", "Executive")

employeeMax.printDetails() // print 3 lines

Employee.isAdmin(employeeVin) // false
Employee.isAdmin(employeeMax) // true