package OOPS.Day2;

public class DoubleEqualOperatorWithWrappers {
    public static void main(String[] args) {
//        int x = 10;
//        int y = 10;
//
//        System.out.println(x == y);

        Integer a = 100;
        Integer b = 100;

        System.out.println(a == b);//true because of cache

        Integer w = 200;
        Integer q = 200;

        System.out.println(w == q);//is w and q point to same reference here we are checking this
        System.out.println(w.intValue() == q.intValue());
        System.out.println(w.equals(q));//.equals method
    }
}
