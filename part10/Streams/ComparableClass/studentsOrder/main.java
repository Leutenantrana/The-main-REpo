package part10.Streams.ComparableClass.studentsOrder;
import java.util.ArrayList;
import java.util.Collections;

import part8.Inheritence.practice.p1.student;





public class main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("aarav"));
        students.add(new Student("pushpa"));
         students.add(new Student("Deepaks"));
        students.add(new Student("Deepak"));
       

        students.stream().sorted().forEach(s-> System.out.println(s));

        Collections.sort(students);

        System.out.println(students);
       
        
    }
    
}
