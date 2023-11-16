package part6;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    String activityFactor;
    boolean genderIsMale;
    double actFact;
  
    double BMR;

    public Person(String name) {
        this(name, 0, 0, 0, true, "sedentary");
    }

    public Person(String name, int age, int height, int weight, boolean isMale, String activityFactor) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.activityFactor = activityFactor;
        this.genderIsMale = isMale;
       
        this.BMR = 10*this.weight + 6.25*this.height -5*this.age + 5;
       

       
    
    }
    
   



    // other constructors and methods

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }
    public int getWeight(){
        return this.weight;
    }

    public double growWeight(){
        this.weight = this.weight +1;
        return this.weight;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public double BMR(){

        if (genderIsMale) {
            this.BMR = 10*this.weight + 6.25*this.height -5*this.age + 5;
        }
        else{
            this.BMR =  10*this.weight + 6.25*this.height -5*this.age -161;
            
        }

        return this.BMR;

     

    }
    public double protienReq(){
       if(this.actFact == 1.2){
        return this.weight*0.8;

       }else if (this.actFact == 1.375) {
        return this.weight*0.95;
        
       }else if (this.actFact == 1.55) {
        return this.weight*1.25;
       }else if (this.actFact == 1.735) {
        return this.weight*1.44;

       }else {
        return this.weight*1.6;
       }
    }

    public double getCarbsReq(){
       return this.BMR*this.actFact*0.5/4;
    }
    public double fatIntake(){
        if (this.age >=2 || this.age<=3) {
            return this.BMR*this.actFact*0.3/9 ;

            
        }else {
            if (this.age>4 || this.age<=18) {
                return this.BMR*this.actFact*0.25/9;
                
            }else{
                return this.BMR*this.actFact*0.2/9;
            }
        }
    }


    public double getactivityFactor(){
        if (this.activityFactor.equals("sedentary")) {
            this.actFact = 1.2;
            
        }
          if (this.activityFactor.equals("lightly active")) {
            this.actFact = 1.375;
            
        }
          if (this.activityFactor.equals("moderately active")) {
            this.actFact = 1.55;
            
        }
          if (this.activityFactor.equals("very active")) {
            this.actFact = 1.735;
            
        }
          if (this.activityFactor.equals("extra active")) {
            this.actFact = 1.9;
            
        }
        return this.actFact;
       
    }
    public double calorieIntake(){
        return this.BMR*this.actFact;
    }

    

   
   

    @Override
    public String toString() {
        return "Welcome "+ this.name + "\n" + " Your activity factor is : "+ this.getactivityFactor() + "\n  " + ". Your basal metabolic rate is " + this.BMR + " and the total calorie requirement is " + this.BMR*this.actFact + " Calories. "  ;

    }
    
}
