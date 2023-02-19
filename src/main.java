import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a temperature in Celsius
        System.out.print("Enter a temperature in Celsius: ");
        
        // Read the temperature input from the user
        double celsius = input.nextDouble();
        
        // Check if the input is valid
        if (celsius < -273.15) {
            System.out.println("Invalid temperature input.");
        } else {
            // Convert Celsius to Fahrenheit
            double fahrenheit = (celsius * 9 / 5) + 32;
            
            // Output the equivalent temperature in Fahrenheit
            System.out.println("The equivalent temperature in Fahrenheit is: " + fahrenheit);
        }
    }
}
