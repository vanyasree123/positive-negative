import java.util.Scanner;
public class Pon {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for base and exponent
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        
        // Calculate the power using Math.pow()
        double result = Math.pow(base, exponent);
        
        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
        
        // Close the scanner
        scanner.close();
    }
}
