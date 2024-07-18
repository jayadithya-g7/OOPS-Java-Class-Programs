import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        
        System.out.print("Enter the third number: ");
        double number3 = scanner.nextDouble();
        
        // Calculate the average
        double average = (number1 + number2 + number3) / 3;
        
        // Print the average
        System.out.println("The average of " + number1 + ", " + number2 + ", and " + number3 + " is: " + average);
        
        // Close the scanner
        scanner.close();
    }
}
