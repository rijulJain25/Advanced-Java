/*Question:
Given an integer array (of length n), find and print all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print the subsets in different lines.
Input format :
Line 1 : Integer n, Size of array
Line 2 : Array elements (separated by space)
Constraints :
1 <= n <= 15
Sample Input:
3
15 20 12
Sample Output:
[] (this just represents an empty array, don't worry about the square brackets)
12 
20 
20 12 
15 
15 12 
15 20 
15 20 12 
*/


package Recursion1;

public class PrintSubsetArr {
	
	public static void SubsetArr(int arr[], int str, int output[], int m) {
		if(str == arr.length) {
			for(int i = 0; i<m; i++) {
				System.out.print(output[i]);
			}
			System.out.println();
			return;
		}
		SubsetArr(arr, str+1, output, m);
		output[m] = arr[str];
		SubsetArr(arr, str+1, output, m+1);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
