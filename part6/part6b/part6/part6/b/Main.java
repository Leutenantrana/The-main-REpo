package part6.part6b.part6.part6.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();

        textUI ui = new textUI(scanner, dictionary);
        ui.start();
        
    }
    
}
