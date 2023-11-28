package part11.ErrorHandling.Divtionary;

public class tester {
    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("C:\\Users\\sagar rana 11\\Desktop\\Core_Java_Part_II\\part11\\ErrorHandling\\Divtionary\\words.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));

        dictionary.save();
    }
    
}
