package part11.ErrorHandling.Divtionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.stream.Collectors;
import java.nio.file.StandardOpenOption;

public class SaveableDictionary {

    HashMap<String, String> dictionary = new HashMap<>();
    HashMap<String, String> oppositeDictionary;
    String file;

    public SaveableDictionary(){
        this.dictionary = new HashMap<>();
        this.oppositeDictionary = new HashMap<>();
    }
    public SaveableDictionary(String file){
        this.dictionary = new HashMap<>();
        this.file = file;
    }
   
    public boolean load() {
        if (file == null) {
            return false; // File not set, loading failed
        }

        try {
            List<String> lines = Files.readAllLines(Paths.get(file));
            for (String line : lines) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    add(parts[0].trim(), parts[1].trim());
                }
            }
            return true;
        } 
        catch (IOException e) {
            return false;
        }
            
    }  
    public boolean save() {
        if (file == null) {
            return false; // File not set, saving failed
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            Set<String> words = dictionary.keySet();
            for (String word : words) {
                writer.println(word + ": " + dictionary.get(word));
            }
            return true;
        } catch (IOException e) {
            return false; // Saving failed
        }
    }    
    public void add(String words, String translation){
        dictionary.computeIfAbsent(words, k -> translation);
        dictionary.computeIfAbsent(translation,k -> words );
    }
    public String translate(String word){
      return this.dictionary.getOrDefault(word, null);
    }
    public void delete(String word){
        if (this.dictionary.containsKey(word)) {
            String Translation = this.dictionary.get(word);
            this.dictionary.remove(word);
            this.dictionary.remove(Translation);
        }    
    }    
       
       
   


    
}
