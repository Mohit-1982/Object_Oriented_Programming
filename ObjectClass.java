package OOPS.Day6;

class Student implements Cloneable { //extends Object --> this is completely optional as java does this internally on its own
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return (name + " " + age);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;//same reference

        //check if both classes are of student otherwise it will give classcastexception
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        if (obj == null) {
            return false;
        }

        Student s = (Student) obj;
        return (this.name == s.name) && (this.age == s.age);//this won't check reference it checks values
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + age;
        result = result * 31 + ((name != null) ? name.hashCode() : 0);
        return result;

        //return Objects.hash(name, age); import java.util.Objects;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ToString {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Mohit", 17);
//        System.out.println(s1);
//        System.out.println(s1.toString());//default implementation --> OOPS.Day6.Student@8efb846

        Student s2 = new Student("Mohit", 17);
        System.out.println(s1.equals(s2));//this checks reference default one
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.getClass().getName());//print name of class
        System.out.println(s1 instanceof Student);
        System.out.println(s1 instanceof Object);

        Student s3 = (Student) s1.clone();//it does shallow copy
        s3.name = "Pawan";
        System.out.println(s1.name);
        System.out.println(s3.name);
    }
}
