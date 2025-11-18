/*
multi line comments
NON MULL variables
By default, variables cant be null, when declared we must assign it
 */
var nonNull: String = "i have a bad feeling about this language"
//var declared: String -> not working, must assign

nonNull.uppercase()

/*
Nullable var
 */
var nullable: String? = null

//var nullableUnAssigned: String -> not work, need assign null

nullable = "now have value"
nullable = null
nullable?.uppercase()

/*
BULL safety
 */
var anotherNull: String? = "..."
// safe call to call any property or method on a nullable var
anotherNull = null
anotherNull?.isEmpty()
anotherNull?.uppercase()?.replaceFirstChar { it.uppercase() }

// non null assertion
//!! force not null
anotherNull = "asd"
if(anotherNull != null){
    anotherNull!!.uppercase()
}
//NOTE: must be sure, if its null, throw nullPointerException