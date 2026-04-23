package OOPS.Day3;

class Person {
    void print() {
        System.out.println("I am a person");
    }
}
public class Anonymous {
    public static void main(String[] args) {
        Person p1 = new Person() {
            String name = "Mohit";
          @Override
          void print() {
              System.out.println("I am a Guest");
          }
          void greet() {
              System.out.println("Hi");
          }
        };
        p1.print();
//      p1.name; we can't do something like this as its class doesn't contain this variable
//      p1.greet(); we can't do this as its class doesn't contain this Method
    }
}
