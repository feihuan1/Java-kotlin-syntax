class Scratch {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.name = "Grizzly";
        myAnimal.type = "Bear";
        myAnimal.noise = "Roar!!!";

        myAnimal.sayHello();
        myAnimal.makeNoise();
        myAnimal.sleep();

        Dog myDog = new Dog();
        myDog.name = "sunny";
        myDog.type = "Dog";
        myDog.noise = "Woof~";
        myDog.barkVolume = 8;

        myDog.sayHello();
        myDog.makeNoise();
        myDog.sleep();
        myDog.wagTail();

        Cat maxTheCat = new Cat();
        maxTheCat.name = "Max";
        maxTheCat.type = "Cat";
        maxTheCat.noise = "Meow!!";
        maxTheCat.likesToScratch = true;

        maxTheCat.sayHello();
        maxTheCat.makeNoise();
        maxTheCat.sleep();
        maxTheCat.nagForFood();
    }
}

class Animal {
    String name;
    String type;
    String noise;

    void sayHello(){
        System.out.println("Hello, my name is " + name + ". I am the animal " + type + "!");
    }

    void makeNoise(){
        System.out.println(noise);
    }

    void sleep() {
        System.out.println("Zzzz.....");
    }
}


class Dog extends Animal{

    int barkVolume;
    void wagTail(){
        System.out.println(noise + " I am so happy<Wag, Wag>");
    }
}

class Cat extends Animal{
    Boolean likesToScratch = true;;

    void nagForFood(){
        if( likesToScratch) {
            System.out.println(noise + " <scratch to the arm> FEED ME!!");
        }else {
            System.out.println(noise + " <Paw to face> FEED ME!!");
        }
    }
}