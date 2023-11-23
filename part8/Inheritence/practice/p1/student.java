package part8.Inheritence.practice.p1;

public class student extends person {
    
    int points;

    public student(String name, String address){
        super(name, address);
        this.points = 0;
    }

    public void study(){
        this.points = this.points + 1;
    }

    public int credits(){
        return this.points;
    }

    @Override
    public String toString(){
        return super.toString() + " \n" + "Study Credits :  " + this.credits();
    }

}
