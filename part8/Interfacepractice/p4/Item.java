package part8.Interfacepractice.p4;

public class Item {
    String product;
    int qty;
    int unitPrice;

    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    public Item(String product, int unitPrice){
        this.product = product;
        this.unitPrice = unitPrice;
        this.qty = 1;
    }
    public int price() {
        return this.unitPrice*this.qty;
    }

    public void increaseQuantity(){
        this.qty += 1;
    }

    public String toString(){
        return "Name: " + this.product + ",  Price : " + this.unitPrice + ", Quantity : "+  this.qty;
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

        if (this.product == comparedItem.product || this.qty == comparedItem.qty|| this.unitPrice == comparedItem.unitPrice ) {
            return true;
            
        }
        return false;


    }
    public int hashCode() {
        int result = 17; // Initial value, often a prime number
        result = 31 * result + (product != null ? product.hashCode() : 0); // Combine with name
        long weightBits = Double.doubleToLongBits(unitPrice);
        result = 31 * result + (int) (weightBits ^ (weightBits >>> 32)); // Combine with weight
        return result;
    }


    


    
}
