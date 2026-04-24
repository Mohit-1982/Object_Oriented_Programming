package OOPS.Day4;

import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class PrintStatementClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        System.err.println("Mohit");//use in case of error
//        int x = System.in.read();
//        System.out.println(x);

        String s = "";
        int c = 0;

        while (c != '\n') {
            c = System.in.read();
            s += (char) c;
        }
        System.out.println(s);

        //BufferReader
        InputStreamReader isr = new InputStreamReader(System.in);//it takes InputStream object and then converts it into stream of char form stream of bytes
        BufferedReader br = new BufferedReader(isr);//it takes object of InputStreamReader exactly it takes object of class reader and then takes chunks of stream of char
        String name = br.readLine();
        System.out.println(name);

        //Scanner class
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        System.out.println(name1);
    }
}
