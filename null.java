class Scratch {
    // in java, when declare a var but don't assign, it will be "null"
    static Dog myDog;
    static String aNullString;
    // primitive data types can't be null, they always have a default value
    // like int and bool
    static int myInt;

    public static void main(String[] args) {
//        myDog.name = "Fido"; -> will be no error in code but will throw a nullPointerException at runtime
//        myDog.bark();

        myDog = new Dog();
        myDog.name = "Fido";
        myDog.bark();

        myDog = null;
//        myDog.bark(); -> throw exception because myDog is null again

        System.out.println(aNullString); // null
//        aNullString.toUpperCase(); cant call method on null string

        System.out.println(myInt);
    }
}

class Dog{
    String name;

    public void bark(){
        System.out.println("Woof Woof!");
    }
}