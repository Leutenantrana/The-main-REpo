package part10.Streams.UsefulTechniques.enumsAndEnumators;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;




public class Employees {
    private ArrayList<Person> employeeList;

    public Employees(){
        this.employeeList = new ArrayList<>();

    }


    public void add(Person personToAdd){
        this.employeeList.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd){
        for(Person person : peopleToAdd){
            this.employeeList.add(person);
        }
    }
    public void print(){
        this.employeeList.stream().forEach(s -> System.out.println(s));
    }
    public void print(Education education){
        Iterator<Person> iterator = this.employeeList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                System.out.println(iterator);
                
            }

            
        }



    }
    public void fire(Education education){
        Iterator<Person> iterator = this.employeeList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
                
            }
            
        }
    }


  

    
}
