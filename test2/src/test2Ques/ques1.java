/*Question:
Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place(i.e. without using extra space).
Note: You don't need to print the elements, just update the elements and return the head of updated LL.
Input Constraints:
1 <= Length of Linked List <=10^6.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Output Format :
Line 1: Updated linked list elements 
Sample Input 1 :
3 9 2 5 -1
Sample Output 1 :
3 9 2 6
Sample Input 2 :
9 9 9 -1
Sample Output 1 :
1 0 0 0 
*/


package test2Ques;

import java.util.Scanner;

public class ques1 {
	
	public static void Print2DArr(int arr[][]) {
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j<arr.length-i; j++) {
				for(int k = 0; k<arr[0].length; k++) {
					System.out.print(arr[i][k]+" ");
				}
				System.out.println();
			}
		}
	}
	
	public static void print2DArr(int arr[][]) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j< arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[][] arr = new int[n][m];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j< arr[0].length; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		print2DArr(arr);
		Print2DArr(arr);
	}

}
