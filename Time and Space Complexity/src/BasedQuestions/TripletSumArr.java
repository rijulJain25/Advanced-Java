/*Question:
You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.
Note :
Given array/list can contain duplicate elements.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains an integer 'X'.
Output format :
For each test case, print the total number of triplets present in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= X <= 10^9

Time Limit: 1 sec
Sample Input 1:
1
7
1 2 3 4 5 6 7 
12
Sample Output 1:
5
Sample Input 2:
2
7
1 2 3 4 5 6 7 
19
9
2 -5 8 -6 0 5 10 11 -3
10
Sample Output 2:
0
5

 Explanation for Input 2:
Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.

For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)
*/



package BasedQuestions;

import java.util.Arrays;

public class TripletSumArr {
	
	public static int TripletSum(int arr[], int num) {
		Arrays.sort(arr);
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			int numFind = num - arr[i];
			int numPairAns = PairSum(arr, i+1, arr.length-1, numFind);
			count += numPairAns;
		}
		return count;
	}
	
	public static int PairSum(int arr[], int str, int end, int num) {
		int count = 0;
		while(str<end) {
			if(arr[str]+arr[end]<num) {
				str++;
			}
			else if(arr[str]+arr[end]>num) {
				end--;
			}
			else {
				int eleAtStr = arr[str];
				int eleAtEnd = arr[end];
				if(eleAtStr == eleAtEnd) {
					int totalValues = ((end-str)+1);
					count += (totalValues*(totalValues-1))/2;
					return count;
				}
				int nextIdx = str+1;
				int prevIdx = end-1;
				while(nextIdx <= prevIdx && arr[nextIdx] == eleAtStr) {
					nextIdx++;
				}
				while(nextIdx <= prevIdx && arr[prevIdx] == eleAtEnd) {
					prevIdx--;
				}
				
				int totalValuesFromStr = (nextIdx - str);
				int totalValuesFromEnd = (end - prevIdx);
				count += (totalValuesFromStr*totalValuesFromEnd);
				str = nextIdx;
				end = prevIdx;
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(TripletSum(arr, 12));
	}

}
