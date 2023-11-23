package part8.Inheritence.practice.p6;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    int capacity;
    ArrayList<Item> items;
    int balance;

    public BoxWithMaxWeight(int capacity){
        
        this.capacity =capacity;
        this.items = new ArrayList<>();
        this.balance = 0;
       


    }
    public void add(Item item){
        int amount = item.weight();
        int spaceleft = this.capacity - this.balance;
        if (amount>0) {
            
            if (amount<=spaceleft) {
                this.balance = this.balance + amount;
                this.items.add(item);
                
            }else{
                this.balance = this.balance;
            }
            
        }

    }
    public boolean isInBox(Item item){
        String name = item.getName();
        for(int i=0; i<this.items.size();i++){
            if (this.items.get(i).equals(item)) {
                return true;
                
            }
           
        }
        return false;
        
    }

   


    
}
