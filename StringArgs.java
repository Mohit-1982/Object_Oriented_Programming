package OOPS;

public class StringArgs {
    public static void main(String[] args) {
        //javac filename.java
        //java filename Mohit Yadav Rohit Negi .... pass arguments
        //this will work only in terminal
        System.out.println("No of Configuration is " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + args[i]);
        }
    }
}
