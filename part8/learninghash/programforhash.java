package part8.learninghash;
import java.util.HashMap;

public class programforhash {

    public static void main(String[] args) {
        HashMap<book, String> collection = new HashMap<>();
        book linuxForHackers = new book("Linux for Hackers", 2018, "The content is hacked");
        book javaForHackers = new book("Java For Hackers", 2020, "Java is hacked");

        collection.put(linuxForHackers, linuxForHackers.getName());
        collection.put(javaForHackers, javaForHackers.getName());

        for(int i =1; i<1000000; i++){
            String bookObjectName = "book" + i;
            String bookNAme = "Programming Book " + i;
            int publishedYear = 2022;
            String content = null;
            book book = new book(bookNAme, publishedYear, content);
            collection.put(book, book.getName());
        }

            long start = System.nanoTime();
            System.out.println(collection.get(linuxForHackers));
            
            System.out.println();
            
            System.out.println(collection.get(javaForHackers.getName()));
            long end = System.nanoTime();
            double durationInMilliseconds = 1.0 * (end - start) / 1000000;
            
            System.out.println("The book search took " + durationInMilliseconds + " milliseconds.");

        
    }
    
}
