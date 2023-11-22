package part8.Abbrebriation;

import java.util.HashMap;

public class program {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    public static void printKeys(HashMap<String, String> hashMap){
        for(String keys : hashMap.keySet()){
            System.out.println(keys);
        }

    }

    public static void printKeysWhere(HashMap<String, String> hashMap, String i){

        for(String keys : hashMap.keySet()){
            if (keys.contains(i)) {
                System.out.println(keys);

            }

        }
    }
     public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String i){
          for(String keys : hashmap.keySet()){
            if (keys.contains(i)) {
                System.out.println(hashmap.get(keys));

            }

        }

        
    }


   
    
}
