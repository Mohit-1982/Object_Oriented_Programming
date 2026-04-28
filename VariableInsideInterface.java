package OOPS.Day8;

interface MathConst {
    double PI_VALUE = 3.14;
    int VALUE = 10;

    void print();
}

class Random implements MathConst {
    @Override
    public void print() {
        System.out.println(PI_VALUE);
    }
}

public class VariableInsideInterfaces {
    public static void main(String[] args) {
        System.out.println(MathConst.PI_VALUE);
        System.out.println(MathConst.VALUE);

        Random r1 = new Random();
        r1.print();

        MathConst m1 = new Random();
        m1.print();
    }
}
