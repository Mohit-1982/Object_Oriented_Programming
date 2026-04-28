package OOPS.Day8;

interface Car {
    void drive();
}

abstract class Thar implements Car {
    abstract public void drive();
}

class BlackThar extends Thar {
    @Override
    public void drive() {
        System.out.println("I am Driving Black Thar");
    }
}


public class Interface {
    public static void main(String[] args) {
//        Car c = new Car();//we can't do this as Car is an interface   error --> 'Car' is abstract; cannot be instantiated
        Car c = new BlackThar();
        c.drive();
    }
}
