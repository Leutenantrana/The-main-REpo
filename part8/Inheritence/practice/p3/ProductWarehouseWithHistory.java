package part8.Inheritence.practice.p3;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory history;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.history = new ChangeHistory();
        addToWarehouse(initialBalance); 
       

    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(getBalance());  // Add the updated balance to the history
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);
        history.add(getBalance());  // Add the updated balance to the history
        return amountTaken;
    }

    public String history() {
        return history.toString();
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average amount of product: " + history.average());
    }

    
}
