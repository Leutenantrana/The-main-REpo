package part8.Interfacepractice.p4;

import part8.Inheritence.main;
import part8.Inheritence.practice.p6.Item;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {

    private Map<String, Integer> storage;
    private Map<String, Integer> stockStorage;
    private Set<String> set;



    public Warehouse(){
        
        this.storage = new HashMap<>();
        this.stockStorage = new HashMap<>();
        this.set = new HashSet<>();
            
        

    }

    public void addProduct(String product, int price, int stock){

        this.storage.put(product, price);
        this.stockStorage.put(product, stock);
        this.set.add(product);
        




        
    }
    public int price(String product){
        return this.storage.get(product);
    }
    public int stock(String product){
        for(String key :this.storage.keySet()){
            if (key.equals(product)) {
                return this.stockStorage.get(product);

                
            }
        }
        return 0;
        
    }
    public boolean take(String product){
        
        
        if (stock(product)>0) {
            int newVal = stock(product) -1;
            this.stockStorage.put(product, newVal);
            return true;
        }else{
            return false;
        }
        
        
      
    }
    public Set<String> products(){
        return this.set;
    }
    

     @Override
    public boolean equals(Object comparedObject){
        if (this == comparedObject) {
            return true;
            
        }

        if (!(comparedObject instanceof Warehouse)) {
            return false;
            
        }

        Warehouse comparedItem = (Warehouse) comparedObject;

        if (this.stockStorage.keySet() == comparedItem.stockStorage.keySet() ) {
            return true;
            
        }
        return false;

    }

    // public int hashCode() {
    //     int result = 17; // Initial value, often a prime number
    //     result = 31 * result + (name != null ? name.hashCode() : 0); // Combine with name
    //     long weightBits = Double.doubleToLongBits(weight);
    //     result = 31 * result + (int) (weightBits ^ (weightBits >>> 32)); // Combine with weight
    //     return result;
    // }

}
