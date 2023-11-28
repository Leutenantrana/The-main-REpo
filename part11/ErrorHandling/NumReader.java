package part11.ErrorHandling;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class NumReader {
    public static void main(String[] args) {
      
        ArrayList<String> lines = new ArrayList<>();
        
        try (Scanner reader = new Scanner(new File("C:\\Users\\sagar rana 11\\Desktop\\Core_Java_Part_II\\part11\\ErrorHandling\\sampleTextFile.txt"))) {

            // read all lines from a file
            while (reader.hasNextLine()) {
                lines.add(reader.nextLine());
                System.out.println("");
                
            }
            System.out.println(lines);
        } catch (Exception e) {
            System.out.println("Error: " + e.printStackTrace(););
        }

    }
}
