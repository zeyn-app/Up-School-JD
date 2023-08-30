package hardSkills_2023_02_28;

import java.util.Scanner;

public class SumOfFactorials {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number, result = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + ". sayıyı giriniz: ");
			number = scanner.nextInt();
			result += factorial(number);
		}

		scanner.close();
		System.out.println("Result: " + result);

	}

	public static int factorial(int number) {
		int result = 1;

		if(number <= 0) return 1;

		else{
			for (int i = 1; i <= number; i++) {
				result *= i;
			}
		}
		return result;
	}
}
