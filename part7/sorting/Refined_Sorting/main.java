package part7.sorting.Refined_Sorting;
import java.util.ArrayList;
import java.lang.reflect.Array;


public class main {
    public static void main(String[] args) {
        Sorting sort = new Sorting();

        String [] S ={"90","5","7","10"};

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add(" Sagar 10");
        stringList.add(" Ssadhana 20");
        stringList.add("Aarav 30");
         stringList.add("Diay 2");
        stringList.add("Lucky 4");
        stringList.add("Seema 0");
        sort.sortStringArray(S);
        sort.sortArrayListStringType(stringList);

        
    }



    
}
