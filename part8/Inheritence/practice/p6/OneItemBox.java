package part8.Inheritence.practice.p6;
import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> items;

    

    public OneItemBox(){
        this.items = new ArrayList<>(1);

    }

    public void add(Item item){

        this.items.add(item);

    }
    public boolean isInBox(Item item){
        if (this.items.get(0).equals(item)) {
            return true;
            
        }
        return false;
    }
    
}
