package OOPS.Day3;

class BankAccount {

    private static class InterestCalculator {
        static double calculateYearly(double principal, double rate) {
            return principal * rate;
        }
    }

    public double computeInterest(int principal) {
        return InterestCalculator.calculateYearly(principal, .98);
    }
}

class Outer {
    static int x = 5;
    int y;

    Outer(int y) {
        this.y = y;
    }
    static class Inner {
        static int z;
        Outer y;

        Inner(Outer y) {
            this.y = y;
        }

        void print() {//pass in parameter Outer y
            System.out.println(x);
            System.out.println(y.y);
        }

        static void zee() {
            System.out.println("Boom");
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        Outer outer = new Outer(15);
        Outer.Inner inner = new Outer.Inner(outer);
        inner.print();
    }
}
