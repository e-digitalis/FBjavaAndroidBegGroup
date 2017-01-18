package beginnerTasks;

import java.util.Scanner;

public class LotteryNumberGenerator {
	static int desiredNumberAmount;
	static int lowRange;
	static int topRange;

	public static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		UserInputNumber uin = new UserInputNumber();
		uin.userInputAmountOfNumbers();

		UserInputLowRange uilr = new UserInputLowRange();
		uilr.userInputLowRange();

		UserInputTopRange uitr = new UserInputTopRange();
		uitr.userInputTopRange();

		GenerateRandomNumbers grn = new GenerateRandomNumbers();
		for (int counter = 0; counter < LotteryNumberGenerator.desiredNumberAmount; counter++) {
			System.out.println(grn.randomWithRange(LotteryNumberGenerator.lowRange, LotteryNumberGenerator.topRange));
		}

		myScanner.close();
		
	} // end of main

} // end of class

class UserInputNumber {
	public int userInputAmountOfNumbers() {
		System.out.println("How many numbers do you want to generate?");
		int input = LotteryNumberGenerator.myScanner.nextInt();
		LotteryNumberGenerator.desiredNumberAmount = input;
		return input;
	}
}

class UserInputLowRange {
	public int userInputLowRange() {
		System.out.println("Please write the low end of the range you wish to generate:");
		int input = LotteryNumberGenerator.myScanner.nextInt();
		LotteryNumberGenerator.lowRange = input;
		return input;
	}
}

class UserInputTopRange {
	public int userInputTopRange() {
		System.out.println("Please write the high end of the range you wish to generate:");
		int input = LotteryNumberGenerator.myScanner.nextInt();
		LotteryNumberGenerator.topRange = input;
		return input;
	}
}

class GenerateRandomNumbers {
	int randomWithRange(int min, int max) {
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}
}

// #CodeTask // Good one for beginners.
// Create a lottery number generator program/app.
// It must allow the user to input how many numbers are to be generated, and the
// range of the numbers, then the program/app will generate random numbers
// between the specified range, for the amount of numbers selected.
// For example, input:
// Amount: 5
// Range: 1 - 59
// Possible output,
// 5, 31,42,56,57.
// You must present the output in ascending numerical order.