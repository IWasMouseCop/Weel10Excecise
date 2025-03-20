import java.util.Scanner;

/**
 * Program: Vehicle Manager
 * Description: Human powered displays the type of vehicle (cycles)
 * Date: 3/20/25
 * @author Kyle Vardy
 */
public class Main {
    private static final Scanner INPUT = new Scanner(System.in);

    /**
     * Main constructor
     */
    public Main() {
        boolean running = true;
        while (running) {
            int wheels = collectInt("How many wheels does your vehicle have:");
            Vehicle vehicle = new Vehicle();

            try {
                vehicle.setName(wheels);
                running = false;
            } catch (WheelException e) {
                System.out.println(e.getMessage());
            }

            System.out.printf("You're vehicle is a %s!\n", vehicle.getName());
        }
    }

    /**
     * Main function
     * @param args args passed when program starts
     */
    public static void main(String[] args) {
        new Main();
    }

    /**
            * Collects a double from the user
     * @param prompt Prompt to ask the user
     * @return returns a double the user input
     */
    public static int collectInt(String prompt) {
        boolean invalidInput = true;
        int toReturn = 0;

        while (invalidInput) {
            // Print the prompt with no new line
            System.out.print(prompt + " ");
            if (INPUT.hasNextInt()) {
                // Collect the absolute value of the users input and set it to be returned
                toReturn = Math.abs(INPUT.nextInt());
                invalidInput = false;
            } else {
                // Collect the users bad input
                String badInput = INPUT.nextLine();
                // Show the user their bad input
                System.out.println(badInput + " is not a number.");
            }
        }

        // Return the input
        return toReturn;
    }
}
