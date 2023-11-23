package part8.Inheritence.practice.p3;

public class main {

    public static void main(String[] args) {
        // ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        // juice.addToWarehouse(1000.0);
        // juice.takeFromWarehouse(11.3);
        // System.out.println(juice.getName()); // Juice
        // System.out.println(juice);           // balance = 988.7, space left 11.3

        // ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        // juice.addToWarehouse(1000.0);
        // juice.takeFromWarehouse(11.3);
        // System.out.println(juice.getName()); // Juice
        // juice.addToWarehouse(1.0);
        // System.out.println(juice);   
        
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
        //System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        juice.printAnalysis();
    }
    
   

    

}
