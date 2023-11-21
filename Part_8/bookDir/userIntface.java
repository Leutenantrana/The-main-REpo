package Part_8.bookDir;
import java.util.Scanner;


import java.util.HashMap;
import java.util.ArrayList;
public class userIntface {

    public static void main(String[] args) {
        book book1 = new book("the shuttle", 2023, "sdfg");
                book book2 = new book("the emp", 2023, "lov");

         HashMap<String, book> collection = new HashMap<>();
         collection.put(book2.getName(), book2);
                  collection.put(book1.getName(), book1);

                  System.out.println(collection.get("the shuttle"));


    }

    

    

   

   

    

    
   


    

   

    
    
}
