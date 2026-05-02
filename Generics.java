package OOPS.Day11;

class Box<T> {
    private T value;

    Box(T value) {
        this.value = value;
    }

    public void getValue() {
        System.out.println(this.value);
    }
}

class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void getDetails() {
        System.out.println(this.first + " " + this.second);
    }
}

public class Generics {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(19);//Optional to do new Box<Integer>();
        Box<String> b2 = new Box<>("Mohit");
        Box<String> b3 = b2;
//        Box<Integer> b4 = (String) b1;//Inconvertible types; cannot cast 'OOPS.Day11.Box<java.lang.Integer>' to 'java.lang.String

        Pair<Integer, String> pair = new Pair<>(10, "Mohit");
    }
}
