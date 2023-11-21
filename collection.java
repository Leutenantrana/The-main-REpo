package part7.RandomMovie;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



import part7.recepeSearchingApp.Recipe;


public class collection {

    

   public static List<movie> giveMovies(){
    ArrayList<movie> movieColl = new ArrayList<>();
    movieColl.add(new movie(" Forrest Gump  ", 8.8, "Drama, Romance"));
    

    movieColl.add(new movie(" The Shawshank Redemption", 9.3 , "Drama"));
    movieColl.add(new movie(" The Perks of Being a Wallflower", 7.9, "Drama"));
    movieColl.add(new movie("The Dark Knight ", 9, "Action, Crime, Drama"));
    movieColl.add(new movie("Changeling",  7.8, "Biography, Crime, Drama"));
    movieColl.add(new movie("This Boy's Life ", 7.3, "Biography, Drama"));
    movieColl.add(new movie(" It's a Wonderful Life ",8.6 , "Drama, Family, Fantasy"));
    movieColl.add(new movie("The Silence of the Lambs",  8.6, "Crime, Drama, Thriller"));
    movieColl.add(new movie("8 Mile",7.2 , " Drama, Music"));
    movieColl.add(new movie(" The Breakfast Club", 7.8 , "Comedy, Drama"));
    movieColl.add(new movie("Django Unchained",8.5 , "Drama, Western"));
    movieColl.add(new movie("Silver Linings Playboo", 7.7, "Comedy, Drama, Romance"));
    movieColl.add(new movie("The Shining", 8.4 , "idk"));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));
    // movieColl.add(new movie("", , ""));

    return movieColl;


    

   }
    public static List<movie> RandomDramaMovie(){
        ArrayList<movie> RandomDramaCollection = new ArrayList<>();

        RandomDramaCollection.add(new movie("The Shawshank Redemption", 9.3,"Drama"));
        RandomDramaCollection.add(new movie(" The Godfather",9.2 ,"Drama,Crime"));
        RandomDramaCollection.add(new movie("The Godfather", 9.2,"Crime, Drama"));
        RandomDramaCollection.add(new movie(" The Godfather Part II", 9,"Drama"));
        RandomDramaCollection.add(new movie("The Dark Knight",9 ,"Drama"));
        RandomDramaCollection.add(new movie("Pulp Fiction", 8.9,"Drama"));
        RandomDramaCollection.add(new movie("12 Angry Men",9 ,"Drama"));
        RandomDramaCollection.add(new movie("Schindler's List", 9 ,"Drama"));
        RandomDramaCollection.add(new movie("Fight Club", 8.8 ,"Drama"));
        RandomDramaCollection.add(new movie("Forrest Gump",8.8 ,"Drama"));
        RandomDramaCollection.add(new movie("One Flew Over the Cuckoo's Nest",  8.7,"Drama"));
        RandomDramaCollection.add(new movie(" Seven Samurai ",8.6 ,"Drama"));
        RandomDramaCollection.add(new movie("GoodFellas", 8.7,"Drama"));
        RandomDramaCollection.add(new movie(" City of God ",  8.6,"Drama"));
        RandomDramaCollection.add(new movie(" The Usual Suspects", 8.6,"Drama"));
        RandomDramaCollection.add(new movie(" It's a Wonderful Life", 8.6 ,"Drama"));
        RandomDramaCollection.add(new movie("City Lights ", 8.5 ,"Drama"));

        return RandomDramaCollection;
    }
    public static List<movie> RandomBiographicMovies(){

        ArrayList<movie> RandomBiographicCollection = new ArrayList<>();

        RandomBiographicCollection.add(new movie(" Lawrence of Arabia",  8.3, " Biography"));
                
        RandomBiographicCollection.add(new movie("  GoodFellas", 8.7 , " Biography"));
        RandomBiographicCollection.add(new movie(" Schindler's List",9 , " Biography"));
        RandomBiographicCollection.add(new movie(" Raging Bull (",8.1 , " Biography"));
        RandomBiographicCollection.add(new movie("Amadeus ", 8.4 , " Biography"));
        RandomBiographicCollection.add(new movie("The Wolf of Wall Street ",  8.2, " Biography"));
        RandomBiographicCollection.add(new movie(" The Pianist",  8.5, " Biography"));
        RandomBiographicCollection.add(new movie(" A Beautiful Mind",  8.2, " Biography"));
        RandomBiographicCollection.add(new movie(" The Assassination of Jesse James by the Coward Robert Ford", 7.5 , " Biography"));
        RandomBiographicCollection.add(new movie(" Lion",  8, " Biography"));
        RandomBiographicCollection.add(new movie(" Patton",7.9 , " Biography"));
        RandomBiographicCollection.add(new movie(" ", 7.5, " Biography"));
        RandomBiographicCollection.add(new movie("The Aviator ",7.5 , " Biography"));
        RandomBiographicCollection.add(new movie(" Ed Wood", 7.8, " Biography Comedy, Drama"));
        RandomBiographicCollection.add(new movie("  BlacKkKlansman", 8.2, " Biography Comedy, Crime"));
        RandomBiographicCollection.add(new movie("  The Elephant Man ",  8.2, " Biography "));
        RandomBiographicCollection.add(new movie("  A Hidden Life", 7.4, " Biography"));
        RandomBiographicCollection.add(new movie("  Dog Day Afternoon ",  8, " Biography"));
        RandomBiographicCollection.add(new movie("  Bonnie and Clyde ", 7.7, " Biography  Drama, History"));
        RandomBiographicCollection.add(new movie("  Memories of Murder", 8.1, " Biography, Drama, Mystery"));
        RandomBiographicCollection.add(new movie(" Fruitvale Station",  7.5, " Biography, Crime, Drama"));
        RandomBiographicCollection.add(new movie("Into the Wild ",8.1 , " Biography"));
        RandomBiographicCollection.add(new movie(" The King's Speech", 8, " Biography, Drama"));
        // RandomBiographicCollection.add(new movie(" ", , " Biography"));
        // RandomBiographicCollection.add(new movie(" ", , " Biography"));
        // RandomBiographicCollection.add(new movie(" ", , " Biography"));
        // RandomBiographicCollection.add(new movie(" ", , " Biography"));


        return RandomBiographicCollection;
    }

    public static List<movie> RandomMovieScifi(){
        ArrayList<movie> RandomSciFiCollection = new ArrayList<>();

        String filePath = "path/to/your/file.txt";

        // Create a File object
        File file = new File(filePath);

        try{
            Scanner scanner = new Scanner(file);

            // Read and print each line from the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Close the scanner to release resources
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        }

        }



         return RandomSciFiCollection;
    }


   

    
}
