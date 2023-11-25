package part8.Interfacepractice.p3;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
       Box newBox = new Box(50);

       Box smallbox = new Box(30);
      
       
       smallbox.add(new Book("null", "null", 3));
       
      

       newBox.add(smallbox);
       newBox.add(new Book("The power of you", "The in==nm", 2));
       newBox.add(new CD("null", "null", 5));
       newBox.add(new CD("The Vampire Diaries", "Unknown", 1));

       System.out.println(newBox);


        
       

    }
}
