package part8.Interfacepractice.p3;
import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> boxItems;
    private double holding;
    private double capacity;

    public Box( double capacity){

        this.boxItems = new ArrayList<>();
        this.capacity = capacity;
        this.holding = 0;

    }

    public void add(Packable packable){
        double Space =this.capacity - this.holding;

        if (Space> packable.weight()) {
            this.boxItems.add(packable);
           

            
        }
    }

    
    public String toString(){
        return "Box: " + this.boxItems.size() + " items, " + weight() + " Kg";
    }



    @Override
    public double weight(){
        for( Packable packable : this.boxItems){
            this.holding = this.holding + packable.weight();
        }
        return this.holding;

    }


    
}
