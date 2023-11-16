package part6;
import java.lang.Math;
import java.util.Scanner;

public class CheckProg {


    public static void main(String[] args) {

        meal meal1 =new meal("chicken", 239, 31, 0);
        meal meal5 =new meal("chickenna", 239, 31, 0);
        System.out.println(meal1.getCalorieIn100Grams());

        // System.out.println(meal1.howMuchForProtein(30) ); 


        //  System.out.println(meal1.howMuchForCalorie(3000));

        //  System.out.println(meal1);

        meal meal2 = new meal("banana", 89, 1.1, 23, 1);

        meal meal3 = new meal("banana", 89, 1.1, 23, 1);

        meal meal4 = new meal("Rajma chawal", 316, 26 , 50.91);

        // System.out.println(meal3.howmuchForProtein(100) + " bananas ");

        // System.out.println(meal1.howmuchnutrients(500));

        // System.out.println(meal3.howMuchnutrients(5));


        Person Arav = new Person("Krish", 16, 175, 58, true, "very active");



        // Scanner scan = new Scanner(System.in);

        // System.out.println("ebter the name of the person ");

        
        Dietplanner proteinPlanner = new Dietplanner(Arav);


        System.out.println(proteinPlanner.setProteinDiet(meal1, 20));

         System.out.println(proteinPlanner.setProteinDiet(meal5, 30));

          System.out.println(proteinPlanner.setProteinDiet2(meal3, 12));

        System.out.println(proteinPlanner.setProteinDiet2(meal3, 12));
        


        System.out.println(" ");

        System.out.println("   " );


        System.out.println(proteinPlanner.setCaloriesInDiet(meal1, 400));

         System.out.println(proteinPlanner.setCaloriesInDiet(meal5, 900));

        System.out.println(proteinPlanner.setCaloriesInDiet2(meal2, 900));
        
         System.out.println(proteinPlanner.setCaloriesInDiet(meal4, 550));

         System.out.println("");


         System.out.println("the carbohydrates planner is");


        System.out.println(proteinPlanner.setCarbDiet(meal4, 90));

        System.out.println(proteinPlanner.setCarbDiet2(meal3, 90));

         System.out.println();

      
        

    }
    
}
