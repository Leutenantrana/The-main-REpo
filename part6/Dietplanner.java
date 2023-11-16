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




   //--------------------------------------------------Protein Planner------------------------------------------------------------------------//
    
    


    public String setProteinDiet( meal meal, double amount){
        this.proteinCount = this.proteinCount + amount;
        
        int quantity = (int) meal.howMuchForProtein(amount);

        String S =  meal.getName() +" " + quantity + " grams" ;

        
        
       

       if(this.proteinCount<this.person.protienReq()){

          this.myStringList.add(S);

          return "Take" +  meal.getName()   + quantity + " grams " + " \n" + "The remaining protein requirement is " +  (this.person.protienReq() - this.proteinCount) + "grams" + " \n" + "\n "+"Your protein diet plan is" + this.myStringList  ; 
          
       }
       else {
        return "Your Prottein Diet is : "+ this.myStringList +" \n" + "Follow the diet and stay fit and healthy ";
       }
       
       
        

    }

     public String setProteinDiet2( meal meal, double amount){
        this.proteinCount = this.proteinCount + amount;
        
        int quantity = (int) meal.howmuchForProtein(amount);

        String S =  meal.getName() +" "+ " Quantity:" + quantity  ;

        
        
       

       if(this.proteinCount<this.person.protienReq()){

          this.myStringList.add(S);


          return "Take " + quantity + " " +  meal.getName()  + "\n" + "The remaining protein requirement is " + (this.person.protienReq() - this.proteinCount) + "grams" + "\n" + "Your protein diet plan is" +this.myStringList ; 

          
       }  
       else {
        return "Your protein diet is "+  this.myStringList +"\n" + "💪 Follow the diet and stay fit and healthy ";
       }
       
        

    }



   
   //-------------------------------------------------------Protein Planner Ends----------------------------------------------------------------//

 




    // --------------------------------------------------------Calorie Planner---------------------------------------------------------//

    public String setCaloriesInDiet( meal meal, double amount){
        this.calorieCount = this.calorieCount + amount;
        
        int quantity = (int) meal.howMuchForCalorie(amount);

        String D = "Take" + " " +  meal.getName() +" " + quantity + "grams" ;

       

        
        
       

         if(this.calorieCount<this.person.BMR()*this.person.getactivityFactor()){
            this.myCarlStringList.add(D);
            return "Take " + quantity +" grams of " +  meal.getName()  +   "The remaining requirement of calories is : " + (this.person.calorieIntake() - this.calorieCount) +  " calories " +   "\n " + "Your calorie Diet plan is" + this.myCarlStringList ; 
         } 
         else {
            return "Your Calorie diet plan is :" + this.myCarlStringList + " \n " + "Follow the diet and stay fit and healthy ";
         }
       


          
       
       


        

    }
      public String setCaloriesInDiet2( meal meal, double amount){
         this.calorieCount = this.calorieCount + amount;
         int quantity = (int) meal.howmuchForCalorie(amount);
         String D = "Take" + " " +  meal.getName() +" " + " Quantity:"+  quantity;

         if(this.calorieCount<this.person.BMR()*this.person.getactivityFactor()){

            this.myCarlStringList.add(D);
            return "Take " + quantity + " " +   meal.getName()  +   " \n "  + "The remaining requirement of calories is : "+ (this.person.calorieIntake() - this.calorieCount) + " calories " +   "\n "  + " Your calorie Diet plan is"+ this.myCarlStringList ; 
         }
         else {
            return "Your Calorie diet plan is :" + this.myCarlStringList + " \n " + "Follow the diet and stay fit and healthy ";
         }  
      }

       

        
        
       

   //-----------------------------------------------------------Carb Planner----------------------------------------------------------------//     
          
           
        
       


        

      
     public String setCarbDiet( meal meal, double amount){
        this.carbCount = this.carbCount + amount;
        int quantity = (int) meal.howMuchForCarb(amount);
        String T = "Take" + " " +  meal.getName() +" " + quantity + " grams" ;

        

        
        
       

       if(this.carbCount<this.person.BMR()*this.person.getactivityFactor()*0.5/4){
         this.myCarbStringList.add(T);
           return "Take " + meal.getName()  + " " + quantity + " grams " + " \n"+ "The ramaining requirement of Carbohydrates in your diet is : " + (this.person.BMR()*this.person.getactivityFactor()*0.5/4 - this.carbCount) + " grams" +" \n"+ "Your Carb diet is "+this.myCarbStringList ; 

         }
       else {
        return "Your carb diet is " + this.myCarbStringList + " \n"+ "Follow the diet and stay fit and healthy ";
       }
          
      
       
       
        

    }
    public String setCarbDiet2( meal meal, double amount){
        this.carbCount = this.carbCount + amount;
        
        int quantity = (int) meal.howmuchForCarb(amount);

        String T = "Take" + " " +  meal.getName() +" " + " Quantity:" +  quantity ;

        
        
       

       if(this.carbCount<this.person.BMR()*this.person.getactivityFactor()*0.5/4){

          this.myCarbStringList.add(T);

          return "Take" + meal.getName() +" "+ quantity + "   The remaining requirement of carbs in your diet is " + (this.person.BMR()*this.person.getactivityFactor()*0.5/4 - this.carbCount) + "grams" + " Your carb diet is : "+this.myCarbStringList ; 
          
       }
       else {
        return " Your carb diet is :" + this.myCarbStringList + " Follow the diet and stay fit and healthy ";
       }
       
       
        

    }

    //-------------------------------------------------------------------Carb planner ends------------------------------------------------//
    
   public String toString(){
      
      return this.myCarbStringList + "\n" + this.myStringList;

   }
    



    




}
