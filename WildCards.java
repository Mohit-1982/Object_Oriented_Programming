package OOPS.Day12;

import java.util.ArrayList;
import java.util.List;

class Animal {
    void bark() {
        System.out.println("Animal Sound");
    }
}
class Fish extends Animal{
    void swim() {
        System.out.println("Swim");
    }
}

public class WildCards {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        list.add(new Animal());
        list.add(new Animal());
//        print(list);
//        print1(list);
        print2(list);
    }
    static void print2(List<? super Animal> animals) {
        animals.add(new Animal());
        animals.add(new Fish());

        //Reading Not Allowed
        for (Object a : animals) {//we can just read it as a Object
            Animal b = (Animal) a;
            b.bark();
        }

    }
    static void print1(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.bark();
        }
    }
    static void print(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj.getClass().getName());//we can only call Object class methods in it
        }
//        list.add(10);
//        list.add(new Fish());
//        Required type:
//        capture of ?
//        Provided:
//        Fish
        //we can only read
    }
}
