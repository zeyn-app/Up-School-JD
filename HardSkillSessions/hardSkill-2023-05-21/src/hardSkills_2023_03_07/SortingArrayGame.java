package hardSkills_2023_03_07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortingArrayGame {

	public static void main(String[] args) {
		int size = 5;

		System.out.println("Kaç elemanlı bir dizi istiyorsunuz? ");
		size = getNumber();

		int counter = sortArrayByUser(implementArray(generateArray(size)));

		System.out.println("Tebrikler, " + counter + " adımda sıralamayı tamamladınız.");

	}

	public static int sortArrayByUser(int[] arr) {
		int index1, index2, counter = 0;
		int copyArray[] = arr.clone();

		Arrays.sort(copyArray);

		while (!Arrays.equals(copyArray, arr)) {
			print(arr);
			System.out.println("\nHangi elemanlar yer değiştirsin? ");
			System.out.print("index1: ");
			index1 = getNumber();
			System.out.print("index2: ");
			index2 = getNumber();
			arr = swap(arr, index1, index2);
			counter++;
		}
		return counter;
	}

	public static int[] implementArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = generateRandomNumber();
		}
		return arr;
	}

	public static int[] swap(int arr[], int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		return arr;
	}

	public static int[] generateArray(int size) {
		return new int[size];
	}

	public static int generateRandomNumber() {
		return new Random().nextInt(50) + 1;
	}

	public static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	public static void print(int[] arr) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
