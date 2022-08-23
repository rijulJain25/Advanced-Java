/*Question:
Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Output Format :
Sum
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7  
*/


package Recursion1;

public class SumOfArr {
	
	public static int SumArr(int[] arr) {
		if(arr.length == 0) {
			return 0;
		}
		int temp[] = new int[arr.length-1];
		for(int i = 1; i<arr.length; i++) {
			temp[i-1] = arr[i];
		}
		return arr[0]+ SumArr(temp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 5, 6, 10};
		System.out.print(SumArr(arr));
	}

}
