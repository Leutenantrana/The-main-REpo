package part7.sorting;
import java.lang.reflect.Array;
import java.util.Scanner;

public class sorting {

    int[] array;
    int arrayLength;
    Scanner scanner;
    


    public sorting ( int [] array){
        this.array = array;
        this.scanner = scanner;

    }

    public void addElement(){
        for(int i=0;i<arrayLength;i++){
            System.out.println("Enter the element");
           
            String input = scanner.nextLine();

            this.array[i] = Integer.valueOf(input);
        }
    }

    public int smallest(){
        int smallest = (int ) Array.get(this.array, 0);

        for(int i=0; i<this.array.length;i++){
            if ((int)Array.get(this.array, i)<smallest) {
                smallest = (int)Array.get(this.array, i);


                
            }else{
                smallest = smallest;
            }
        }

        System.out.println("The smallest number is:" + smallest);
        return smallest;
    }

    public int indexOfSmallest(){
        int number = smallest();
        int index =-1;

        for(int i =0; i<this.arrayLength;i++){
            if ((int)Array.get(this.array, i) == number) {
                index =i;
                System.out.println("the index of the smallest number is: " + index);
                
            }
        }
        return index;
    }
    public int SmallestAfterACertainValue(int specificVal){
         int smallest = (int ) Array.get(this.array, specificVal);
        int i = 0; 

        for(i=specificVal; i<this.array.length;i++){
            if ((int)Array.get(this.array, i)<smallest) {
                smallest = (int)Array.get(this.array, i);


                
            }else{
                smallest = smallest;
            }
        }

      
        return smallest;

    }

    public int getIndex(int number){
        int index = -1;
        for(int i =0;i<this.array.length;i++){
            if ((int) Array.get(this.array, i) == number) {
                index = i;
                
            }
        }
        return index;

    }

    public void swapNumbers(int number1, int number2 ){
        int index1 = getIndex(number1);
        int index2 = getIndex(number2);
        
        this.array[index1] = number2;
        this.array[index2] = number1;
    }

    public void sort(){
        for(int i =0;i<this.array.length;i++){
            int number1 = SmallestAfterACertainValue(i);
           
        
            int number2 = this.array[i];
            swapNumbers(number2, number1);

            for (int value : this.array) {
                System.out.print(value + " ");
        
            }
            System.out.println("");
            

        }

       

    }

    
}
