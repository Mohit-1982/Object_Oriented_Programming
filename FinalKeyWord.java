package OOPS;

class Random{
    final double PI;
    static final double G;//Gravitational constant
    //either we have to declare the value of PI in final double PI = 3.14 or do this in constructor everything else shows error
    Random() {
        PI = 3.14;
    }
    static {
        G = 0.0000000000667430;
    }
}
public class FinalKeyWord {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.PI);
        final int x;
        x = 4;
        System.out.println(x);
        //x = 15; not allowed
    }
}
