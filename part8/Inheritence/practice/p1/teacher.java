package part8.Inheritence.practice.p1;

public class teacher extends person {
    int salary;

    public teacher(String name, String address, int salary){
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString(){
        return super.toString() + " \n" + " Salary :" + this.salary + " euroes/month";
    }
}
