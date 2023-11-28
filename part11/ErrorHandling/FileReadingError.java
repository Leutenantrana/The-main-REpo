package part11.ErrorHandling;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReadingError {
    public static void main(String[] args) {
        
       

    }

        public List<String> readLines(String fileName){
            List<String> lines =  new ArrayList<>();

            try {
                Files.lines(Paths.get("file.txt")).forEach(line -> lines.add(line));
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            return lines;
        }

        public List<String> readLines(String fileName) throws Exception {
            ArrayList<String> lines =  new ArrayList<>();
            Files.lines(Paths.get(fileName)).forEach(line -> lines.add(line));
            return lines;
        }
    
}
