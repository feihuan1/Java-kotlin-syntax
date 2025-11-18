import java.io.Serializable

// a normal class
data class Person(val name: String, val age: Int)

// when we make a new object, this instance is live in 'memory'
// it lives within the runtime environment for out app (in our case 'the Android runtime/ART')
val myPerson = Person("Eric", 25)

// if we want send a object outside of our current live environment, we need to persist it
// this is is necessary to pass data in an intent,particular as intents can be used to pass data to other android app
// An intent can auto persist simple var (int bool str etc.)
// but a instance of class cant be auto persisted

// one way to persist an object is through Serialization
// Serialization:  convert to byteStream, and it stored somewhere(file or DB Memory), the the activity read ByteStream and convert back to object

/*
 1. we tell Java our class can be persisted by adding : Serializable
 2. our class can be Serialized when needed e.g. by being put in to an intent, or writing to a file
 3. the living object converted into a stream/sequence of bytes
 4. these bytes are saved somewhere like a file or db, some different memory
 5. when needed, these bytes are read from where they persisted/stored
 6. these bytes are used to re-create the object as it was before
*/
// we add : Serializable to tell Java instance of class can be persist
data class SerializablePerson(val name: String, val age: Int): Serializable

