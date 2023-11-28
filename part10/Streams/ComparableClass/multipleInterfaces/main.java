package part10.Streams.ComparableClass.multipleInterfaces;
import java.util.ArrayList;
import java.util.List;

import part8.Inheritence.practice.p1.student;

import java.util.Collections;

public class main {
    public static void main(String[] args) {

        ArrayList <Student>  students = new ArrayList<>();

        students.add(new Student("Sagar", 121));
                students.add(new Student("Shubham", 1213));
        students.add(new Student("Shivanjali", 1));
        students.add(new Student("Anjali", 12));
        students.add(new Student("Anupama", 13));

        Collections.sort(students);
        students.stream().sorted().forEach(s -> System.out.println(s));

        
    }
}
