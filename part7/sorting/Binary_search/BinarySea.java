package part7.sorting.Binary_search;
import java.util.ArrayList;

public class BinarySea {


    ArrayList<books>collection;

    public BinarySea(ArrayList<books>collection){
        this.collection = collection;
    }

    public int Binarysearch( int checkId){
        int initialTerm = 0;
        int finalTerm = this.collection.size()-1;
       
       
        

        while (initialTerm<=finalTerm) {
            int middleTerm = (initialTerm + finalTerm)/2;
            books samplebook = this.collection.get(middleTerm);
            String sampleName = samplebook.getName();
            int sampleId = samplebook.getId();
            if (checkId == sampleId) {

                return middleTerm;
                
            } else if (sampleId<checkId) {
                    initialTerm =middleTerm +1;
                    
            }else  {
                finalTerm = middleTerm -1;
                    
            }
            
                
              
            
        }
        return -1;
    }
    
}
