package part8.Inheritence.practice.p5;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    ArrayList<Person> group;
    private Scanner scanner;

    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.group = new ArrayList<>();
    }

    public void addmembers(Person person){
        this.group.add(person);

    }
    public void start(){

        while (true) {
            printAllMembers();
            System.out.println("enter the number");
            String number = scanner.nextLine();
            if (number.equals("0")) {
                break;
            
            }
            executeOperation(number);
            System.out.println();
        }
        



    }
    private void executeOperation(String choice) {
        int operation = Integer.valueOf(choice);

        Person chosen = this.group.get(operation - 1);
        chosen.toString();
    }
    public void printAllMembers(){
  
            System.out.println("\\t0: Stop");
            int i =0;
            while (i<this.group.size()) {
                String member = this.group.get(i).getName();

                System.out.println("\t" + (i + 1) + ": " + member);
                i = i+1;
                
            }
            
        

    }

    
}
