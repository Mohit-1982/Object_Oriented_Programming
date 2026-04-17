package OOPS;
class Students {
    //These 4 are Instance Variable
    String name;
    int age;
    int rNo;
    String college;

    //Default Constructors is the constructor made by java only we can't create it

    //Constructors OverLoading

//    Students() {
         //User Defined No Argument Constructor
//    }

    Students() {
        //User Defined No Argument Constructor
        name = "Yadav";
        age = 18;
        college = "NCUU";
        rNo = 149;
    }

    //Parameterized Constructors
    Students(int a, int r) {
        age = a;
        rNo = r;
    }

    Students(int a, int r, String n, String c) {
        age = a;
        rNo = r;
        name = n;
        college = c;
    }

    void print() { // Behaviour --> Instance Method
        System.out.println(age + " " + rNo + " " + college + " " + name);
    }
}
public class Constructors {
    public static void main(String[] args) {
        Students s1 = new Students(17, 149, "NCU", "Mohit");
        s1.print();
    }
}
