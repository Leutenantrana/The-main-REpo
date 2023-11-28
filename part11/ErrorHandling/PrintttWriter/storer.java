package part11.ErrorHandling.PrintttWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class storer {
    
    public void writeToFile( String text) throws Exception{
        String FilepName = "C:\\Users\\sagar rana 11\\Desktop\\Core_Java_Part_II\\part11\\ErrorHandling\\PrintttWriter\\sampleFile.txt ";
        FileWriter writer = new FileWriter(FilepName);

        writer.println(text);
        writer.close();

    }

    public static void main(String[] args) throws Exception {
        storer s = new storer();
        // String Filepath = "C:\\Users\\sagar rana 11\\Desktop\\Core_Java_Part_II\\part11\\ErrorHandling\\PrintttWriter\\sampleFile.txt";
        s.writeToFile("The text has been written with PrintWriter");
        // System.out.println("Enter the text");
        // Scanner scanner = new Scanner(System.in);
        // String Text = scanner.nextLine();
        // s.writeToFile( Text);

        ArrayList<String> lines =new ArrayList<>();

        Files.lines(Paths.get("C:\\\\Users\\\\sagar rana 11\\\\Desktop\\\\Core_Java_Part_II\\\\part11\\\\ErrorHandling\\\\PrintttWriter\\\\sampleFile.txt")).forEach(line -> lines.add(line));
        System.out.println(lines);


    }

}
