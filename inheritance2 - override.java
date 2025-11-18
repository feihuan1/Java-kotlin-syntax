class Scratch {
    public static void main(String[] args) {
        Vehicle aGenericVehicle = new Vehicle();
        aGenericVehicle.name = "some vehicle";
        aGenericVehicle.numberOfWheels = 4;
        aGenericVehicle.canFly = false;

        aGenericVehicle.describeVehicle();
        aGenericVehicle.start();
        aGenericVehicle.stop();

        Car car = new Car("Ford");

        car.describeVehicle();
        car.start();
        car.stop();
        car.beepHorn();

        Plane plane = new Plane(false);
        plane.start();
        plane.fly();
        plane.stop();
        plane.describeVehicle();

    }
}

class Vehicle {
    String name;
    int numberOfWheels;
    boolean canFly;

    void describeVehicle(){
        System.out.println("VEHICLE DETAILS - name: " + name + ", Number of wheels: " + numberOfWheels + ", Capable of flight: " + canFly);
    }

    void start() {
        System.out.println("<Engine Started>");
    }

    void stop(){
        System.out.println("<Engine stopped>");
    }
}

class Car extends Vehicle{
    String model;


    Car(String model){
        this.name = "car";
        this.numberOfWheels = 4;
        this.canFly = false;
        this.model = model;
    }

    @Override
    void describeVehicle() {
        super.describeVehicle();
        System.out.println("Car details - Model: " + model);
    }

    void beepHorn(){
        System.out.println("Beep Beep!");
    }
}

class Plane extends Vehicle{
    boolean hasPropellers;

    Plane(boolean hasPropellers) {
        this.name = "plane";
        this.numberOfWheels = 3;
        this.canFly = true;
        this.hasPropellers = hasPropellers;
    }

    @Override
    void describeVehicle() {
        super.describeVehicle();
        System.out.println("Plane details - Has Propellers: " + hasPropellers);
    }

    @Override
    void start() {
        super.start();
        if(hasPropellers){
            System.out.println("<Propellers started>");
        }
    }

    @Override
    void stop() {
        super.stop();
        if(hasPropellers){
            System.out.println("<Propellers stopped>");
        }
    }

    void fly(){
        System.out.println("Whoosh");
    }
}