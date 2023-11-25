package part8.Interfacepractice.p3;

public class Book implements Packable {

    String name;
    String authorName;
    double weight;
    public Book (String name, String authorName, double weight){
        this.name= name;
        this.authorName = authorName;
        this.weight = weight;
    }

    public String getName(){
        return this.name;

    }
    public String authorNAme(){
        return this.authorName;
    }

    public String toString(){
        return  this.name+ " : " +this.authorName ;
    }

    @Override

    public double weight(){
        return this.weight;
    }

    
}
