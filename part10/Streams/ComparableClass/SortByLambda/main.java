package part10.Streams.ComparableClass.SortByLambda;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class main {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();

        personList.add(new Person("Tanu", 2003));
        personList.add(new Person("Tanuja", 2023));
        personList.add(new Person("Tanun", 2001));
        personList.add(new Person("Tanushree", 2003));
        personList.add(new Person("Tanuj", 2005));


        personList.stream().sorted((p1, p2) -> {
            return p1.getName().compareToIgnoreCase(p2.getName());
        }).forEach(p -> System.out.println(p.getName()));


        System.out.println(" ");
        System.out.println(" ");


        // ((p1,p2) -> {
        //     return p1.getBirthYear() - p2.getBirthYear();
        // });

        System.out.println(" " );
        personList.stream().forEach(p -> System.out.println(p.getName()));
         System.out.println(" " );
        
        

        Collections.sort(personList, (p1, p2) -> p1.getBirthYear() - p2.getBirthYear());


        personList.stream().forEach(p -> System.out.println(p.getName()));
    }
    
}
