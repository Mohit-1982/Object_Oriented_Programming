package OOPS.Day11;

public class UpCastingAndDownCasting {
    public static void main(String[] args) {
        String s = "Hello";
        Object obj = s;
        System.out.println(obj);

        Object obj1 = "Mohit";
        String sr = (String) obj1;//we did casting because it will give type mismatch error
        System.out.println(sr);

        Object obj2 = 10;
        String str = (String) obj2;//ClassCastException : class java.lang.Integer cannot be cast to class java.lang.String
        System.out.println(str);
    }
}
