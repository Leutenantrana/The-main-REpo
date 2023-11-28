package part10.Streams.UsefulTechniques.cards;

import java.util.Comparator;

public class SortBySuit implements Comparator<Card> {
    public int compare(Card C1, Card C2){
        return C1.getSuit().ordinal() - C2.getSuit().ordinal();
    }
    
}
