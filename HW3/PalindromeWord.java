package jd2_Homework_03;

import java.util.Scanner;

public class PalindromeWord {

	public static void main(String[] args) {

		System.out.print("Enter the word/sentence: ");
		String word = getWord();

		printReverseWord(word);
		printIsPandrome(word);
	}

	public static boolean ispalindrome(String word, String reverseWord) {
		return (word.equals(reverseWord));
	}

	public static String reverseWord(String word) {
		String reverseWord = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			reverseWord += word.charAt(i);
		}
		return reverseWord;
	}

	public static String upperCase(String word) {
		return word.toUpperCase();
	}

	public static String removeSpace(String word) {
		return word.replaceAll("\\s", "");
	}

	public static String getWord() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public static void printReverseWord(String word) {
		String reverseWord = reverseWord(word);
		System.out.println("\nReverse of the \n" + word + " --> " + reverseWord + " \n");
	}

	public static void printIsPandrome(String word) {
		String reverseWord = reverseWord(word);

		if (ispalindrome(removeSpace(upperCase(word)), removeSpace(upperCase(reverseWord))))
			System.out.println("\" " + word + " \" is a palindrome word.");

		else
			System.out.println("\" " + word + " \" is not a palindrome word.");
	}

}
