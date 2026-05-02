package OOPS.Day11;

class Box2<T extends Animal & Swimmable> {

}

interface Swimmable {
    void swim();
}

class Animal {

}
class Dog extends Animal {

}

class Fish extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Swin");
    }
}

public class GenericMethods {
    public static void main(String[] args) {
        Integer y = print(19);
        System.out.println(y);

        Integer z = print1(12, 13);
        System.out.println(z);

//        Box2<Animal> boz = new Box2<Animal>();it will show error because it is not implementing swimmable
        //but every object of box2 should extend animal and implement swimmable
        Box2<Fish> box = new Box2<>();
    }
    static <T> T print(T value) {
        return value;
    }
    static <T, U> int print1(T value, U add) {
//        return (int) (value + (T) add);
        return -1;
    }

}
