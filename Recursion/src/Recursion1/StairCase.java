/*Question:
A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.
Input format :
Integer N
Output Format :
Integer W
Constraints :
1 <= N <= 30
Sample Input 1 :
4
Sample Output 1 :
7
Sample Input 2 :
5
Sample Output 2 :
13
*/


package Recursion1;

public class StairCase {
	
	public static int FindWays(int n) {
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		int count = 0;
		for(int i = 1; i<=3;i++) {
			count += FindWays(n-i);
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		System.out.println(FindWays(n));
	}

}
