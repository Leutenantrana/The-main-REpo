package part10.Streams.UsefulTechniques.cards;

public class Card implements Comparable<Card>{
    Suit suit;
    int number;

    public Card(int number, Suit suit){
        this.suit = suit;
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }
    public Suit getSuit(){
        return this.suit;
    }


    public String toString(){

        if (this.number == 12) {
            return this.suit + " Q";
            
        }else if (this.number == 13) {
            return this.suit + "K";
            
        }else if (this.number ==14) {
            return this.suit + " A";
            
        }else if (this.number ==11) {
            return this.suit + "J";
            
        }else{
             return this.suit + " "+ this.number;
        }
        
       
    }


    @Override

    public int compareTo(Card card){
        int valueComparison = Integer.compare(this.number, card.number);


        if (valueComparison== 0) {
            return this.suit.ordinal() - card.getSuit().ordinal();
            
        }

        return valueComparison;

    }
    
}
