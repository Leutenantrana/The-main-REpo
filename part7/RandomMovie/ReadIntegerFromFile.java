package part7.RandomMovie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadIntegerFromFile{
    public static void main(String[] args) {
        // Specify the path to the file
        String filePath = "C:\\Users\\sagar rana 11\\Desktop\\JAVA\\part7\\RandomMovie\\integer.txt";

        try {
            // Create a Scanner object to read from the file
            Scanner scanner = new Scanner(new File(filePath));
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<String> names = new ArrayList<>();


            // Read and process integers from the file
            while (scanner.hasNext()) {
                
                   
                    // list.add(intValue);
         
                    // String stringValue = scanner.next();
                    // names.add(stringValue);
                    String line = scanner.nextLine();

                    int intValue = scanner.nextInt();
                   


                    System.out.println(line);
                    System.out.println(intValue);

                    // // Split the line into an array of strings
                    // String[] stringArray = line.split(" ");
    
                    // // Process the string array as needed
                    // for (String str : stringArray) {
                    //     System.out.print(str + " ");
                    // }
                    // System.out.println(); // Move to the next line for the next array
                
               
            }
            // System.out.println(list);
            // System.out.println(names);

            
            

            

            // Close the scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle the case where the file is not found
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
    
