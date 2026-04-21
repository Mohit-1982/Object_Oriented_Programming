package OOPS;

class A {
    static void fun() {
        System.out.println("Hello");
    }
    private void print() {
        System.out.println("Private methods can't be overridden");
    }
    final void print1() {
        System.out.println("Final Cant be Overridden");
    }
}

class B extends A {
//    @Override Static methods cannot be annotated with @Override
    static void fun() {
        System.out.println("Bye");
    }
    private void print() {
        System.out.println("My name is Mohit");
    }
//    final void print1() {'print1()' cannot override 'print1()' in 'OOPS.A'; overridden method is final
//        System.out.println("Final");
//    }
}
public class NoStaticOverride {
    public static void main(String[] args) {
        A a = new B();
        a.fun();
        //a.print(); private cant access outside class
    }
}
