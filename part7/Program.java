package part7;
import java.util.Scanner;

public class Program {

    
    private container container1;
    private container container2;
    
    public Program(){
        
        this.container1 =new container(100);
        this.container2 = new container(100);
    }

    public void addValue(int addAmount){
        int NewValue;
        if (addAmount>0) {
            NewValue = this.container1.getvalue() + addAmount;



            if (NewValue>100) {
                this.container1.setvalue(100);
                
                
            }else{
                this.container1.setvalue(NewValue);
            }
            
        }
        System.out.println(this.container1.getvalue() + "/100");
        System.out.println(this.container2.getvalue() + "/100");

        


        
    }

    public void move(int moveValue){
        int newValue;
        int reducedValue;

            while (moveValue>0) {
                if (moveValue<=this.container1.getvalue()) {
                    newValue = this.container2.getvalue() + moveValue;
                    reducedValue =this.container1.getvalue() - moveValue;
                    this.container1.setvalue(reducedValue);


                        if (newValue>=100) {
                           this.container2.setvalue(100);
                    
                        }else{
                            this.container2.setvalue(newValue);
                        }
                            
                }else if (moveValue>this.container1.getvalue()) {
                    newValue =this.container2.getvalue() + this.container1.getvalue();
                    reducedValue = 0;
                    this.container1.setvalue(reducedValue);
                     if (newValue>100) {
                        this.container2.setvalue(100);
                    
                    }else{
                        this.container2.setvalue(newValue);
                    }


                
                }
                System.out.println(this.container1.getvalue() + "/100");
                System.out.println(this.container2.getvalue() + "/100");

                break;
            
            }
       
    }

    public void remove(int removeVal){
        int newValue;

        while (removeVal>0) {
            if (removeVal>100) {
                this.container2.setvalue(0);
                
            }else{
                this.container2.setvalue(this.container2.getvalue()-removeVal);
            }

            System.out.println(this.container1.getvalue() + "/100");
            System.out.println(this.container2.getvalue() + "/100");

            break;
            
        }

    }

    
}
