package part7.RandomMovie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

public class ScannerExample {
    String filePath = "C:\\Users\\sagar rana 11\\Desktop\\JAVA\\part7\\RandomMovie\\hello_world.txt";

    try {
        // Create a File object
        File file = new File(filePath);

        // Create a Scanner to read from the file
        Scanner scanner = new Scanner(file);

        // Reading consecutive lines
        while (scanner.hasNextLine()) {
            // Read string
            String name = scanner.next();

            // Read integer
            int age = scanner.nextInt();

            // Read the rest of the line as a list of strings
            List<String> fruits = new ArrayList<>();
            while (scanner.hasNext()) {
                fruits.add(scanner.next());
            }

            // Process the values
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Fruits: " + fruits);
        }

        // Close the scanner to release resources
        scanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + filePath);
        e.printStackTrace();
    }
       
        
}
