package hardSkills_2023_02_28;

import java.util.Scanner;

public class GreatestFactorial {

	public static void main(String[] args) {
		int number, greatestNumber;

		Scanner scanner = new Scanner(System.in);
		
		greatestNumber = Integer.MIN_VALUE;

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + ". sayıyı giriniz: ");
			number = scanner.nextInt();
			if (number > greatestNumber)
				greatestNumber = number;
		}
		scanner.close();
		
		System.out.println("The greatest number is " + factorial(greatestNumber));

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
