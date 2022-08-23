/*Question:
Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.
Return -1 if x is not present in the given array.
Note : If given array size is even, take first mid.
Input format :
Line 1 : Array size
Line 2 : Array elements (separated by space)
Line 3 : x (element to be searched)
Sample Input :
6
2 3 4 5 6 8 
5 
Sample Output:
3 

*/


package Recursion1;

public class BinarySearch {
	
	public static int BinarySearching(int n, int[] arr, int str, int end) {
		if(str<=end) {
			int mid = (str+end)/2;
			if(arr[mid] == n) {
				return mid;
			}
			else if(arr[mid] < n) {
				return BinarySearching(n, arr, mid+1, end);
			}
			else {
				return BinarySearching(n , arr, str, mid-1);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 4, 7, 8, 9,12, 13, 16, 22};
		System.out.print(BinarySearching(16, arr, 0, arr.length-1));
	}

}
