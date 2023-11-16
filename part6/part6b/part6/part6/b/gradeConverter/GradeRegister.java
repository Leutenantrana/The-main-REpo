package part6.part6b.part6.part6.b.gradeConverter;
import java.util.ArrayList;
public class GradeRegister {

    private ArrayList<Integer> grades;

    public GradeRegister(){
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points){
        this.grades.add(pointsToGrade(points));

    }

    public static int pointsToGrade (int points){
        int grade =0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;

      
    }

    public int numberOfGrades( int grade){
        int count =0;
        for(int recieved: grades){
            if (recieved ==grade) {
                count++;
                
            }
        }

        return count;
    }
    
}
