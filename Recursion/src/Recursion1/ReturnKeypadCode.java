/*Question:
Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Return empty string for numbers 0 and 1.
Note : 1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6
Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf

*/


package Recursion1;

import java.util.Scanner;


public class ReturnKeypadCode {

	public static String[] helper(int n) {
		if(n == 2) {
			return new String[] {"a", "b", "c"}; 
		}
		if(n == 3) {
			return new String[] {"d", "e", "f"}; 
		}
		if(n == 4) {
			return new String[] {"g", "h", "i"}; 
		}
		if(n == 5) {
			return new String[] {"j", "k", "l"}; 
		}
		if(n == 6) {
			return new String[] {"m", "n", "o"}; 
		}
		if(n == 7) {
			return new String[] {"p", "q", "r", "s"}; 
		}
		if(n == 8) {
			return new String[] {"t", "u", "v"}; 
		}
		if(n == 9) {
			return new String[] {"w", "x", "y", "z"}; 
		}
		else {
			return new String[0];
		}
	}
	
	public static String[] ReturnKeypad(int n) {
		if(n/10 == 0) {
			return helper(n);
		}
		String small[] = helper(n%10);
		String small1[] = ReturnKeypad(n/10);
		String result[] = new String[small1.length * small.length];
		int k = 0;
		for(int j = 0; j<small.length; j++) {
			for(int i = 0; i<small1.length; i++) {
				result[k] = small1[i] + small[j];
				k++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String output[] = ReturnKeypad(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
