package part6.part6b.part6.part6.b.gradeConverterBasic;
import java.util.Scanner;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter your grade");
            String number = String.valueOf(scanner.nextLine());


            if (number.isEmpty()) {
                break;
                
            }
           
            int Number = Integer.valueOf(number);

             if (Number<0 || Number>100) {
                System.out.println("Impossible value");
                
            }

            int grade = 0;

            if(Number<50){
                grade = 0;
            }
            else if (Number<60) {
                grade = 1;
                
            }
            else if (Number<70) {
                grade = 2;
                
            }
            else if(Number<80){
                grade =3;

            }else if (Number<90) {
                grade = 4;
                
            }else{
                grade =5;
            }

            grades.add(grade);
            
        }

        System.out.println(" ");

        int grade = 5;
        while (grade>=0) {
            int stars = 0;
            for(int recieved : grades){
                if (recieved == grade) {
                    stars++;
                    
                }
            }

            System.out.print(grade + " :");
            while (stars>0) {
                System.out.print("*");
                stars--;
                
            }
            System.out.println(" ");

            grade = grade -1;

            
        }
    }
    
}
