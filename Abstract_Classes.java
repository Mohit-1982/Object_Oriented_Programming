package OOPS;

abstract class Car1 {//a class with abstract method should contains abstract with class
    void start() {
        System.out.println("Car is Start");
    }
    abstract void accelerate();//these are just declared not defined so we uses abstract with them
    abstract void brake();
}

class FuelCar extends Car{
    @Override//it is good practice to use @Override with abstract methods
    void accelerate() {
        System.out.println("Fuel Car is accelerating");
    }
    @Override
    void brake() {
        System.out.println("Fuel Car Brake Applied");
    }
}

class ElectricCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Electric Car is accelerating");
    }
    @Override
    void brake() {
        System.out.println("Electric Car Brake Applied");
    }
}
public class AbstractClasses {
    public static void main(String[] args) {
//        Car c1 = new Car();this will show error as we can't create an object of abstract class
        Car c1 = new FuelCar();
        c1.start();
        c1.accelerate();
        c1.brake();
        System.out.println();
        Car c2 = new ElectricCar();
        c2.start();
        c2.accelerate();
        c2.brake();
    }
}
