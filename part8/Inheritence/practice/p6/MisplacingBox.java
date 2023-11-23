package part8.Inheritence.practice.p6;

public class MisplacingBox extends Box{

    public MisplacingBox(){

    }
    public void add(Item item){

        // this.items.add(item);

    }
    public boolean isInBox(Item item){
       return false;
    }

    
}
