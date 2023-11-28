package part10.Streams;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Optional;


public class second {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using reduce to find the sum of integers
        int sum = numbers.stream().reduce(0, (accumulator, element) -> accumulator + element);
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        System.out.println(min);

        System.out.println("Sum of Numbers: " + sum);


        String [] fruitsName = {"apple" , "banana", "peach"};

        List<String> fruits = Arrays.asList(fruitsName);

            String comString = fruits.stream().reduce(" ", (accumulator, element) -> accumulator + element);

            System.out.println(comString);

            // String combined = fruits.stream()
            //     .reduce("", (previousString, word) -> previousString + word + "\n");
            // System.out.println(combined);

    }
    
}
