package jd2_Homework_03;

import java.util.Arrays;
import java.util.Scanner;

public class Prediction {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("How many users will play: ");
		int userCount = scanner.nextInt();

		System.out.print("How many rounds will play: ");
		int gameCount = scanner.nextInt();

		printLeaderBoard(getPrediction(userCount, gameCount));
	}

	public static int generateRandomNumber() {
		return (int) (Math.random() * 100) + 1;
	}

	public static int[] getPrediction(int userCount, int gameCount) {
		int predictedNumber, randomNumber;

		// Calculate the prediction of user each round.
		int[] userPredictionCount = new int[userCount];
		Arrays.fill(userPredictionCount, 1);

		// Store the score of users
		int[] userScore = new int[userCount];
		Arrays.fill(userScore, 0);

		Scanner scanner = new Scanner(System.in);
		randomNumber = generateRandomNumber();

		while (gameCount > 0) {
			for (int i = 0; i < userCount; i++) {

				System.out.print((i + 1) + ". user, please enter your prediction: ");
				predictedNumber = scanner.nextInt();

				if (predictedNumber == randomNumber) {
					gameCount--;
					userScore[i]++;

					System.out.println("\nThe right number is " + randomNumber);
					System.out.println((i + 1) + ". user found it on --> " + userPredictionCount[i] + ". try\n\n");

					randomNumber = generateRandomNumber();
					Arrays.fill(userPredictionCount, 1);
					break;
				} else if (predictedNumber > randomNumber) {
					System.out.println("Too high, try again");
				} else {
					System.out.println("Too low, try again");
				}
				userPredictionCount[i]++;
			}
		}

		System.out.println("********** GAME OVER **********");

		scanner.close();
		return userScore;
	}

	public static void printLeaderBoard(int[] users) {

		System.out.println("\n\n********** LEADER BOARD **********\n");

		for (int i = 0; i < users.length; i++) {
			System.out.println("The score of " + (i + 1) + ". user --> " + users[i]);
		}

	}
}
