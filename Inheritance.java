package OOPS;

class StudentNew {
    void markAttendance() {//if we make this method private then not engStudent can call it neither StudentNew can
        //as it is not accessed out of class
        System.out.println("Attendance Marked");
    }
}

class EngStudent extends StudentNew {
    void labAttendance() {
        System.out.println("Lab Attended");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        EngStudent eg = new EngStudent();
        eg.markAttendance();
        eg.labAttendance();

        StudentNew s1 = new StudentNew();
        s1.markAttendance();
        //s1.labAttendance; show error as there is no method labAttendance in StudentNew Class
    }
}


Single Level
  package OOPS.TypesOfInheritance;

class StudentNeW { //Parent
    void markAttendance() {
        System.out.println("Attendance Marked");
    }
}

class ENgStudent extends StudentNeW { //Child
    void labAttendance() {
        System.out.println("Lab Attended");
    }
}


public class SingleLevel {
    public static void main(String[] args) {

    }
}

Multi Level
  package OOPS.TypesOfInheritance;

class StudentNeWw { //Parent
    void markAttendance() {
        System.out.println("Attendance Marked");
    }
}

class ENgStudentt extends StudentNeWw { //Child
    void labAttendance() {
        System.out.println("Lab Attended");
    }
}

class CseStudent extends ENgStudentt {
    void attendanceCse() {
        System.out.println("Cse Attendance marked");
    }
}

/*
* StudentNeWw
* |
* ENgStudentt
* |
* CseStudent
* */

public class MultiLevel {
    public static void main(String[] args) {

    }
}

Heirarchical 
  a
 / \
 b  c   

Multiple is not supported in java due to diamond problem
