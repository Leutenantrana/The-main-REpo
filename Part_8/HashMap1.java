package Part_8;
import java.util.HashMap;

import java.util.ArrayList;
import java.util.List;

import java.util.Map;

public class HashMap1 {

    public static void main(String[] args) {
        
        HashMap<String, String> names = new HashMap<>();
        names.put("sagar", "savvy");

        names.put("Aarav", "Krish");

        names.put("Ashwin", "Mallu");

        names.put("Aarav", "Lula");


        names.get("Ashwin");
        System.out.println(names.get("Ashwin"));
        System.out.println(names.get("Aarav"));
       


    }
    
}
