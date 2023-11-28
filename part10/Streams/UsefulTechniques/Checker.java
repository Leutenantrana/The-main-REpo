package part10.Streams.UsefulTechniques;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import java.util.Scanner;

public class Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage of isDayOfWeek method
        System.out.print("Enter a string: ");
        String dayOfWeekInput = scanner.nextLine();
        if (isDayOfWeek(dayOfWeekInput)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }

        // Example usage of allVowels method
        System.out.print("Enter a string: ");
        String allVowelsInput = scanner.nextLine();
        if (allVowels(allVowelsInput)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }

        // Example usage of timeOfDay method
        System.out.print("Enter a string: ");
        String timeOfDayInput = scanner.nextLine();
        if (timeOfDay(timeOfDayInput)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
    public static boolean isDayOfWeek(String string) {
        String regex = "^(mon|tue|wed|thu|fri|sat|sun)$";
        return string.matches(regex);
    }

    // Method to check if all characters in the string are vowels
    public static boolean allVowels(String string) {
        String regex = "^[aeiouAEIOU]+$";
        return string.matches(regex);
    }

    // Method to check if the string represents a time of day in the format hh:mm:ss
    public static boolean timeOfDay(String string) {
        String regex = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$";
        return string.matches(regex);
    }
}
