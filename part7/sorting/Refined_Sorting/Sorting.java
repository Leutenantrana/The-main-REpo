package part7.sorting.Refined_Sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


public class Sorting {

    public Sorting(){

    } 

    public void sortIntArray(int [] array){
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

      
    }
     public void sortStringArray(String [] array){
        // System.out.println(Arrays.toString(array));
        // int[] NewArr = {};

        // for(int i=0;i<array.length;i++){
        //     NewArr[i] = (int)Array.get(array, i);
        // }
        // Arrays.sort(NewArr);

        // for(int i=0; i<NewArr.length;i++){
        //     array[i] = String.valueOf(NewArr[i]);
        // }
        Arrays.sort(array, Comparator.comparingInt(Integer::parseInt));
        System.out.println(Arrays.toString(array));


       
       

      
    }

    public void sortArrayListIntType(ArrayList<Integer> list){
        Collections.sort(list);
        System.out.println(list);


    }

    public void sortArrayListStringType(ArrayList<String> list){
        Collections.sort(list, Comparator.comparingInt(Integer::parseInt));
        System.out.println(list);

    }



    
}
