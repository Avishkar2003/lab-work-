package avishkar;
import java.util.*;

// Define a class 'homeloan' that implements the 'loancalculator' interface
public class homeloan implements loancalculator {

	// Declare instance variables
	public double princiamt, loanamt, roi = 8.5;
	int years;
	Scanner sc = new Scanner(System.in);

	// Implementing the method declared in the 'loancalculator' interface to display principle amount
	@Override
	public void displayprinciamt() {
		// Prompt user to enter principle amount
		System.out.println("enter principle amount");
		// Read and store the principle amount
		princiamt = sc.nextDouble();
		// Prompt user to enter the number of years
		System.out.println("enter the number of years");
		// Read and store the number of years
		years = sc.nextInt();
	}

	// Implementing the method declared in the 'loancalculator' interface to calculate loan amount
	@Override
	public void calculate() {
		// Calculate loan amount using the formula: (principle * years * rate of interest) / 100
		loanamt = (princiamt * years * (8.5)) / 100;
		// Display the calculated interest for the specified years
		System.out.println("your interest for said years are:" + loanamt);
	}

	// Main method
	public static void main(String[] args) {
		// Create an object of the 'homeloan' class
		homeloan obj = new homeloan();
		// Call the method to display principle amount
		obj.displayprinciamt();
		// Call the method to calculate loan amount
		obj.calculate();
	}
}
