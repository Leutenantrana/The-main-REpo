package part6;

import part4.person;
import part4.song;

import java.util.ArrayList;
import java.util.Scanner;


public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
            Person Arav = new Person("Krish", 16, 175, 58, true, "very active");
            persons.add(Arav);


        while (true) {
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
            String activityLevel = scan.nextLine();

            persons.add(new Person(name, age, height, weight, isMale, activityLevel));

            System.out.println("Do you want to enter another person? (yes/no)");
            String continueInput = scan.nextLine().toLowerCase();
            if (continueInput.equals("no")) {
                break;
            }
        }
       

        for (Person person : persons) {

        

            System.out.println(person);

           
            // person.BMR();
            System.out.println("The calorie requirement of the person is " + person.calorieIntake() + " calories");
            System.out.println("The total amount of protein in grams is " + person.protienReq() + " grams");
            System.out.println("The total amount of fat required in grams is " + person.fatIntake() + " grams");
        }

       
       


        
       


      



      

      
        // Person Arav = new Person("Krish", 16, 175, 58, true, "very active");


        

        // System.out.println( Arav);

        // Arav.BMR();
        // System.out.println("the calorie requirement of the person is " + Arav.calorieIntake()+ " calories");
        // System.out.println(" the total amount of protien in grams is "+ Arav.protienReq() + " grams");
        // System.out.println("the total amount of fat required in grams is " + Arav.fatIntake() + " grams");
    }
    
}
