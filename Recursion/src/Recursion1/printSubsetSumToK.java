/*Question:
Given an array A and an integer K, print all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print them in different lines.
Input format :
Line 1 : Size of input array
Line 2 : Array elements separated by space
Line 3 : K 
Sample Input:
9 
5 12 3 17 1 18 15 3 17 
6
Sample Output:
3 3
5 1
*/



package Recursion1;

public class printSubsetSumToK {
	
	public static void SubsetArrSum(int[] arr, int k, int str, int[] output, int m) {
		if(str == arr.length) {
			if(k == 0) {
				for(int i = 0; i<m; i++) {
					System.out.print(output[i]);
				}
				System.out.println();
			}
			return;
		}
		SubsetArrSum(arr, k, str+1, output, m);
		
		int newout[] = new int[m+1];
		int i;
		for(i = 0; i<m; i++) {
			newout[i] = output[i];
		}
		newout[i] = arr[str];
		SubsetArrSum(arr, k-arr[str], str+1, newout, m+1);

	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
