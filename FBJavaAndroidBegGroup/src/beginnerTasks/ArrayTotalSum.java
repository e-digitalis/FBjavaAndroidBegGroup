package beginnerTasks;

public class ArrayTotalSum {
	static int total;

	public static void main(String[] args) {

		int[] myArray = {1,2,3,4,5,6,7,8,9};
		arrayTotal(myArray);
		System.out.println("From the main printing the returned value: " + total);
		System.out.println();
		arrayOtherTotal();
	}

	public static void arrayOtherTotal() {

		int sumOne = 0;

		int[] intEmptyArray = new int[3];
		intEmptyArray[0] = 12;
		intEmptyArray[1] = 45;
		intEmptyArray[2] = 78;

		for (int indexPosition = 0; indexPosition < intEmptyArray.length; indexPosition++) {
			sumOne += intEmptyArray[indexPosition];
			System.out.println("Loop " + (indexPosition + 1) + ": " + sumOne);
		}
		System.out.println();

		int sumTwo = 0;
		int loopCounter = 1;

		int[] intInstantlyPopulatedArray = new int[] { 12, 45, 78, 89, 23, 56 };

		for (int intObject : intInstantlyPopulatedArray) {
			sumTwo = sumTwo + intObject;
			System.out.println("Loop " + loopCounter + ": " + sumTwo);
			loopCounter++;
		}
	}

	public static int arrayTotal(int[] myArray) {

		int loopCounter = 0;
		
		for (int intObject : myArray) {
			total += intObject;
			System.out.println("Loop " + (loopCounter + 1) + ": " + total);
			loopCounter++;
		}

		return total;
	}

}

// #BeginnersOnly
// Code a method called 'arrayTotal' that returns the sum (total) of an int
// array.
// Your method will look like this:
// public static int arrayTotal(int [] myArray){
//// Your code
// return total;
// }
