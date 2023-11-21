package part7.sorting.Binary_search;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<books> collection = new ArrayList<>();

        


        collection.add(new books("Uttarakhand", 1));
        collection.add(new books("Hp", 6));
        collection.add(new books("Manipur", 5));
        collection.add(new books("Up", 4));
        collection.add(new books("Assam", 3));
        collection.add(new books("Kerala", 8));
        collection.add(new books("Bihar", 9));
        collection.add(new books("Jharkhand", 2));

        
       

        sort sort1 =new sort(collection);

        sort1.sort();


    //    linearSearch b1 = new linearSearch(collection);
    //    System.out.println(" The index is :" + b1.linearSearch("Up"));

       BinarySea b2 = new BinarySea(collection);

       System.out.println("the index by binary search is : " + b2.Binarysearch(2));

        
    }
    
}
