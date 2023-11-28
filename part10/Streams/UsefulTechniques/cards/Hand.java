package part10.Streams.UsefulTechniques.cards;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> CardsInHand;

    public Hand(){
        this.CardsInHand = new ArrayList<>();
    }
    public void add(Card card){
        this.CardsInHand.add(card);
    }
    public void print() {
        for( Card card : this.CardsInHand){
            System.out.println(card);
        }
    }
    public int sumOfAll(){
        int sum =0;
        for(Card card : this.CardsInHand){
            sum = sum + card.number;
        }
        return sum;
    }
    public void sort(){
    //    Comparator<Card> comparator = Comparator
    //        .comparing(Card :: getNumber)
    //        .thenComparing(Card::getSuit);

    //     Collections.sort(CardsInHand, comparator);  
           Collections.sort(this.CardsInHand);
       
    }
    public void sortBySuit(){
        SortBySuit sortBySuitSorter = new SortBySuit();
        Collections.sort(this.CardsInHand, sortBySuitSorter);
        BySuitInValueOrd sorter = new BySuitInValueOrd();
        Collections.sort(this.CardsInHand, sorter);
        
    }
    @Override
    public int compareTo(Hand hand){
        return this.sumOfAll() - hand.sumOfAll();
    }

    
}
