package part8.multipleTranslation;
import java.util.HashMap;
import java.util.ArrayList;
public class DictionaryOfManyTranslations {
    private HashMap<String,ArrayList<String>> Dictionary;

    public DictionaryOfManyTranslations(){
        this.Dictionary = new HashMap<>();
    }

    public void add(String word, String translation){
        this.Dictionary.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> comp = this.Dictionary.get(word);
        comp.add(translation);
    }

    public ArrayList<String> translate(String word){
        return this.Dictionary.get(word);
    }

    public void remove(String word){
        this.Dictionary.remove(word);
    }

    
}
