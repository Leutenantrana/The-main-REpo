package flightControl.UI;
import java.util.Scanner;

import flightControl.logic.FlightControl;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightControl f1 = new FlightControl();
        TextUI t1 =new TextUI( f1, scanner);
        t1.start();
    }
}
