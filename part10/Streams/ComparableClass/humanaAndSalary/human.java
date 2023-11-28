package part10.Streams.ComparableClass.humanaAndSalary;

import part8.Interfacepractice.p4.Store;
import part8.learninghash.get;

public class human implements Comparable<human> {
    
    private String name;
    private int wage;

    public human(String name, int wage){
        this.name = name;
        this.wage = wage;

    }

    public int getWage(){
        return this.wage;
    }
    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Person : " + this.name + ", " + "Salary : " + this.wage;
    }

    @Override

    public int compareTo( human human){
        return -(this.wage - human.wage);
    }




}
