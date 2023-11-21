package part7.RandomMovie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileWithScanner {
    public static void main(String[] args) {
        // Specify the path to the file
        String filePath = "C:\\Users\\sagar rana 11\\Desktop\\JAVA\\part7\\RandomMovie\\hello_world.txt";

        try {
            // Create a Scanner object to read from the file
            Scanner scanner = new Scanner(new File(filePath));

            // Read and process each line from the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                int num = Integer.valueOf(scanner.nextLine());
                System.out.println(num);
            }

            // Close the scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
