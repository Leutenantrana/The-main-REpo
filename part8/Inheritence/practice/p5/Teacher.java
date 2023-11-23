package part8.Inheritence.practice.p5;



public class Teacher extends Person {

    String name;
    String address;
    int salary;
    public Teacher(String name, String address, int salary){
        super(name, address);
        this.salary = salary;

    }

    public int GetSalary(){
        return this.salary;
    }


    @Override
    public String toString(){
        System.out.println( " Name: " + getName() +" " +"Address : " + this.address + "\n" + "Salary : " + this.salary );
        return getName() + this.address;
    }

    public String getName(){
        
        return this.name; 
    }

    
}
