package part8.Inheritence.practice.p1;

import java.util.ArrayList;

public class main {

    public static void printPerson(ArrayList<person> persons){
        for(person p: persons){
            System.out.println(p);
        }
    }


    public static void main(String[] args) {
        // teacher ada = new teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        // teacher esko = new teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        // System.out.println(ada);
        // System.out.println(esko);
        
        // student ollie = new student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        
        // int i = 0;
        // while (i < 25) {
        //   ollie.study();
        //   i = i + 1;
        // }
        // System.out.println(ollie);
        // ArrayList<person> persons = new ArrayList<person>();
        // persons.add(new teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        // persons.add(new student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        // printPerson(persons);

        student ollie = new student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        person olliePerson = new student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(olliePerson);
        Object ollieObject = new student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollieObject);

        Object alice = new student("Alice", "177 Stewart Ave. Farmington, ME 04938");
        System.out.println(alice);
        

        // ________
        // If the method has no definition in that class, the version of the method is chosen from the class that is closest to the actual type in the inheritance hierarchy.//
    }
}
