package part10.Streams.ComparableClass.multipleInterfaces;
import java.util.ArrayList;
import java.util.List;



import java.util.Collections;


public class Student implements Identifiable, Comparable<Student>{

    String name;
    int StudentId;

    public Student(String name, int StudentId){
        this.name= name;
        this.StudentId = StudentId;

    }

   
    
    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name +" StudentId :" + this.StudentId;
    }

    @Override
    public int getId(){
        return this.StudentId;
    }

    @Override
    public int compareTo(Student another) {
        return this.getId() -another.getId();
    }    
    
}
