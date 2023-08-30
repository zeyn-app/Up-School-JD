package hardSkills_2023_02_28;

import java.util.Scanner;

public class FindGreatestNumber {

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
		System.out.println("The greatest number is " + greatestNumber);
	}

}
