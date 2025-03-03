// This program is to be used as part of a debugging exercise.
//
// The program counts the occurrences of the last two digits of the
// "triangle numbers".  The nth triangle number is equal to the sum of
// the first n integers (1 + 2 + 3 + ... + n) and also equals n * (n + 1) / 2.
// 
// The program looks at the last two digits of the first ten thousand triangle
// numbers and counts how many triangle numbers end with the digits 00, 01, 02,
// ..., 10, 11, ..., 98, and 99, then prints out the counts of each.

public class TriangleCount {
	public static void main(String[] args) {
		int[] count = new int[100];      // count of ending 2 digits from 00-99
		
		// process each of the first 10,000 triangle numbers
		for (int i = 1; i <= 10000; i++) {
			int next = i * (i + 1) / 2;
			int digits = next % 100;
			count[digits]++;             // increase tally for the last 2 digits
			
			if (i % 200 == 0) {
				System.out.print(".");   // print progress dot every 200 numbers
			}
		}
		System.out.println();
		
		// display count of every possible last two digits from 00-99
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.println("count for " + i + " = " + count[i]);
			}
		}
	}
}