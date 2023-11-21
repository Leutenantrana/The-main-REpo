package part7.RandomMovie;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;


public class movieUserInterface {

    private Scanner scanner;

    public movieUserInterface(Scanner scanner){
        this.scanner = scanner;

    }

    public void getRandommovie(List<movie> collection){
        Random random = new Random();
        int randomNumb = random.nextInt(collection.size());
        

        movie yourMovie = collection.get(randomNumb);

        System.out.println(yourMovie);
        
    }
    
}
