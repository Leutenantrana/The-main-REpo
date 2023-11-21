package part7.sorting.Binary_search;
import java.util.ArrayList;

public class linearSearch {

    ArrayList<books> collection;

    public linearSearch (ArrayList<books> collection){
        this.collection = collection;



    }

    public int linearSearch(String checkString){

        int i;
        for(i =0; i<this.collection.size(); i++){
            books sampBooks = this.collection.get(i);
            String bookName = sampBooks.getName();

            if (bookName.equals(checkString)) {
                
                 break;
               
                
            }
        }
        return i;

    }
    
}
