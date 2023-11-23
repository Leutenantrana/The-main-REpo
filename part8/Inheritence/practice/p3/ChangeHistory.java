package part8.Inheritence.practice.p3;

import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory(){
        this.history = new ArrayList<>();
    }

    public void add(double status){
        this.history.add(status);
    }
    public void clear(){
        history.clear();
    }

    public String toString(){
       return history.toString();
    }

    public double maxValue(){
        double largest = this.history.get(0);
        for(int i =0; i<this.history.size()-2; i++){
            
            if (largest<this.history.get(i+1)) {
                largest = this.history.get(i+1);
                
            }

           

        }
         return largest;
    }

    public double minValue() {
        double minimum = this.history.get(0);
        for(int i= 0; i<this.history.size()-2;i++){
            if (minimum>this.history.get(i+1)) {
                minimum = this.history.get(i+1);
                
            }
        }
        return minimum;
    }

    public double average(){
        double sum =0;

         for(int i= 0; i<this.history.size()-1;i++){
            sum = sum + this.history.get(i);
           
        }

        return sum/this.history.size();
        
    }

     
    

    
}
