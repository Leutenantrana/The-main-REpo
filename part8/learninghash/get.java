package part8.learninghash;

import java.util.ArrayList;

public class get {

    public static book get(ArrayList<book> collection, String sampleString){
        for(book Books : collection){
            if(Books.getName().equals(sampleString)){
                return Books;
            }
        }
        return null;
    }
    
}
