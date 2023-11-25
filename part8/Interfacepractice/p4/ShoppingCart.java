package part8.Interfacepractice.p4;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;


public class ShoppingCart {
    Map<String, Item> cartItems;
    int price;
    Set<String> set;

    public ShoppingCart(){
        this.cartItems = new HashMap<>();
        this.set = new HashSet<>();
        this.price = 0;
    }

    public void add(String product, int price){
        if (cartItems.containsKey(product)) {
            // Product is already in the cart, so increase the quantity
            this.cartItems.get(product).increaseQuantity();
        } else {
            // Product is not in the cart, so add a new item
            this.cartItems.put(product, new Item(product, price));
        }
       


    }
    public int price(){
        for(String name : this.cartItems.keySet()){
            this.price = this.price + this.cartItems.get(name).unitPrice;
        }
        return this.price;
    }

    public void print(){
        for(String name : this.cartItems.keySet()){
         
            System.out.println(this.cartItems.get(name).product + " : " + this.cartItems.get(name).qty );
        }

    }

   
    

}
