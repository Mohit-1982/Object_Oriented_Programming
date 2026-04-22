package OOPS.Day2;
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println("Sleeping");
    }

    abstract void sound();
}

class Dog extends Animal {
    String name;

    Dog(String name) {
        super(name);
    }
    @Override
    void sound() {
        System.out.println("Barking");
    }
}
public class AboutAbstractClasses {
    public static void main(String[] args) {

    }
}
