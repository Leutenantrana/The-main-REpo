package part10.Streams.ComparableClass.ComparatorClass.practice;
import java.util.ArrayList;
import java.util.List;



import java.util.Collections;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        ArrayList<Book> filmList = new ArrayList<>();
        filmList.add(new Book("The complete work of Swami Vivekanand", 1901));
        filmList.add(new Book("The subtle art ", 2001));
        filmList.add(new Book("Nobody gives a fuck", 1950));
        filmList.add(new Book("the Alcheist", 1980));

        for( Book e : filmList){
            System.out.println(e);
        }
        System.out.println(" ");


        Comparator<Book> comparator = Comparator
            .comparing(Book ::getAge)
            .thenComparing(Book::getBookName);


        Collections.sort(filmList, comparator);

        for( Book b : filmList){
            System.out.println(b);
        }
    }

    
}
