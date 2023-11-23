package part8.Inheritence.practice.p3;

public class Warehouse {

    private double capacity;
    private double balance;

    public Warehouse(double capacity){

        if (capacity<=0) {
            this.capacity = 0;
            
        }else {
            this.capacity = capacity;
        }
        this.balance = 0;
        
       
       

    }

    public double getBalance(){
        return balance;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        return this.capacity -this.balance;
    }

    public void addToWarehouse(double amount) {
       if(amount>0) {
        if (balance + amount <= capacity) {
            balance += amount;
        } else {
            // Warehouse is filled up, overflow
            balance = capacity;
        }

           
            
            
        }
    }
    public double takeFromWarehouse(double amount){
        if (amount< 0) {
            return 0;
            
        }
        double amountTaken = Math.min(balance, amount);
        balance -= amountTaken;
        return amountTaken;

       
    }

    public String toString() {
            return "balance = " + getBalance() + ", space left " + howMuchSpaceLeft();
    }
    
}
