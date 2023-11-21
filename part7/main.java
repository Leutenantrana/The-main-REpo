package part7;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Program program = new Program();

        while (true) {

            System.out.print("Command:");
            String S = String.valueOf(scanner.nextLine());
            if (S.equals("add")) {
                System.out.println("Enter the amount:");
                int val = Integer.valueOf(scanner.nextLine());
                program.addValue(val);
                
            }else if( S.equals("move")){
                System.out.println("Enter the amount to be moved");
                int val = Integer.valueOf(scanner.nextLine());
                program.move(val);
            }else if (S.equals("reduce")) {
                System.out.println("enter the amount to be removed:");
                int val = Integer.valueOf(scanner.nextLine());
                program.remove(val);
                
            }else{
                break;
            }

            
        }

        
    }
}
