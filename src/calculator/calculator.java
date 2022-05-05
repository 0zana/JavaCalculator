package calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		do {
			Scanner action = new Scanner(System.in);
			System.out.println("Type 1 if you want to multiply, 2 to divide, 3 to power");
			
			int choice = action.nextInt();
			switch (choice) {
			case 1:
				multiply(number1(), number2());
				break;
			case 2:
				divide(number1(), number2());
				break;
			case 3:
				power(number1(), number2());
		}
		
		
		}while(doYou());
}
	public static int number1() {
		Scanner number = new Scanner(System.in);
		System.out.println("type first number ");
		int first = number.nextInt();
		return (first);
	}
	public static int number2() {
		Scanner number = new Scanner(System.in);
		System.out.println("type second number ");
		int second = number.nextInt();
		return (second);
	}
	public static void multiply(int num1, int num2) {
		System.out.println("Multiply!");
		System.out.println("The result is = " + num1*num2 );
		
	}
	public static void divide(int num1, int num2) {
		System.out.println("Divide!");
		System.out.println("The result is = " + num1/num2);
		
	}
	public static void power(int num1, int num2) {
		System.out.println("Raise to a power!");
		System.out.println("The result is = " + Math.pow(num1, num2));
	}
	public static boolean doYou() {
		boolean answer;
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to play again? (true/false)");
		answer = sc.nextBoolean();
		if (answer==true) {
			return(true);
		} else {
			return (false);
		}
	}
}