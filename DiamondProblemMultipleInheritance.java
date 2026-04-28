package OOPS.Day8;

interface A {
    void fun();
}

interface B extends A {
    @Override
    default void fun() {
        System.out.println("Class B");
    }
}

interface C extends A {
    @Override
    default void fun() {
        System.out.println("Class C");
    }
}

class D implements B, C {
    @Override
    public void fun() {
        B.super.fun();
        C.super.fun();
    }
}

public class DiamondProblem_MultipleInheritance {
    public static void main(String[] args) {
        D d = new D();
        d.fun();
    }
}
