package part8;
import java.util.HashMap;
public class VehicleRegistry {

    HashMap<LicensePlate, String> hashMap;

    public VehicleRegistry(){
        this.hashMap = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){

        if (this.hashMap.get(licensePlate)==null) {
            this.hashMap.put(licensePlate, owner);
            return true;
            
        }else{
            return false;

        }

    }

    public String get (LicensePlate licensePlate){
        return this.hashMap.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        if (this.hashMap.containsKey(licensePlate)) {
            this.hashMap.remove(licensePlate);
            return true;
            
        }else{
            System.out.println("there is no data with the license plate");
            return false;
        }
    }
    public void printLicensePlates(){
        for(LicensePlate plates : this.hashMap.keySet()){

            System.out.println("The registered Number Plate are :");

            System.out.println(plates);

        }
    }
    public void printOwner(){
        for(LicensePlate plates : this.hashMap.keySet()){

            System.out.println("The registered owners are:");
            System.out.println(this.hashMap.get(plates));
        }
    }

    public void registered(){
        for(LicensePlate plates : this.hashMap.keySet()){
            System.out.println(plates +  " " + this.get(plates));
        }
    }
    
}
