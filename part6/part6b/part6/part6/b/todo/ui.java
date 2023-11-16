package part6.part6b.part6.part6.b.todo;

import java.util.Scanner;

public class ui {

    todo list;
    Scanner scanner;
    
    public ui( todo list , Scanner scanner){
        this.list =list; 
        this.scanner = scanner;

    }
    public void start(){

        while (true) {
                System.out.println("Give me a Command!!!");
            String command =String.valueOf(scanner.nextLine());
            System.out.println("Command:" + command);

            if (command.equals("add")) {
                while (true) {
                    System.out.println("Buddy tell me whatcha wanna add?");
                    String ListContent = String.valueOf(scanner.nextLine());
                    if (ListContent.isEmpty()) {
                        break;
                        
                    }

                    else {
                        this.list.addTask(ListContent);
                        
                    }
            

                    
                } 
            
                
                
            }

            if (command.equals("remove")) {
                while (true) {
                    System.out.println("What do you want to remove!! "+ "\n" + "Write task no to remove and 0 to exit");
                    int index = Integer.valueOf(scanner.nextLine());

                    if (index == 0) {
                        break;
                        
                    }
                    this.list.removeTask(index);
                    System.out.println("The task is removed!!!");
                    
                }
                
            }

            if(command.equals("print")){
                this.list.print();
            }
            
            if (command.equals("end")) {

                break;
                
            }
            
            
        }

      

    }
}
