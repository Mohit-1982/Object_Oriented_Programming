package OOPS;
class Studentss{
    String name;
    int age;
    int rNo;
    String college;

//    Studentss() {
////        this.name = "UnKnown";
////        this.age = 0;
////        this.rNo = 0;
////        this.college = "UnKnown";
//        this("Unknown", 0, 0, "Unknown");
//    }
//
//    Studentss(String name) {
//        //Better to use Unknown here because we can get null pointer exception sometime
//        this(name, 0, 0, "Unknown");//This will call the constructor which has all these parameters
//    }
//
//    Studentss(String name, int age) {
//        this(name, age, 0, "Unknown");
//    }
//
//    Studentss(String name, int age, int rNo) {
//        this(name, age, rNo, null);//here also change to Unknown just made it for reference tha we can do this also
//    }

    //                BETTER

Studentss() {
    this("Unknown");
    System.out.println("I am in 1 constructor");// we have to write this line after this();
}

    Studentss(String name) {
        this(name, 0);
        System.out.println("I am in 2 constructor");
    }

    Studentss(String name, int age) {
        this(name, age, 0);
        System.out.println("I am in 3 constructor");
    }

    Studentss(String name, int age, int rNo) {
        this(name, age, rNo, "Unknown");
        System.out.println("I am in 4 constructor");
    }

    Studentss(String name, int age, int rNo, String college) {
        this.name = name;
        this.age = age;
        this.rNo = rNo;
        this.college = college;
        System.out.println("I am in 5 constructor");
    }
}
public class ThisChaining {
    public static void main(String[] args) {
        Studentss s1 = new Studentss();
        Studentss s2 = new Studentss("Mohit");
        Studentss s3 = new Studentss("Rohit", 28);
        Studentss s4 = new Studentss("Rohan", 19, 131);
        Studentss s5 = new Studentss("Mohan", 45, 190, "Stanford");

        System.out.println(s1.age);
        System.out.println(s2.name);
        System.out.println(s3.college);
        System.out.println(s4.age);
        System.out.println(s5.college);
    }
}
