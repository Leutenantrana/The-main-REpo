package part10.Streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class testerclass {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Banana");
        stringList.add("Apple");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Sort the ArrayList using Stream
        List<String> sortedList = stringList.stream()
                .sorted()
                .collect(Collectors.toList());

        // Print the sorted list
        System.out.println("Original List: " + stringList);
        System.out.println("Sorted List: " + sortedList);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);
        // .collect(Collectors.toCollection(ArrayList::new));
        List<Integer> numzzz = numbers.stream().sorted().collect(Collectors.toList());

          System.out.println("Original List: " + numbers);
        System.out.println("Sorted List: " + numzzz);
    }

}
