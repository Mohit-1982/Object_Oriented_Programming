package OOPS.Day5;

//Immutable (Not purely immutable we can change college name and address)
final class Student {
    private final String name;
    private final int age;
    private final College college;


    Student(String name, int age, College college) {
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public College getCollege() {
        return this.college;
    }
}

//Mutable
class College {
    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
public class ImmutabilityClass {
    public static void main(String[] args) {
        College c1 = new College("NCU", "Carterpuri");
        Student s1 = new Student("Mohit", 17, c1);
        //Not purely immutable
        System.out.println(s1.getCollege().name);
        s1.getCollege().name = "ITM";
        System.out.println(s1.getCollege().name);
    }
}








package OOPS.Day5;

//Immutable
final class Student {
    private final String name;
    private final int age;
    private final College college;


    Student(String name, int age, College college) {
        this.name = name;
        this.age = age;
        this.college = new College(college.name, college.address);
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public College getCollege() {
//        return this.college; instead of this do,
        return new College(this.college.name, this.college.address);//defensive copy
    }
}

//Mutable
class College {
    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
public class PurelyImmutable {
    public static void main(String[] args) {
        College c1 = new College("NCU", "Carterpuri");
        Student s1 = new Student("Mohit", 17, c1);
        //purely immutable
        System.out.println(s1.getCollege().name);
        s1.getCollege().name = "ITM";
        System.out.println(s1.getCollege().name);
    }
}
