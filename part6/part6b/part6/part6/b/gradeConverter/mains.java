package part6.part6b.part6.part6.b.gradeConverter;

import java.util.Scanner;

public class mains {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();
        UserInterface ui = new UserInterface(register, scanner);
        ui.start();

        
    }
   
    

    
    
}
