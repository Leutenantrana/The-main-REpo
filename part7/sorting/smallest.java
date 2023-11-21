package part7.sorting;
import java.lang.reflect.Array;

public class smallest {

    public static void main(String[] args) {
        int[] numbers = {6, 4, 8, 1, 1};
        // int index =-1;

        // for (int i = 0; i < numbers.length; i++) {
        //     if (numbers[i] == 8) {
        //         index = i;
        //         break; // Break the loop once the element is found
        //     }
        // }

        // int num = (int ) Array.get(numbers, 0);
        


        // for(int i =0;i<numbers.length-1; i++){
        //     numbers[i] = numbers[i+1];
        // }
        // numbers[numbers.length-1] = num;
       
      
       
        // }
        int num1 = 8;
        int num2 =6;

        int index1 =-1;

         for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num1) {
                index1 = i;
                break; // Break the loop once the element is found
            }
        }
        System.out.println("index:" + index1);

         int index2 =-1;

         for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num2) {
                index2 = i;
                break; // Break the loop once the element is found
            }
        }
        System.out.println("index:" + index2);


        numbers[index2] = 8;
        numbers[index1] = 6;
        for (int value : numbers) {
        System.out.print(value + " ");

        }

    

        // int smallest = (int)Array.get(numbers, 0);

        // for(int i=0; i<numbers.length; i++){
        //     if ((int)Array.get(numbers, i) <smallest) {
        //         smallest =(int) Array.get(numbers, i);
                
        //     }else{
        //         smallest = smallest;
        //     }
           
        // }
        //  System.out.println(smallest);

        // int index =-1;

        //  for (int i = 0; i < numbers.length; i++) {
        //     if (numbers[i] == smallest) {
        //         index = i;
        //         break; // Break the loop once the element is found
        //     }
        // }
        // System.out.println("index:" + index);


        // int numb = (int ) Array.get(numbers, 3);
        // numbers.remove(2);
        // System.out.println(numbers);


    }
    
}
