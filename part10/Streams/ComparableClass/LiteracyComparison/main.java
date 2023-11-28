package part10.Streams.ComparableClass.LiteracyComparison;
import java.util.ArrayList;
import java.util.List;

import part10.Streams.ComparableClass.SortByLambda.Person;
import part8.Inheritence.practice.p1.person;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
public class main {
    public static void main(String[] args) {
        List<LitComparison> countriesList = new ArrayList<>();
        
        try{
            Files.lines(Paths.get("C:\\Users\\sagar rana 11\\Desktop\\Core_Java_Part_II\\part10\\Streams\\ComparableClass\\LiteracyComparison\\abc.txt"))
                .map(row -> row.split(","))
                .filter(parts -> parts.length >=6)
                
                .map(parts -> new LitComparison(parts[3],Integer.valueOf(parts[4]) ,parts[2], Double.valueOf(parts[5])))
                .sorted()
                .forEach(s -> System.out.println(s));
                // .forEach(countries -> countriesList.add(countries));


        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(countriesList);
      
    }
}
