package part10.Streams.ComparableClass.studentsOrder;

public class Student implements Comparable<Student> {

    String name;

    public Student(String naemString){
        this.name= naemString;
    }

    public String getName(){
       return this.name;
    }
    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int compareTo( Student student){
        return this.name.compareToIgnoreCase(student.getName());
        
    }

     
    
}
