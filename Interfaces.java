package OOPS;

interface Car {
    void start();
    void accelerate();
    void brake();
}
class FuelCar implements Car{
    @Override
    public void start() {
        System.out.println("Fuel Car has Started");
    }

    @Override//it is good practice to use @Override with abstract methods
    public void accelerate() {
        System.out.println("Fuel Car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Fuel Car Brake Applied");
    }
}

class ElectricCar implements Car {
    @Override
    public void start() {
        System.out.println("Electric Car has Started");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Electric Car Brake Applied");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Car c = new ElectricCar();
        c.brake();
        c.start();
        c.accelerate();
        System.out.println();
        Car c1 = new FuelCar();
        c1.accelerate();
        c1.start();
        c1.brake();
    }
}
