package OOPS.Day8;

class Ae {
    public void print() {
        System.out.println("Ae");
    }
}

interface Be {
    default void print() {
        System.out.println("Be");
    }
}

class Ce extends Ae implements Be {
    //this is same as diamond problem
    //we can override these methods if I want own implementations
}

//Java Resolution priority rule
public class JavaPriorityRule {
    public static void main(String[] args) {
        Ce c = new Ce();
        c.print();//this will give more priority to class not interface because of Java Resolution priority rule
    }
}
