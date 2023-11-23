package part8.Inheritence.practice.p4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        UserInterface userInterface = new UserInterface(new Scanner(System.in));
        userInterface.addOperation(new PlusOperation());
        userInterface.addOperation(new MinusOperation());

        MultiplyOperation m1 =new MultiplyOperation();

        userInterface.addOperation(m1);

        userInterface.start();
        
    }
    
}
