package part8.Interfacepractice.p3;
import java.util.Random;

public class Factory {

    public Packable ProduceNew(){
        Random random = new Random();
        int num = random.nextInt(5);

        
        if (num == 0) {
            return new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        } else if (num== 1) {
            return new CD("Wigwam", "Nuclear Nightclub", 1975);
        } else if (num == 2) {
            return new Book("Robert Martin", "Clean Code", 1);
        } else if (num ==3) {
            return new Book("Kent Beck", "Test Driven Development", 0.7);
        }else {
            return new chocolateBar();
            

        }
    }
    


    
}
