/*Question:
Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
last index or -1
Constraints :
1 <= N <= 10^3
Sample Input :
4
9 8 10 8
8
Sample Output :
3

*/


package Recursion1;

public class LastIdxOfNum {
	
static int count = 0;
static int cnt = -1;

	public static int LastIdx(int arr[], int x) {
		if(arr.length == 0) {
			return cnt;
		}
		if(arr[0] == x) {
			cnt = count;
		}
		count++;
		int temp[] = new int[arr.length-1];
		for(int i = 1; i<arr.length; i++) {
			temp[i-1] = arr[i];
		}
		return LastIdx(temp, x);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,3,8,2,6,3,7,8};
		int x = 3;
		System.out.print(LastIdx(arr, x));
	}

}
