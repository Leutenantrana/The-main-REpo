package part7.sorting.SortingArrayListStringType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


public class Sorting {

    ArrayList <String> list;

    public Sorting(ArrayList<String> list){
        this.list = list;
    }

    public String smallest(){
        String element = this.list.get(0);
        String[] parts = element.split(",");

        String text = parts[0];
        int amount = Integer.valueOf(parts[1]);

        

        for(int i=0; i<this.list.size();i++){
            String nextElement = this.list.get(i);
            String[] nextElementParts = element.split(",");

            String command = parts[0];
            int nextAmount = Integer.valueOf(parts[1]);

            
            if (nextAmount<amount) {
                element = this.list.get(i);


                
            }else{
                element = element;
                
            }

        }
        return element; 

    }
    
    public String smallestAfterAIndex( int index){
        String element = this.list.get(index);
        String[] parts = element.split(" , ");

        String text = parts[0];
        int amount = Integer.valueOf(parts[1]);

        
        int i;
        for(i=index; i<this.list.size();i++){
            String nextElement = this.list.get(i);
            String[] nextElementParts = element.split(",");

            String command = parts[0];
            int nextAmount = Integer.valueOf(parts[1]);

            
            if (nextAmount<amount) {
                element = this.list.get(i);


                
            }else{
                element = element;
                
            }

        }
        return element; 

    }


    public void swap(String string1, String string2){
        int index1 = this.list.indexOf(string1);
        int index2 = this.list.indexOf(string2 );

        Collections.swap(this.list, index1, index2);
       

    }
    public void sort(){
        for(int i =0;i<this.list.size();i++){
            String element1 = smallestAfterAIndex(i);
           
        
            String element2 = this.list.get(i);
            swap(element2, element1);

           

        }

        System.out.println(this.list);
        System.out.println("");
            
    }


}    
