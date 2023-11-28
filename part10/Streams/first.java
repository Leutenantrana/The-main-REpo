package part10.Streams;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.stream.Collectors;



public class first {

       public static ArrayList<Integer> divisible(ArrayList<Integer> numbers){
            ArrayList<Integer> result = numbers.stream()
                .filter(num -> num%3 ==0||num % 5 ==0 ||num % 2 ==0)
                .collect(Collectors.toCollection(ArrayList::new));
                
            return result;    
        }



    public static void main(String[] args) {
    //     List<Integer> list = new ArrayList<>();
    //     list.add(-3);
    //     list.add(7);
    //     list.add(-4);
    //     list.add(2);
    //     list.add(-6);
        
    //     List<Integer> values = list.stream()
    //         .filter(value -> value > 0)

    //         .collect(Collectors.toList());

    //         // .collect(Collectors.toCollection(ArrayList::new));


    //    System.out.println(values);

        // List<Integer> numbers = new ArrayList<>();
        // for (int i = 0; i < 10; i++) {
        //     numbers.add(i);
        // }

        // long howManyNumbers = numbers.stream()
        //     .filter(i -> i < 4)
        //     .map(i -> i * 2)
        //     .filter(i -> i > 10)
        //     .count();

        // System.out.println("Numbers: " + howManyNumbers);


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

       
            


        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(num -> System.out.println(num));
    }
        
    
}
