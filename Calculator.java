import java.util.Scanner;
public class Calculator {
	
	static Scanner scanner = new Scanner(System.in);
	private static int first_number;
	private static int second_number;
	
	public Calculator(int first_number, int second_number) {
		this.first_number = first_number;
		this.second_number = second_number;
	}
	
	public static void main (String[] args) {
		action();
	}


	public static void action() {
		do {
			System.out.println("Wybiesz 0 jeśli chcesz dodać \n wybierz 1 jeśli chcesz odjąć"
					+ "\n wybierz 2 jeśli chcesz pomnożyć \n wybierz 3 jeśli chcesz podzielić"
					+ "\n wybierz 4 jeśli chcesz obliczyć resztę z dzielienia "
					+ "\n wybierz 5 jeśli chcesz podnieść do wybranej potęgi ");
			
			int wybor = scanner.nextInt();
			System.out.println("Wpisz pierwszą liczbę ");
			int pierwsza = scanner.nextInt();
			System.out.println("Wpisz drugą liczbę ");
			int druga = scanner.nextInt();
			Calculator obliczanie = new Calculator(pierwsza, druga);
			
			switch(wybor) {
			case 0:
				System.out.println("Wynik dodawania " + first_number + " i " + second_number + " = " + dodawanie(obliczanie));
				break;
			case 1:
				System.out.println("Wynik odejmowania " + first_number + " i " + second_number + " = " + odejmowanie(obliczanie));
				break;
			case 2:
				System.out.println("Wynik mnożenia " + first_number + " przez " + second_number + " = " + mnożenie(obliczanie));
				break;
			case 3:
				System.out.println("Wynik dzielnia " + first_number + " przez " + second_number + " = " + dzielenie(obliczanie));
				break;
			case 4:
				System.out.println("Reszta z dzielenia " + first_number + " przez " + second_number + " = " + resztaZDzielenia(obliczanie));
				break;
			case 5:
				System.out.println("Podniesienie " + first_number + " do " + second_number + " potęgi = " + potega(obliczanie));
				break;
			}
		}while(again());
		
	}

	public static int dodawanie(Calculator obliczanie) {
		return(first_number+second_number);
	}
	public static int odejmowanie(Calculator obliczanie) {
		return(first_number-second_number);
	}
	public static int mnożenie(Calculator obliczanie) {
		return(first_number*second_number);
	}
	public static int dzielenie(Calculator obliczanie) {
		return(first_number/second_number);
	}
	public static int resztaZDzielenia(Calculator obliczanie) {
		return(first_number%second_number);
	}
	public static double potega(Calculator obliczanie) {
		return(Math.pow(first_number, second_number));
	}
	
	public static boolean again() {
		System.out.println("Czy chcesz obliczyć coś jeszcze? (True/False)");
		boolean odpowiedz = scanner.nextBoolean();
		return odpowiedz;
	}

}
