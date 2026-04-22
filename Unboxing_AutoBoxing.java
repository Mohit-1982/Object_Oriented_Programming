package OOPS.Day2;

public class Unboxing_AutoBoxing {
    public static void main(String[] args) {
        //AutoBoxing
        int x = 10;
        Integer y = x;
        System.out.println(x);
        System.out.println(y);
        //Internally what compiler is doing
//        Integer y = new Integer(x);//what old java does, why error --> Integer(int)' is deprecated since version 9 and marked for removal
//        Integer y = Integer.valueOf(x);

        //Unboxing
        Integer a = 10;//autoboxing
        int b = a;
//        int b = a.intValue();//unboxing
        System.out.println(a);
        System.out.println(b);//this is also unboxing

        //Null Pointer exception
        Integer z = null;
        int w = z.intValue();//Method invocation 'intValue' will produce 'NullPointerException
        System.out.println(w);//this will throw null pointer exception in run time
    }
}
