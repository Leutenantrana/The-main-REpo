package part8.Inheritence.practice;

public class Superclass {

    int intvalue;
    String objectVariable;
    Double doubleVariable;

   
    
    public Superclass(String obj , double d){
        this.objectVariable = obj;
        this.doubleVariable = d;
        
    }
    

    public Superclass( int intvalue){
        this.intvalue = intvalue;
    }

    public String toString(){
        return this.objectVariable + this.doubleVariable;
    }
}
