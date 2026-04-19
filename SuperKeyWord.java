package OOPS;

class Stud {
    String name;
    int age;
    int rNo;

    Stud() {}

    Stud(String name, int age, int rNo) {
        this.name = name;
        this.age = age;
        this.rNo = rNo;
    }

    void print() {
        System.out.println(name + " " + age + " " + rNo);
    }
}

class EngStud extends Stud{
    String college;

    EngStud() {}

    EngStud(String name, int age, int rNo, String college) {
//      this();//we can't use this and super in same constructor
        super(name, age, rNo);//this will call the parent and assign the values
        this.college = college;
    }

    void print() {
//      System.out.println(super.name + " " + super.age + " " + super.rNO + " " + this.college);
        super.print();
        System.out.println(this.college);
    }
}

public class Super {
    public static void main(String[] args) {
//      Stud s1 = new Stud();
//      s1.print();
        EngStud eg = new EngStud("Mohit", 17, 149, "NCU");
        eg.print();
    }
}
