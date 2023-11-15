package part6;
import java.util.Scanner;
import java.util.ArrayList;

public class meal {

    String mealName ;
    double caloriesIn100Grams;
    double proteinIn100Gram;
    double fatIn100Grams;
    double carbsIn100Grams;
    

    double calorieIn1meal;
    double proteinIn1meal;
    double fatIn1meal;
    double carbIn1meal;
    int number;

    public meal (String name,  double caloriesIn100Grams,  double proteinIn100Gram, double carbsIn100Grams ){
        this.mealName = name;
        this.caloriesIn100Grams =caloriesIn100Grams;
        this.proteinIn100Gram = proteinIn100Gram;
        this.carbsIn100Grams =carbsIn100Grams;
    }

    public meal ( String name, double calorieIn1meal,double proteinIn1meal, double carbIn1meal,int number ){
        this.mealName = name;
        this.calorieIn1meal = calorieIn1meal;
        this.proteinIn1meal = proteinIn1meal;
        this.carbIn1meal = carbIn1meal;
        this.number =number;
        

    }
    public String getName(){
        return this.mealName;
    } 
    public double getProteinIn100Grams(){
        return this.proteinIn100Gram;
    }
    public double getFatIn100Grams(){
        return this.fatIn100Grams;
    }
    public double getCalorieIn100Grams(){
        return this.caloriesIn100Grams;

    }
    public double getProteinIn1Meal(){
        return this.proteinIn1meal;
    }
     public double getFatIn1Meal(){
        return this.fatIn1meal;
    }
     public double getCalorieIn1Meal(){
        return this.calorieIn1meal;
    }
   

    public double howMuchForProtein(double proteinReq){
        double protein = (100/this.proteinIn100Gram)* proteinReq;
        
        return protein;
    }

    public double howMuchForCalorie(double calorieReq){
        double mealIntake = (100.0/this.caloriesIn100Grams) * calorieReq;

        return mealIntake;
    }
    public double howMuchForFat( double fatReq){
        double fatIntake = (100/this.fatIn100Grams)*fatReq;
        return fatIntake;
    }
    public double howMuchForCarb( double carbReq){
        double carbIntake = (100/this.carbsIn100Grams)*carbReq;
        return carbIntake;
    }



    public double howmuchForProtein(double proteinReq){
        double protein = (1/this.proteinIn1meal)* proteinReq;
        
        return protein;
    }

    public double howmuchForCalorie(double calorieReq){
        double mealIntake = (1/this.calorieIn1meal) * calorieReq;

        return mealIntake;
    }
    public double howmuchForFat( double fatReq){
        double fatIntake = (1/this.fatIn1meal)*fatReq;
        return fatIntake;
    }

    public double howmuchForCarb( double carbReq){
        double carbIntake = (1/this.carbIn1meal)*carbReq;
        return carbIntake;
    }



    // how much in a given quantity?

    // ********************************************************************

    public String howmuchnutrients(double quantity ){
        return quantity + " grams of " + this.mealName + " contains " + (this.caloriesIn100Grams/100)*quantity + " calories "+ "," + (this.proteinIn100Gram/100)*quantity + " grams od protein " + (this.fatIn100Grams/100)*quantity + " grams of fat. "; 
    }

    public String howMuchnutrients(double quantity ){
        return quantity + " grams of " + this.mealName + " contains " + (this.calorieIn1meal)*quantity + " calories "+ "," + (this.proteinIn1meal)*quantity + " grams od protein " + (this.fatIn1meal)*quantity + " grams of fat. "; 
    }






    public String toString(){
        return this.mealName + " has " + this.caloriesIn100Grams + " caloreis " + this.carbsIn100Grams + " carbs "+  this.proteinIn100Gram + " protein in 100 grams of the meal."; 
    }



    
}
