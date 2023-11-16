package part6.part6b.part6.part6.b;

public class Dictionary {
    WordSet wordsInDictionary;
    WordSet translationOfWord;

    public Dictionary(){
        this.wordsInDictionary = new WordSet();
        this.translationOfWord = new WordSet();



    }

    public void addWord(String word){
        this.wordsInDictionary.addWords(word);
    }
    public void addTranslation(String word){
        this.translationOfWord.addWords(word);
    }

    public String translation(String word){
        if (this.wordsInDictionary.contains(word)) {

            int i = this.wordsInDictionary.getIndex(word);
            return this.translationOfWord.getWord(i);
            
        }else{
            return "Go to the UI and add the word.";
        }

    }

}
