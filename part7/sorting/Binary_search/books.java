package part7.sorting.Binary_search;

public class books {

    String name;
    int id;

    public books(String name, int id){
        this.name = name;
        this.id =id;

    }
    public String getName(){
        return this.name;
    }  
    public int getId(){
        return this.id;
    } 
    public String toString(){
        return this.name + this.id;
    }

}
