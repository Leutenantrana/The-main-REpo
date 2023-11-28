package part11.ErrorHandling;

public class Grade {

    private int grade;
    public Grade(int Grade){
        if (Grade<0||Grade>5) {
            throw new IllegalArgumentException("the agrument is less than 0 or greater than 0");
            
        }
        this.grade = Grade;

    }
    public int getGrade() {
        return this.grade;
    }
    public static void main(String[] args) {
        Grade grade = new Grade(3);
        System.out.println(grade.getGrade());

        Grade illegalGrade = new Grade(22);
        // exception happens, execution will not continue from here
    }
}
