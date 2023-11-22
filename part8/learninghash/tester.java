package part8.learninghash;

import java.util.ArrayList;

public class tester {
    public static void main(String[] args) {
        // book bookObject = new book("Book Object", 2000, "...");
        // book anotherBookObject = new book("Book Object", 2000, "...");

        // if (bookObject.equals(anotherBookObject)) {
        //     System.out.println("The books are the same");
        // } else {
        //     System.out.println("The books aren't the same");
        // }

        ArrayList<book> books = new ArrayList<>();
        book bookObject = new book("Book Object", 2000, "...");
        books.add(bookObject);

        // if (books.contains(bookObject)) {
        //     System.out.println("Book Object was found.");
        // }

        bookObject = new book("Book Object", 2000, "...");

        if (!books.contains(bookObject)) {
            System.out.println("Book Object was not found.");
        }
    }

            
}
