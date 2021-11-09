package com.scanner.example;

import java.util.Scanner;

public class ScanCalc {

	
	public static void ScanRun() {
		boolean isInPlay = true;
		boolean carryOn = true;
		Scanner input = new Scanner(System.in);
		int mathsChoice;
		double num1;
		double num2;
		Calculations calc = new Calculations();

		while (isInPlay) {
			System.out.println("\t Hello. Welcome to the calculator. Firstly, what is your name?");
			String name = input.nextLine();
			System.out.println("\t " + name + ", prepare to do some maths!");
			System.out.println("-".repeat(80));
			System.out.println("\t Type the number for the operation you would like to do?");
			System.out.println("\t 1) Addition");
			System.out.println("\t 2) Subtraction");
			System.out.println("\t 3) Multiplication");
			System.out.println("\t 4) Division");
			mathsChoice = input.nextInt();
			input.nextLine();

			switch (mathsChoice) {
			case 1:
				System.out.println("-".repeat(80));
				System.out.println("You have chosen Addition");
				System.out.println("Enter your first number");
				num1 = input.nextDouble();
				input.nextLine();
				System.out.println("Enter the number you would like to add to this");
				num2 = input.nextDouble();
				input.nextLine();
				System.out.println("The sum of your numbers is... " + (calc.addition(num1, num2)));
				System.out.println("-".repeat(80));
				while(carryOn) {
					System.out.println("Would you like to continue?");
					String keepGoing = input.nextLine();
					if (keepGoing.contains("y")) {
						break;
					} else {
						isInPlay = false;
					}
					System.out.println("Thank you for the maths!");
					break;
				}

				break;

			case 2:
				System.out.println("-".repeat(80));
				System.out.println("You have chosen Subtraction");
				System.out.println("Enter your first number");
				num1 = input.nextDouble();
				input.nextLine();
				System.out.println("Enter the number you would like to subtract from this");
				num2 = input.nextDouble();
				input.nextLine();
				System.out.println("Your new number is " + calc.subtract(num1, num2));
				System.out.println("-".repeat(80));
				while(carryOn) {
					System.out.println("Would you like to continue?");
					String keepGoing = input.nextLine();
					if (keepGoing.contains("y")) {
						break;
					} else {
						isInPlay = false;
					}
					System.out.println("Thank you for the maths!");
					break;
				}

				break;
				
			case 3:
				System.out.println("-".repeat(80));
				System.out.println("You have chosen Multiplication");
				System.out.println("Enter your first number");
				num1 = input.nextDouble();
				input.nextLine();
				System.out.println("Enter the number you would like to multiply your first number by");
				num2 = input.nextDouble();
				input.nextLine();
				System.out.println("Your new number is " + calc.multiply(num1, num2));
				System.out.println("-".repeat(80));
				while(carryOn) {
					System.out.println("Would you like to continue?");
					String keepGoing = input.nextLine();
					if (keepGoing.contains("y")) {
						break;
					} else {
						isInPlay = false;
					}
					System.out.println("Thank you for the maths!");
					break;
				}

				break;
				
			case 4:
				System.out.println("-".repeat(80));
				System.out.println("You have chosen Division");
				System.out.println("Enter your first number");
				num1 = input.nextDouble();
				input.nextLine();
				System.out.println("Enter the number you would like to divide by");
				num2 = input.nextDouble();
				input.nextLine();
				System.out.println("Your new number is " + calc.divide(num1, num2));
				System.out.println("-".repeat(80));
				while(carryOn) {
					System.out.println("Would you like to continue?");
					String keepGoing = input.nextLine();
					if (keepGoing.contains("y")) {
						break;
					} else {
						isInPlay = false;
					}
					System.out.println("Thank you for the maths!");
					break;
				}

				break;
			}
		}
		input.close();
	}

}
