package part6.part6b.part6.part6.b;

import java.util.Scanner;



public class textUI {

    Scanner scanner;
    WordSet wordset;
    Dictionary dictionary;

    public textUI(Scanner scanner, Dictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){

        while (true) {
            System.out.println("Give me a Command!!!");
            String command =String.valueOf(scanner.nextLine());
            System.out.println("Command:" + command);
            if (command.equals("add") ) {
                while (true) {
                    System.out.println("Enter the word you want to add!!");

                    String S = String.valueOf(scanner.nextLine());

                    if (S.isEmpty()) {
                        break;
                        
                    }
                    this.dictionary.addWord(S);
                    System.out.println("Enter the meaning of the word");
                    String M = String .valueOf(scanner.nextLine());
                    this.dictionary.addTranslation(M);

                   
                    
                }

                
            }else if (command.equals("search")) {
                System.out.println("Enter the word");
                String toBeTranslated = String.valueOf(scanner.nextLine());
                System.out.println("To be translated :" + toBeTranslated);
                System.out.println(this.dictionary.translation(toBeTranslated));
                
                
            }
            else{

                System.out.println("Unknown Command");

            }

            


            
        }

    }
    

    
}
