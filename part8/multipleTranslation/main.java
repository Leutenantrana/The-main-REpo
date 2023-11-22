package part8.multipleTranslation;

public class main {

    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));

        dictionary.add("Ballon d'or", "Messi");
        dictionary.add("Ballon d'or", "Ronaldo");
         dictionary.add("Ballon d'or", "Ronaldo");

        System.out.println(dictionary.translate("Ballon d'or"));


    }
    
}
