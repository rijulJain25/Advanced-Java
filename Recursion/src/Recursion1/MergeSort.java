/*Question:
Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.
Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 10^3
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
2 1 5 2 3
Sample Output 2 :
1 2 2 3 5 
*/


package Recursion1;

public class MergeSort {
	
	public static void merge(int arr[], int str, int end, int mid) {
		int s1 = mid-str+1;
		int s2 = end - mid;
		int temp1[] = new int[s1];
		int temp2[] = new int[s2];
		
		for(int i = 0; i<s1; i++) {
			temp1[i] = arr[str+i];
		}
		
		for(int i = 0; i<s1; i++) {
			temp1[i] = arr[str+i];
		}
		
		int i = 0, j = 0, k =0;
		while(i<s1 && j<s2) {
			if(temp1[i]<temp2[j]) {
				arr[k] = temp1[i];
				i++; k++;
			}
			else {
				arr[k] = temp2[j];
				j++; k++;
			}
		}
		
		while(i<s1) {
			arr[k] = temp1[i];
			i++; k++;
		}
		while(j<s2) {
			arr[k] = temp2[j];
			j++; k++;
		}
		
	}
	
	public static void MergeSorting(int arr[], int str, int end) {
		if(str>=end) {
			return;
		}
		int mid = (str+end)/2;
		MergeSorting(arr, str, mid);
		MergeSorting(arr, mid+1, end);
		merge(arr, str, end, mid);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,2,6,5};
		MergeSorting(arr, 0, arr.length-1);
	}

}
