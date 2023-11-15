package part6;

import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class dietmaker {

    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);

        System.out.println("Write the name of the person");
        String name = scan.nextLine();

        System.out.println("Enter the age of the person");
        int age = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the height of the person");
        int height = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the weight of the person");
        int weight = Integer.valueOf(scan.nextLine());

        System.out.println("Enter true for male and false for female");
        boolean isMale = Boolean.parseBoolean(scan.nextLine());



        System.out.println("Enter the activity level of the person");
        System.out.println( "For activity level write : ");
        System.out.println( " ---sedentary--- " +" (little or no exercise, desk job) ");
        System.out.println( " ---lightly active--- " + " (light exercise/ sports 1-3 days/week)  ");
        System.out.println( " ---moderately active--- " + " (hard exercise every day, or exercising 2 xs/day)  ");

        System.out.println( " ---very active--- " + " (moderate exercise/ sports 6-7 days/week)  ");
        System.out.println( " ---extra active--- " + " (hard exercise 2 or more times per day, or training for marathon, or triathlon, etc.) ");


        String activityLevel = scan.nextLine();


        Person person = new Person(name, age, height, weight, isMale, activityLevel);

        System.out.println(person);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("the protein requirement of the person is " + person.protienReq() + " grams ");



        System.out.println("Let's first set our carbs diet");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
      



        // ______________________________________________________________________________________


        System.out.println("your carb requirement is " + person.getCarbsReq() + " grams" );

        meal meal1 = new meal("sweet potato", 80, 2, 21);
        meal meal2 = new meal("corn", 99, 3.27, 20);
        meal meal3 = new meal("Brown Rice", 112, 2.3, 24);
        meal meal4 = new meal("Oats", 374, 17, 66);
        meal meal5 = new meal("Banana", 51, 0.6, 11.6);
        meal meal6 = new meal("Applre", 51, 0.6, 11.6);
        meal meal7 = new meal("kidney Beans", 127, 8.67, 22.8);
        meal meal8 = new meal("Lentrils", 116, 9.02, 20.8);



        System.out.println();


        meal meal9 = new meal("Milk", 50, 3.29, 4.71);
        meal meal10 = new meal("Chicken", 165, 31, 0);
        meal meal11 = new meal("egg", 74, 24.08, 0.2);
        meal meal12= new meal("Paneer", 265, 18.3, 1.2);
        meal meal13= new meal("Tofu", 76, 17, 3);
        meal meal14 = new meal("Peanut Butter", 22.5, 22, 0);
        meal meal15 = new meal("Fish", 116, 20, 0);
        meal meal16 = new meal("Chickpea",378, 20.47, 0);
        meal meal17 = new meal("Almond",579, 21.15, 21.55);

















       

        System.out.println("Do you want to know the various diets and their nutrient content?? (press y for yes and n for no)");
        String S = String.valueOf(scan.nextLine());
        System.out.println(" ");
        System.out.println(" ");

        if (S.equals("y")) {
             System.out.println("The carb intensive meals and their contents are as follow");

                System.out.println( " meal1 : " + meal1);
                System.out.println(" ");

                System.out.println( " meal2 : " +meal2);
                System.out.println(" ");

                System.out.println(" meal3 : " +meal3);
                System.out.println(" ");
                System.out.println(" meal4 : " +meal4);
                System.out.println(" ");
                System.out.println(" meal5 : " +meal5);
                System.out.println(" ");

                System.out.println(" meal6 : " +meal6);
                System.out.println(" ");
                System.out.println(" meal7 : " +meal7);
                System.out.println(" ");
                System.out.println(" meal8 : " +meal8);

             


            
        }else {
            System.out.println( "you choose no");
        }


        // _________________________________________________________________________________________________________________
        Dietplanner CarbPlanner = new Dietplanner(person);
        // __________________________________________________________________________________________________________________


        System.out.println("enter your first meal");
        int num = Integer.valueOf(scan.nextLine());

        ArrayList<meal> meall = new ArrayList<>();

        meall.add(meal1);
        meall.add(meal2);
        meall.add(meal3);
        meall.add(meal4);
        meall.add(meal5);
        meall.add(meal6);
        meall.add(meal7);
        meall.add(meal9);
        meall.add(meal10);
        meall.add(meal11);
        meall.add(meal12);
        meall.add(meal13);
        meall.add(meal14);
        meall.add(meal15);
        meall.add(meal16);
        meall.add(meal17);

        


        meal demo = new meal(" ",0 , 0, 0);
        
        if (num == 1) {
           demo =meal1;
            
        }else if (num == 2) {
           demo  =meal2;
            
        }else if (num == 3) {
           demo  =meal3;
            
        }else if (num == 4) {
           demo  =meal4;
            
        }else if (num == 5) {
           demo  =meal5;
            
        }else if (num == 6) {
           demo  =meal6;
            
        }else if (num == 7) {
           demo  =meal7;
            
        }else {
           demo = meal8;
        }

       





        System.out.println(" ");
        System.out.println("Enter the amount of meal that you want to take according to your needs (eg for 5 grams enter 5.0 )" + "\n" + " check above the required card and the carb in various meal and then decide your amount");
        double amount = Double.parseDouble(scan.nextLine());


        // _________________________________________________________________________________________________________________

       System.out.println(CarbPlanner.setCarbDiet(demo, amount)); 

       //    _________________________________________________________________________________________________________________
        System.out.println(" ");
        System.out.println("enter your second meal");
        int num2 = Integer.valueOf(scan.nextLine());

        

        for(int i =0; i<8; i++){
            if (num2 ==i+1){
                demo = meall.get(i);
            }
        }

        System.out.println(" ");
        System.out.println("Enter the amount of meal that you want to take according to your needs (eg for 5 grams enter 5.0 )" + "\n" + " check above the required card and the carb in various meal and then decide your amount");
        double amount1 = Double.parseDouble(scan.nextLine());

        System.out.println(CarbPlanner.setCarbDiet(demo, amount1)); 

        System.out.println(" ");


        // _______________________________________________________________________________________________________________________

       
            

                
                if (CarbPlanner.getCarbCount()<person.getCarbsReq()) {
                    System.out.println(" ");
                    System.out.println("enter your meal");
                    int num3 = Integer.valueOf(scan.nextLine());

                    

                    for(int i =0; i<8; i++){
                        if (num3 ==i+1){
                            demo = meall.get(i);
                        }
                    }

                    System.out.println(" ");
                    System.out.println("Enter the amount of meal that you want to take according to your needs (eg for 5 grams enter 5.0 )" + "\n" + " check above the required card and the carb in various meal and then decide your amount");
                    double amount2 = Double.parseDouble(scan.nextLine());

                    System.out.println(CarbPlanner.setCarbDiet(demo, amount2)); 

                    System.out.println(" ");


            
                }
                if (CarbPlanner.getCarbCount()<person.getCarbsReq()) {
                    System.out.println(" ");
                    System.out.println("enter your meal");
                    int num4 = Integer.valueOf(scan.nextLine());

                    

                    for(int i =0; i<8; i++){
                        if (num4 ==i+1){
                            demo = meall.get(i);
                        }
                    }

                    System.out.println(" ");
                    System.out.println("Enter the amount of meal that you want to take according to your needs (eg for 5 grams enter 5.0 )" + "\n" + " check above the required card and the carb in various meal and then decide your amount");
                    double amount3 = Double.parseDouble(scan.nextLine());

                    System.out.println(CarbPlanner.setCarbDiet(demo, amount3)); 

                    System.out.println(" ");


            
                }
                 
                 

            
                




            System.out.println("let's now create your protein diet");
            
            System.out.println("  ");

            System.out.println(" ");

            //______________________________________________________________________________________________________________________________

             Dietplanner proteinPlanner = new Dietplanner(person);
            //____________________________________________________________________________________________________________________________

                System.out.println(" ");
                System.out.println("enter your first meal");
                int number1 = Integer.valueOf(scan.nextLine());

                

                for(int i =0; i<18; i++){
                    if (number1 ==i+1){
                        demo = meall.get(i);
                    }
                }

                System.out.println(" ");
                System.out.println("Enter the amount of meal that you want to take according to your needs (eg for 5 grams enter 5.0 )" + "\n" + " check above the required card and the carb in various meal and then decide your amount");
                double quantity1 = Double.parseDouble(scan.nextLine());

                System.out.println(proteinPlanner.setProteinDiet(demo, quantity1)); 

                System.out.println(" ");



            //______________________________________________________________________________________________________________________________________

                System.out.println(" ");
                System.out.println("enter your meal");
                int number2 = Integer.valueOf(scan.nextLine());

                

                for(int i =0; i<18; i++){
                    if (number2 ==i+1){
                        demo = meall.get(i);
                    }
                }

                System.out.println(" ");
                System.out.println("Enter the amount of meal that you want to take according to your needs (eg for 5 grams enter 5.0 )" + "\n" + " check above the required card and the carb in various meal and then decide your amount");
                double quantity2 = Double.parseDouble(scan.nextLine());

                System.out.println(proteinPlanner.setProteinDiet(demo, quantity2)); 

                System.out.println(" ");

            //_____________________________________________________________________________________________________________________________________
            
            
             System.out.println(" ");
                System.out.println("enter your meal");
                int number3 = Integer.valueOf(scan.nextLine());

                

                for(int i =0; i<17; i++){
                    if (number3 ==i+1){
                        demo = meall.get(i);
                    }
                }

                System.out.println(" ");
                System.out.println("Enter the amount of meal that you want to take according to your needs (eg for 5 grams enter 5.0 )" + "\n" + " check above the required card and the carb in various meal and then decide your amount");
                double quantity3= Double.parseDouble(scan.nextLine());

                System.out.println(proteinPlanner.setProteinDiet(demo, quantity3)); 

                System.out.println(" ");


            //__________________________________________________________________________________________________________________________________

                 System.out.println(" ");
                System.out.println("enter your meal");
                int number4 = Integer.valueOf(scan.nextLine());

                

                for(int i =0; i<18; i++){
                    if (number4 ==i+1){
                        demo = meall.get(i);
                    }
                }

                System.out.println(" ");
                System.out.println("Enter the amount of meal that you want to take according to your needs (eg for 5 grams enter 5.0 )" + "\n" + " check above the required card and the carb in various meal and then decide your amount");
                double quantity4 = Double.parseDouble(scan.nextLine());

                System.out.println(proteinPlanner.setProteinDiet(demo, quantity4)); 

                System.out.println(" ");
                


                
                
            
           



    


       
      
            

       






        //_____________________________________________________________________________________________________________





        


       




      





     



    }




    
}
