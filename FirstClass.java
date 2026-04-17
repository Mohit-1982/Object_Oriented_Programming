package OOPS;

class Student {
    String name;
    int age;
    String rno;

    void print(Student s) {
        System.out.println(s.name + " " + s.age + " " + s.rno);
    }
}
public class FirstClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Mohit";
        s1.age = 17;
        s1.rno = "25CSU149";
        s1.print(s1);
    }
}
