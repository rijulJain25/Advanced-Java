/*Question:
Write a recursive function that returns the sum of the digits of a given integer.
Input format :
Integer N
Output format :
Sum of digits of N
Constraints :
0 <= N <= 10^9
Sample Input 1 :
12345
Sample Output 1 :
15
Sample Input 2 :
9
Sample Output 2 :
9

*/


package Recursion1;

public class SumOFDigits {
	
	public static int SumOfDigits(int n) {
		if(n == 0 || n < 10) {
			return n;
		}
		return (n%10) + SumOfDigits(n/10); 
	}
	
	public static void main(String[] args) {
		System.out.print(SumOfDigits(2314));
	}
}

