/*Question:
Given an array A of size n and an integer K, return all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :
Line 1 : Integer n, Size of input array
Line 2 : Array elements separated by space
Line 3 : K 
Constraints :
1 <= n <= 20
Sample Input :
9 
5 12 3 17 1 18 15 3 17 
6
Sample Output :
3 3
5 1
*/


package Recursion1;

public class ReturnSubsetSumToK {

	public static int[][] subsetSumK(int[] arr, int str, int k){
		if(str == arr.length) {
			if(k == 0) {
				return new int[1][0];
			}
			else {
				return new int[0][0];
			}
		}
		int small[][] = subsetSumK(arr, str+1, k);
		int small2[][] = subsetSumK(arr, str+1, k-arr[str]);
		int output[][] = new int[small.length+small2.length][];
		int n = 0;
		for(int i = 0; i<small.length; i++) {
			output[n] = small[i];
			n++;
		}
		for(int i = 0; i<small2.length; i++) {
			output[n] = new int[small2.length+1];
			output[n][0] = arr[str];
			for(int j = 0; j<small2[i].length; j++) {
				output[n][j+1] = small2[i][j];
			}
			n++;
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
