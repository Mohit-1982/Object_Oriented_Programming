package OOPS;

class newStudent {
    String name = "MOhit";
    int age;
    int rNo;
    static String college;//we can assign the value of college here as well

    newStudent() {
        System.out.println(name);
    }

    newStudent(String name, int age, int rNo) {
        this.name = name;
        this.age = age;
        this.rNo = rNo;
    }

    newStudent(String name, int age, int rNo, String college) {
        this.name = name;
        this.age = age;
        this.rNo = rNo;
        //this.college = college; this is not allowed instead we can do,
        newStudent.college = college;//this is way to represent in static way
    }

    static void markAttendance() {
        System.out.println("Attendance Marked");
        //print();not Accessed here because it is not static
    }
    void print() {
        System.out.println(this.age + " " + this.rNo + " " + this.name + " " + newStudent.college);
    }

    //Static Block
    static {
        college = "NcU";
    }
}
public class StaticKeyWord {
    public static void main(String[] args) {

        newStudent s5 = new newStudent();


        newStudent s0 = new newStudent("Sohit", 26, 151);
        System.out.println(s0.age + " " + s0.rNo + " " + s0.name + " " + newStudent.college);//This one college name is accessed by static block below ones are changes

        newStudent s1 = new newStudent("Mohit", 17, 149, "Ncu");
        newStudent s2 = new newStudent("Yadav", 18, 1490, "IIT");//Because of static the college will become IIT it wont be Ncu
        System.out.println(s1.age + " " + s1.rNo + " " + s1.name + " " + newStudent.college);//we can't represent college like s1.college
        System.out.println(s2.age + " " + s2.rNo + " " + s2.name + " " + newStudent.college);

        newStudent s3 = new newStudent("Rohit", 28, 101);
        newStudent s4 = new newStudent("Tandon", 48, 102);

        newStudent.college = "NCU";
        System.out.println(s3.age + " " + s3.rNo + " " + s3.name + " " + newStudent.college);
        System.out.println(s4.age + " " + s4.rNo + " " + s4.name + " " + newStudent.college);
    }
}
