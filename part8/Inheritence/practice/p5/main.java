package part8.Inheritence.practice.p5;

import java.util.Scanner;

import part8.Inheritence.practice.p1.teacher;

public class main {

    public static void main(String[] args) {
       


        UserInterface u1  = new UserInterface(new Scanner(System.in));

        Student sagar =new Student("sagar", "Bairagana Mandal");

        u1.addmembers(new Student("aarav", "sans Fransisco New Jersey"));

        u1.addmembers(new Student("sadhana", "Washington United States"));
        u1.addmembers(new Teacher("null", "null", 10000));

        u1.start();

        


            
    }
    
}
