String Immutability

package OOPS.Day9;

public class StringImmutabiity {
    public static void main(String[] args) {
        String str = "Mohit";
        str.concat(" Yadav");//this is just created as new object in heap which is Mohit Yadav but str is not pointing to it
        System.out.println(str);//Mohit as strings are immutable

        String st = new String("Boom");
        System.out.println(st);
    }
}


Equal Method

package OOPS.Day9;

public class EqualMethod {
    public static void main(String[] args) {
        String str = "Hello";//Literal way declaration --> points to same references
        String btr = "Hello";

        System.out.println(str.equals(btr));
        System.out.println(str == btr);

        String s = new String("Mohit");//new operator way declaration --> creates new object
        String st = new String("Mohit");

        System.out.println(s.equals(st));//equals method checks values as String class overrides it
        System.out.println(s == st);//it is checking references
    }
}
