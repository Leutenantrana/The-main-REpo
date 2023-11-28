package part10.Streams.readingFiles;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;


// import java.util.readingFiles;

public class main {

    public static void main(String[] args) {
        List<Person> presidents = new ArrayList<>();
        List<Book> books = new ArrayList<>();


        try {
            // reading the "presidents.txt" file line by line
            Files.lines(Paths.get("C:\\Users\\sagar rana 11\\Desktop\\Core_Java_Part_II\\part10\\Streams\\readingFiles\\presidents.txt"))
                // splitting the row into parts on the ";" character
                .map(row -> row.split("; "))
                // deleting the split rows that have less than two parts (we want the rows to always contain both the name and the birth year)
                .filter(parts -> parts.length >= 2)
                // creating persons from the parts
                .map(parts -> new Person(parts[0], Integer.valueOf(parts[1])))
                // and finally add the persons to the list
                .forEach(person -> presidents.add(person));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(presidents);

        try{
            Files.lines(Paths.get("C:\\Users\\sagar rana 11\\Desktop\\Core_Java_Part_II\\part10\\Streams\\readingFiles\\book.txt"))
                .map(row -> row.split(","))
                .filter(parts -> parts.length >=4)
                .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]) , parts[3]))
                .forEach(book -> books.add(book));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(books);

        for( Book Books : books ){
            System.out.println(Books);
        }
    }


    

    
    
}
