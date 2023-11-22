package part8;
import java.util.HashMap;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
    
            LicensePlate li1 = new LicensePlate("FI", "ABC-123");
            LicensePlate li2 = new LicensePlate("FI", "UXE-465");
            LicensePlate li3 = new LicensePlate("D", "B WQ-431");
    
            // ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
            // finnishPlates.add(li1);
            // finnishPlates.add(li2);
    
            // LicensePlate newLi = new LicensePlate("FI", "ABC-123");
            // if (!finnishPlates.contains(newLi)) {
            //     finnishPlates.add(newLi);
            // }
            // System.out.println("finnish: " + finnishPlates);
            // // if the equals-method hasn't been overwritten, the same license number will be added to the list againg
    
            // HashMap<LicensePlate, String> owners = new HashMap<>();
            // owners.put(li1, "Arto");
            // owners.put(li3, "Jürgen");
    
            // System.out.println("omistajat:");
            // System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
            // System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
            // // if the hasCode-method hasn't been overwritten, the owners won't be found

           
            VehicleRegistry registry = new VehicleRegistry();

             System.out.println( registry.add(li3, "Jurgen"));
             System.out.println( registry.add(new LicensePlate("D", "B WQ-431"), "Sagar"));
             System.out.println( registry.add(li1, "Arto"));
             System.out.println( registry.add(li2, "Pitamber Singh"));

            System.out.println(registry.get(li3)); 

            System.out.println(registry.get(new LicensePlate("FI", "ABC-123")));

            // registry.printLicensePlates();
            // registry.printOwner();

            registry.registered();
            
           
           
    }
    



    // ____Overwriting hashcode!!!!__________________________________________________________________________________

        // @Override
        // public int hashCode() {
        //     return Objects.hash(liNumber, country);
        // }
}
