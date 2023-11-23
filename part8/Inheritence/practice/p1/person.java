package part8.Inheritence.practice.p1;

public class person {

    String name;
    String address;

    public person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String toString(){
        return this.name + " \n  " + "   " + this.address;
    }
    
}
