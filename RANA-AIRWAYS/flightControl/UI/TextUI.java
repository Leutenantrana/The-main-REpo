package flightControl.UI;
import java.util.Scanner;

import javax.sound.sampled.FloatControl;

import flightControl.domain.Airplane;
import flightControl.domain.Flight;
import flightControl.logic.FlightControl;

public class TextUI {
    
    private FlightControl flightControl;
    private Scanner scanner;

    public TextUI(FlightControl flightcontril, Scanner scanner){
        this.flightControl = flightcontril;
        this.scanner = scanner;

    }

    public void start(){
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();
    }

    public void startAssetControl(){
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String number = scanner.nextLine();
            if (number.equals("1")) {
                addAirplane(scanner);
                
            }else if (number.equals("2")) {
                addFlight(scanner);
            } else if (number.equals("x")) {
                break;
            }
            
        }

    }
    public void addAirplane(Scanner scanner){
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.print("Give the airplane capacity: "); 
        int capacity = Integer.parseInt(scanner.nextLine());

        this.flightControl.addAirplane(id, capacity);
    }
     private void addFlight(Scanner scanner) {
        System.out.print("Give the airplane id: ");
        Airplane airplane = askForAirplane();
        System.out.print("Give the departure airport id: ");
        String departureID = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String destinationID = scanner.nextLine();

        this.flightControl.addFlight(airplane, departureID, destinationID);
    }

    private void startFlightControl(){
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String answer = scanner.nextLine();
            if (answer.equals("1")) {
                printAirplanes();
            } else if (answer.equals("2")) {
                printFlights();
            } else if (answer.equals("3")) {
                printAirplaneDetails();
            } else if (answer.equals("x")) {
                break;
            }
            
        }

    }

    public void printAirplanes(){
        for (Airplane plane : flightControl.getAirplanes()) {
            System.out.println(plane);
        }

    }
    private void printFlights() {
        for (Flight flight : flightControl.getFlights()) {
            System.out.println(flight);
            System.out.println("");
        }
    }
    private void printAirplaneDetails() {
        System.out.print("Give the airplane id: ");
        Airplane plane = askForAirplane();
        System.out.println(plane);
        System.out.println();
    }
    private Airplane askForAirplane() {
        Airplane airplane = null;
        while (airplane == null) {
            String id = scanner.nextLine();
            airplane = flightControl.getAirplane(id);

            if (airplane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }

        return airplane;
    }

    
}
