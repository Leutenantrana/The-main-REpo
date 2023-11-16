package part6.part6b.part6.part6.b.todo;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        todo todolist = new todo();
        ui Sagar = new ui(todolist, scanner);
        Sagar.start();
    
        
    }
   
    
}
