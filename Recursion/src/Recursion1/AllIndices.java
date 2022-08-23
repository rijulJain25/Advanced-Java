/*Question:
Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
indexes where x is present in the array (separated by space)
Constraints :
1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4 
*/


package Recursion1;

public class AllIndices {

	public static int[] allIndexes(int input[], int x, int str, int arr[]) {
		if(str < 0) {
			return arr;
		}
		if(input[str] == x) {
			int temp[] = arr;
			arr = new int[arr.length+1];
			arr[0] = str;
			for(int i = 1; i<arr.length; i++) {
				arr[i] = temp[i-1];
			}
		}
		return allIndexes(input, x, str-1, arr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
