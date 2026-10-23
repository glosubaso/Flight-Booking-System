package FlightBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Flight> flights = new ArrayList<Flight>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        fillList(flights);

        Passenger passenger = new Passenger();

        System.out.println("WELCOME Dear Customer " + "\n Plan your next trip ");

        mainMenu();

        int selection = input.nextInt();
        input.nextLine(); 

        while (selection != 0) {

            switch (selection) {
                case 1:
                    passenger = registerPassenger(input);
                    break;

                case 2:
                    if (passenger.getName() == null) {
                        System.out.println("Please register the passenger before booking");
                    } else {
                        doBooking(input, flights);
                    }
                    break;

                case 3:
                    viewFlights(flights);
                    break;

              
            }

            System.out.println();
            mainMenu();

            selection = input.nextInt();
            input.nextLine();// ignore new line

        }
    }

    private static void mainMenu() {
        System.out.println("1. Register the passenger");
        System.out.println("2. View flights and booking");
        System.out.println("3. View all flights");
        System.out.println("4. review the GUI of the program:");
        System.out.println("0. Exit");
    }

    private static Passenger registerPassenger(Scanner input) {
        String name = getStringInput(input, "Enter name: ");
        int idNum = getIntInput(input, "Enter ID number: ");
        int passportNum = getIntInput(input, "Enter Passport number: ");
        return new Passenger(name, idNum, passportNum);
    }

    private static String getStringInput(Scanner input, String message) {
        System.out.print(message);
        return input.nextLine();
    }

    private static int getIntInput(Scanner input, String prompt) {
        System.out.print(prompt);
        return input.nextInt();
    }

    private static void doBooking(Scanner input, ArrayList<Flight> flights) {
        try {
            viewFlights(flights);

            System.out.println("Please enter the flight number: ");
            int flightNumber = input.nextInt();

            Flight flight = findFlight(flightNumber, flights);

            if (flight != null) {
                double flightCost = flight.calcFlightCost();
                System.out.println("The cost is " + flightCost);
                System.out.println("Thank you for booking!");
            } else {
                System.out.println("Flight number not found!");
            }
        } catch (Exception e) {
            System.out.println("An error occurred during booking: " + e.getMessage());
        }
    }

    private static Flight findFlight(int flightNumber, ArrayList<Flight> flights) {

        for (int i = 0; i < flights.size(); i++) {

            if (flights.get(i).getFlightNumber() == flightNumber) {
                return flights.get(i);
            }
        }
        return null;
    }

    private static void fillList(ArrayList<Flight> flights) {

        flights.add(new EconomyClass(828, 990.50, "Riyadh International Airport", "Qatar  International Airport", 863,
                null, null, null, true));

        flights.add(new EconomyClass(632, 1110.75, "George Bush Intercontinental Airport",
                "Riyadh International Airport", 320, null, null, null, false));

        flights.add(new BusinessClass(243, 1995.50, "Denver International Airport", "Orlando International Airport",
                100, null, null, null, true));

        flights.add(new BusinessClass(462, 2100.75, "Washington Dulles International Airport",
                "Kuwait International Airport", 320, null, null, null, false));

        flights.add(new FirstClass(110, 3299.99, " Bahrain  International Airport", "Riyadh International Airport", 198,
                null, null, null, false));

        flights.add(new FirstClass(311, 4999.99, "Riyadh International Airport", "Heathrow Airport", 123, null, null,
                null, false));
    }

    private static void viewFlights(ArrayList<Flight> flights) {

        for (int i = 0; i < flights.size(); i++) {
            System.out.println(flights.get(i));
            System.out.println();
        }
    }

}
















