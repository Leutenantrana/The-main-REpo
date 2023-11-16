// package part6.part6b.part6.part6.b.gradeConverter;
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         GradeRegister register = new GradeRegister();
//         while (true) {
//             System.out.println("enter your score");

//             String Score = scanner.nextLine();
//             if (Score.isEmpty()) {
//                 break;
                
//             }

//             int input = Integer.valueOf(Score);

//             if (input<0||input>100) {
//                 System.out.println("impossible value");

//                 continue;

                
//             }

//             register.addGradeBasedOnPoints(input);
            
//         }

//         System.out.println(" ");

//         int grade =5;
//         while (grade>0) {
//             int stars = register.numberOfGrades(grade);

//             System.out.println(grade + " :");
//             while (stars>0) {
//                 System.out.print("*");
//                 stars = stars-1;
                
//             }

//             System.out.println(" ");

//             grade = grade -1;
            
//         }
//     }

    
// }
