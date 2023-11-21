package part7.RandomMovie;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        movieUserInterface user = new movieUserInterface(scanner);

        System.out.print("Genre :");

        String Genre = String.valueOf(scanner.nextLine());
        System.out.println(" ");
        System.out.println(" ");


        if (Genre.equals("Drama")) {

            
            List<movie> Collection = collection.RandomDramaMovie();
            user.getRandommovie(Collection);
            
        }else if (Genre.equals("Top rated")) {
            List<movie> Collection = collection.giveMovies(); 

            user.getRandommovie(Collection);
        }else if(Genre.equals("biography")){
            List<movie> Collection = collection.RandomBiographicMovies();

            user.getRandommovie(Collection);
        }
            
      


       
    }
    
}
