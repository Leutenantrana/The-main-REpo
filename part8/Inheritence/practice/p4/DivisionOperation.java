package part8.Inheritence.practice.p4;

import java.util.Scanner;

importjava.util.Scanner;

public class DivisionOperation extends Operation{

    public DivisionOperation(){
        super("DivisionOperation");
    }


    
    @Override
    public void execute(Scanner scanner){
        System.out.print("First number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("The division of the numbers is " + Math.abs(first/second));

    }
    
}
