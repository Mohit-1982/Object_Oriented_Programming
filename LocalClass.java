package OOPS.Day3;

class Outer3 {
    void fun() {
        int y = 10;
        //effective final variable
        //y++; this will give error bcs y should be final, or it should not modify
        class Local {
            void sayHi() {
                System.out.println("HI");
                System.out.println(y);
            }

            void sayBye() {
                System.out.println("BYE");
            }

        }

        Local local = new Local();
        local.sayHi();
        local.sayBye();
    }
}

public class LocalClasses {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.fun();
    }
}
