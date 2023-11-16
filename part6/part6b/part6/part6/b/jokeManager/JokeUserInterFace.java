package part6.part6b.part6.part6.b.JokeMaker;
import java.util.Scanner;

public class JokeUserInterFace {
    private Scanner scanner;
    private jokeManager jokemachine;

    public JokeUserInterFace(Scanner scanner, jokeManager jokeMachine){
        this.jokemachine = jokeMachine;
        this.scanner = scanner;
    }

    public void start(){

        while (true) {
            System.out.print("Give me a Command!!!");
            String command =String.valueOf(scanner.nextLine());
            System.out.println("Command:" + command);

            if (command.equals("add")) {
                while (true) {
                    System.out.print("Write your joke");
                    String JokeContent = String.valueOf(scanner.nextLine());
                    if (JokeContent.isEmpty()) {
                        break;
                        
                    }

                    else {
                        this.jokemachine.addJokes(JokeContent);
                        
                    }
            

                    
                } 
            
                
                
            }

            if (command.equals("remove")) {
                while (true) {
                    System.out.println("What do you want to remove!! "+ "\n" + "Write joke no to remove and 0 to exit");
                    int index = Integer.valueOf(scanner.nextLine());

                    if (index == 0) {
                        break;
                        
                    }
                    this.jokemachine.removeJoke(index);
                    System.out.println("The Joke is removed!!!");
                    
                }
                
            }

            if(command.equals("draw")){
                this.jokemachine.drawJokes();
            }
            
            if (command.equals("end")) {

                break;
                
            }
            if (command.equals("print")) {
                this.jokemachine.printJokes();
                
            }
            if (command.equals("already")) {
                this.jokemachine.alreadyAddedJokes();
                this.jokemachine.printJokes();
                
            }
            
            
        }

      

    }


    
}
