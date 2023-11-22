package part8.learninghash;
import java.util.ArrayList;

public class program {

    public static void main(String[] args) {
        ArrayList<book> collection = new ArrayList<>();

       book linuxForHackers = new book("Linux for Hackers", 2018, "The content is hacked");
       book javaForHackers = new book("Java For Hackers", 2020, "Java is hacked");

       collection.add(javaForHackers);
       collection.add(linuxForHackers);


       for(int i =1; i<1000000; i++){
        String bookObjectName = "book" + i;
        String bookNAme = "Programming Book " + i;
        int publishedYear = 2022;
        String content = null;
        book book = new book(bookNAme, publishedYear, content);
        collection.add(book);
       }

       long start = System.nanoTime();

       
       System.out.println(get(collection, "Linux for Hackers"));


       long end = System.nanoTime();

       double time =1.0* (end -start)/1000000;

       System.out.println("the operation took " + time + "millisecs");






    }
    public static book get(ArrayList<book> collection, String sampleString){
        for(book Books : collection){
            if(Books.getName().equals(sampleString)){
                return Books;
            }
        }
        return null;
    }
    
}
