package me.jacob.reverseArray;

import java.util.Arrays;

/*
 * Name: Jacob Seiler
 * Teacher: Mrs. Costin
 * Course: ICS4U
 * Date: 9/19/2017
 */
public class ReverseArray {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int[] numbs = {0, 4, 7, 8, 9, 11, 111114}; // Create a new array of integers.
		numbs = reverseArray(numbs); // Run the reverseArray method and make that the new value of numbs.
		System.out.println("Reverse: " + Arrays.toString(numbs)); // Prints the new array.
	}

	/**
	 * Reverse array.
	 *
	 * @param intArray the int array
	 * @return the reversed int array
	 */
	private static int[] reverseArray(int[] intArray) {
		// Loop through the first half of the array.
		for (int i = 0; i < intArray.length / 2; i++) {
			int temp = intArray[i]; // Set the value of 'temp' to the current index.
			intArray[i] = intArray[intArray.length - i - 1]; // Set the current index to the value on the opposite end.
			intArray[intArray.length - i - 1] = temp; // Set the value on the opposite end to the value of 'temp'.
		}

		return intArray; // return the array after it has been re-structured.
	}

}
