/*Question:
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
first index or -1
Constraints :
1 <= N <= 10^3
Sample Input :
4
9 8 10 8
8
Sample Output :
1

*/


package Recursion1;

public class FirstIdxOfNum {
	
	static int count = 0;
	
	public static int FirstIdx(int arr[], int x) {
		if(arr.length == 0) {
			return -1;
		}
		if(arr[0] == x) {
			return count;
		}
		count++;
		int temp[] = new int[arr.length-1];
		for(int i = 1; i<arr.length; i++) {
			temp[i-1] = arr[i];
		}
		return FirstIdx(temp, x);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 5, 6, 24, 6, 23};
		int x = 6;
		System.out.print(FirstIdx(arr, x));
	}

}
