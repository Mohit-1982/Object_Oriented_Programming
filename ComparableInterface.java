package OOPS_FILES.OOPS.Day15;

import java.util.*;

class Student implements Comparable<Student> {
    int marks;
    String name;

    public Student(int marks, String name) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        if (this.marks == other.marks) {
            return this.name.compareTo(other.name);
        }
        return this.marks - other.marks;
    }
}

public class CompareInterface {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(467, "Mohit"));
        list.add(new Student(3140, "Yadav"));
        list.add(new Student(2143, "Rohit"));
        list.add(new Student(42, "Aditya"));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}
