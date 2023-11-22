package part8.learninghash;
import java.util.ArrayList;
import java.util.HashMap;

public class library {

    HashMap<String, book> collection;

    public library(){
        this.collection = new HashMap<>();
    }

    public void addBook(book b){
        String title = sanitisedString(b.getName());

        if (this.collection.containsKey(title)) {
            System.out.println("The book already exists in the Library");

            
        }else{
            this.collection.put(title, b);
        }


    }
    public void removeBook(book b){
        String title = sanitisedString(b.getName());
        if (this.collection.containsKey(title)) {
            this.collection.remove(title);

            
        }else{
            System.out.println("Book not found Error 404");
        }
    }
    public book getbook(String string){
        String title = sanitisedString(string);
        book returnBook = this.collection.get(title);
        return returnBook;
    }
    public static String sanitisedString(String string){
        if(string == null){
            return "";
        }

        string = string.toLowerCase();
        return string.trim();

    }

    public ArrayList<book> getBookByPart(String titlepart){
        titlepart = sanitisedString(titlepart);

        ArrayList<book> returnBooks = new ArrayList<>();

        for(String bookTitle : this.collection.keySet()){
            if (!bookTitle.contains(titlepart)) {
                continue;
                
            }

            returnBooks.add(this.collection.get(bookTitle));
           
        }
         return returnBooks;
    }

    


    
    
}
