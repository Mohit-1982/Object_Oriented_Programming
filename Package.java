Main Package

  package OOPS;
import OOPS.College.Demo;
//import OOPS.College.*;this * Imports Everything in college package
//import OOPS.School.*;
//import OOPS.School.Demo; Show error
//Syntax --> import PackageName.FileName;
public class Package {
    public static void main(String[] args) {
        Demo s1 = new Demo();
        s1.print();
        OOPS.College.Demo d1 = new OOPS.College.Demo();
        OOPS.School.Demo d2 = new OOPS.School.Demo();
        d1.print();
//        d2.print();
    }
}

Other Package
  package OOPS.College;

public class Demo {
    public void print() {// we have to make it public otherwise not accessed in other packages
        System.out.println("College Student");
    }
}

Other Package
  package OOPS.School;

public class Demo {
    void print() {
        System.out.println("School Student");
    }
}
class Teacher {//default can be accessed inside same package
    void print() {
        Demo d1 = new Demo();
        d1.print();
    }
}
