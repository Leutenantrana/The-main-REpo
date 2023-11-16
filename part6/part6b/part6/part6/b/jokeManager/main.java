package part6.part6b.part6.part6.b.JokeMaker;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        jokeManager jokerMaker = new jokeManager();
        Scanner scanner = new Scanner(System.in);
        JokeUserInterFace user1 = new JokeUserInterFace(scanner, jokerMaker);
        user1.start();
    }

    
}
