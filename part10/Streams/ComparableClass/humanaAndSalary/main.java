package part10.Streams.ComparableClass.humanaAndSalary;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import part8.Inheritence.practice.p1.person;

public class main {
    public static void main(String[] args) {
        ArrayList<human> persons = new ArrayList<>();

        persons.add(new human("Sagar", 100000));
        persons.add(new human("Sadhana", 150000));
        persons.add(new human("Aarav", 200000));

        persons.stream().sorted().forEach(m-> System.out.println(m));

        Collections.sort(persons);
        persons.stream().forEach(m->System.out.println(m));
        
    }
}
