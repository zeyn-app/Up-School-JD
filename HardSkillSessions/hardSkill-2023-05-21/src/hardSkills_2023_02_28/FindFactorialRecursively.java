package hardSkills_2023_02_28;

import java.util.Scanner;

public class FindFactorialRecursively {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir sayı giriniz: ");
		int number = scanner.nextInt();
		
		scanner.close();

		System.out.println(recursiveFactorial(number));

	}

	public static int recursiveFactorial(int number) {
		if (number == 0)
			return 1;

		else {
			return number * recursiveFactorial(number -1);
		}
	}

}
