import java.util.Scanner;

public class IT24103762Lab3Q1A{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// Prompt the user to enter the price of 1kg of rice 
System.out.print("Enter the price of 1kg of rice: "); 
double pricePerKg = scanner.nextDouble();

// Prompt the user to enter the number of kilograms they want to buy
System.out.print("Enter the number of kilograms you want to buy: ");
double kilograms = scanner.nextDouble();

// Calcute  the total amount to be paid
double totalAmount = pricePerKg * kilograms;

// Display the total amount
        System.out.printf("The total amount you have to pay is: %.2f\n", totalAmount);

scanner.close();
    }
}
