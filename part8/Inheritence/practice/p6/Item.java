package part8.Inheritence.practice.p6;
import java.util.Objects;

public class Item {
    
    int weight;
    String name;

    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;

    }
    public Item(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public int weight(){
        return this.weight;
    }

    @Override
    public boolean equals(Object comparedObject){
        if (this == comparedObject) {
            return true;
            
        }

        if (!(comparedObject instanceof Item)) {
            return false;
            
        }

        Item comparedItem = (Item) comparedObject;

        if (this.name == comparedItem.name || this.weight == comparedItem.weight) {
            return true;
            
        }
        return false;

    }

    public int hashCode() {
        int result = 17; // Initial value, often a prime number
        result = 31 * result + (name != null ? name.hashCode() : 0); // Combine with name
        long weightBits = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (weightBits ^ (weightBits >>> 32)); // Combine with weight
        return result;
    }



}
