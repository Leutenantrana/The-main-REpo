package part8;
import java.util.HashMap;
import java.util.ArrayList;

public class contactNumTracker {

    private HashMap<String, ArrayList<String> > contactRegister;

    public contactNumTracker(){
        this.contactRegister = new HashMap<>();
    }

    public void add(String user , String contactNumber){

        this.contactRegister.putIfAbsent(user, new ArrayList<>());  
        ArrayList<String> contacts = this.contactRegister.get(user);
        contacts.add(contactNumber);

    }

    public void print(){
        for(String string : this.contactRegister.keySet()){
            System.out.println(string + this.contactRegister.get(string));

        }
    }


    
}
