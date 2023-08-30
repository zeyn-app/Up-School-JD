package hardSkills_2023_02_28;

import java.util.Scanner;

public class FindAverageOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		double result = 0;
		
		
		for(int i=1; i<=5; i++) {
			System.out.print(i + ". sayıyı giriniz: ");
			number = scanner.nextInt();
			result += number;
		}
		
		scanner.close();
		
		result /= 5;
		System.out.println("Result: " + result);

	}

}
