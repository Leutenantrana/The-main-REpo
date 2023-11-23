package part8.Inheritence.practice.p5;



public class Student extends Person {

    int credit;

    public Student(String name, String address){
        super(name, address);
        this.credit =0;
    }

    public int Study(){
        this.credit =this.credit +1;
        return this.credit;

    }

    @Override

        public String toString(){
            System.out.println(getName() + this.address + this.credit);
            return getName() + this.address + this.credit;
        }

        public String getName(){
            
            return this.name; 
        }




    

    




  
 
}
