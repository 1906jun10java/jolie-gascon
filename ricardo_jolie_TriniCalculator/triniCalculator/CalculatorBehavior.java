package triniCalculator;

import java.util.Scanner;

public class CalculatorBehavior extends CalculatorOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, please enter a number to calculate");
		double number1 = sc.nextDouble();
		
		System.out.println("Please enter the other number to calculate");
		double number2 = sc.nextDouble();
		
		
		System.out.println("If you want to add , please press 1");
		System.out.println("If you want to subtract , please press 2");
		System.out.println("If you want to divide , please press 3");
		System.out.println("If you want to multiply , please press 4");
		
		double arithmaticOp = sc.nextDouble();
		
		if (arithmaticOp == 1) {
			System.out.println(" The addition of " + number1+ " and" + number2+ " is " + add(number1, number2));
		}else if (arithmaticOp == 2) {
				System.out.println(" The subtraction of " + number1+ " and" + number2+ " is " +minus(number1, number2));
		}else if (arithmaticOp == 3) {
			System.out.println(" The division of " + number1+ " and" + number2+ " is " +divide(number1, number2));
		}else if (arithmaticOp == 4) {
			System.out.println(" The multiplication of " + number1+ " and" + number2+ " is " +multiply(number1, number2));
		}else {
			System.out.println("You did not enter a valid response");
		}
				
		sc.close();
				
		}
			
		
	}
	
	
