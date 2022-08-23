/*Question:
Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
'true' or 'false'
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false
*/



package Recursion1;

public class CheckNoInArr {
	
	public static boolean chkArrForn(int arr[], int n, int x) {
		if(n < 1) {
			return false;
		}
		if(arr[n-1] == x) {
			return true;
		}
		return chkArrForn(arr, n-1, x);
	}
	
	public static void main(String[] args) {
		int arr[] = {2,4,6,7,8};
		int x = 9;
		System.out.print(chkArrForn(arr, arr.length, x));
	}
}
