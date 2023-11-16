package part6.part6b.part6.part6.b;

import java.util.ArrayList;

public class WordSet {

    ArrayList<String> words;

    public WordSet(){
        this.words = new ArrayList<>();
    }

    public void addWords(String word){
        while (true) {
                if (contains(word)) {
                  break;
                }
                this.words.add(word);

            
        }
     

    }

    public boolean contains(String word){
        if (this.words.contains(word)) {
            return true;
            
        }return false;
    }

    public int getIndex(String word){
        return this.words.indexOf(word);
        
    }

    public String getWord(int index){
        return this.words.get(index);

    }

    

}
