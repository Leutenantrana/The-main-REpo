package part8.Inheritence.practice.p5;

public abstract class Person {

    String name;
    String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public abstract String getName();

    public String getAddress(){
        return this.address;
        
    }

    public abstract String toString();



    
}
