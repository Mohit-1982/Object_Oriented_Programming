package OOPS.Day3;

class Outer1 {
    int x;
    int z = 10;
    class Inner {
        int z = 20;
        void print() {
            System.out.println(z);//to print inner class variable
            System.out.println(Outer1.this.z);//to print outer class variable
        }
        void greet() {
            System.out.println("Hello");
        }
        static void fun() {
            System.out.println("Mohit");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
//        Outer1.Inner inner = new Outer1.Inner();this is not going to use as it is not static
        Outer1.Inner inner = outer.new Inner();
        //or
//        Outer1.Inner inner = new Outer().new Inner();
        inner.greet();
        inner.print();
        inner.fun();
        Outer1.Inner.fun();
    }
}
