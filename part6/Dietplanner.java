package part6;

import java.util.ArrayList;

public class Dietplanner {
    Person person;
    meal meal;
    double calorieCount;
    double proteinCount;
    double carbCount;

    private ArrayList<String> myStringList;

    private ArrayList<String> myCarlStringList;
     private ArrayList<String> myCarbStringList;
    
    
    public Dietplanner(Person person ){
        this.person = person;
        
        this.calorieCount =0;
        this.proteinCount = 0;
        this.myStringList = new ArrayList<>();
        this.myCarlStringList = new ArrayList<>();
        this.myCarbStringList =new ArrayList<>();
        this.carbCount =0;



    }

    public double getCalorieCount(){
        return this.calorieCount; 
    }
    public double getProteinCount(){
        return this.proteinCount;
    }
    public double getCarbCount(){
        return this.carbCount; 
    }
    
    


    public String setProteinDiet( meal meal, double amount){
        this.proteinCount = this.proteinCount + amount;
        
        int quantity = (int) meal.howMuchForProtein(amount);

        String S = "Take" + " " +  meal.getName() +" " + quantity + "grams" ;

        
        
       

       if(this.proteinCount<this.person.protienReq()){

          this.myStringList.add(S);

          return meal.getName() + " taken "  + quantity + " grams " + " add another meal  the remaining protein requirement is " + (this.person.protienReq() - this.proteinCount) + "grams" +this.myStringList ; 
          
       }
       else {
        return this.myStringList + " follow the diet and stay fit and healthy ";
       }
       
       
        

    }

     public String setProteinDiet2( meal meal, double amount){
        this.proteinCount = this.proteinCount + amount;
        
        int quantity = (int) meal.howmuchForProtein(amount);

        String S = "Take" + " " +  meal.getName() +" "+ " Quantity:" + quantity  ;

        
        
       

       if(this.proteinCount<this.person.protienReq()){

          this.myStringList.add(S);


          return " Take " + quantity +" " +  meal.getName()  +   " and add another meal  the remaining protein requirement is " + (this.person.protienReq() - this.proteinCount) + "grams" +this.myStringList ; 

          
       }  
       else {
        return this.myStringList + " follow the diet and stay fit and healthy ";
       }
       
        

    }

    public String setCaloriesInDiet( meal meal, double amount){
        this.calorieCount = this.calorieCount + amount;
        
        int quantity = (int) meal.howMuchForCalorie(amount);

        String D = "Take" + " " +  meal.getName() +" " + quantity + "grams" ;

       

        
        
       

       if(this.calorieCount<this.person.BMR()*this.person.getactivityFactor()){

          this.myCarlStringList.add(D);


          return " Take " + quantity +" grams of " +  meal.getName()  +   " and add another meal for the remaining calorie requirement of " + (this.person.calorieIntake() - this.calorieCount) + " calories " +   "   " + this.myCarlStringList ; 

          
       }  
       else {
        return this.myCarlStringList + " follow the diet and stay fit and healthy ";
       }
       


        

    }
     public String setCaloriesInDiet2( meal meal, double amount){
        this.calorieCount = this.calorieCount + amount;
        
        int quantity = (int) meal.howmuchForCalorie(amount);

        String D = "Take" + " " +  meal.getName() +" " + " Quantity:"+  quantity ;

       

        
        
       

       if(this.calorieCount<this.person.BMR()*this.person.getactivityFactor()){

          this.myCarlStringList.add(D);


          return " Take " + quantity + " " +   meal.getName()  +   " and add another meal for the remaining calorie requirement of " + (this.person.calorieIntake() - this.calorieCount) + " calories " +   "   " + this.myCarlStringList ; 

          
       }  
       else {
        return "Your diet is " + "\n"+ this.myCarlStringList + "\n" + " follow the diet and stay fit and healthy ";
       }
       


        

    }
     public String setCarbDiet( meal meal, double amount){
        this.carbCount = this.carbCount + amount;
        
        int quantity = (int) meal.howMuchForCarb(amount);

        String T = "Take" + " " +  meal.getName() +" " + quantity + "grams" ;

        
        
       

       if(this.carbCount<this.person.BMR()*this.person.getactivityFactor()*0.5/4){

          this.myCarbStringList.add(T);

          return meal.getName() + " taken "  + quantity + " grams " + " add another meal the remaining carbohydrate requirement is " + (this.person.BMR()*this.person.getactivityFactor()*0.5/4 - this.carbCount) + "grams" +this.myCarbStringList ; 
          
       }
       else {
        return this.myCarbStringList + " follow the diet and stay fit and healthy ";
       }
       
       
        

    }
    public String setCarbDiet2( meal meal, double amount){
        this.carbCount = this.carbCount + amount;
        
        int quantity = (int) meal.howmuchForCarb(amount);

        String T = "Take" + " " +  meal.getName() +" " + " Quantity:" +  quantity ;

        
        
       

       if(this.carbCount<this.person.BMR()*this.person.getactivityFactor()*0.5/4){

          this.myCarbStringList.add(T);

          return "the number of" + meal.getName()  + "taken is " + quantity + " add another meal  the remaining amount of Carbohydrartes is  " + (this.person.BMR()*this.person.getactivityFactor()*0.5/4 - this.carbCount) + "grams" +this.myCarbStringList ; 
          
       }
       else {
        return this.myCarbStringList + " follow the diet and stay fit and healthy ";
       }
       
       
        

    }
    

    



    




}
