package part8.Inheritence.practice.p4;

import java.util.Scanner;

public class MinusOperation extends Operation {

    public MinusOperation(){
        super("MinusOperation");
    }

    @Override
    public void execute(Scanner scanner){
        System.out.print("First number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("The sub of the numbers is " + Math.abs(first - second));

    }


    
}
