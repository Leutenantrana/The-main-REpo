package part10.Streams.UsefulTechniques.cards;
import java.util.Comparator;

public class BySuitInValueOrd implements Comparator<Card> {
    public int compare(Card card1, Card card2) {
        // First, compare suits
        return card1.getNumber() - card2.getNumber();
    }
    

    
}
