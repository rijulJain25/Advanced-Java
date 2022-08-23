/*Question:
Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.
Input Format :
Integer n
Output Format :
Numbers from 1 to n (separated by space)
Constraints :
1 <= n <= 10000
Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
Sample Input 2 :
 4
Sample Output 2 :
1 2 3 4
*/


package Recursion1;

import java.util.Scanner;

public class PrintNumbers {
	
	public static void printNum(int n) {
		if(n == 0) {
			return;
		}
		printNum(n-1);
		System.out.print(n+" ");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printNum(n);
	}

}
