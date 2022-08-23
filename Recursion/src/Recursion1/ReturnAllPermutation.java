/*Question:
Given a string S, find and return all the possible permutations of the input string.
Note 1 : The order of permutations is not important.
Note 2 : If original string contains duplicate characters, permutations will also be duplicates.
Input Format :
String S
Output Format :
All permutations (in different lines)
Sample Input :
abc
Sample Output :
abc
acb
bac
bca
cab
cba
*/


package Recursion1;

public class ReturnAllPermutation {
	
	public static int factorial(int n) {
		if(n<=0) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	public static String[] Permutation(String str) {
		if(str.length() == 0) {
			String[] s = {""};
			return s;
		}
		int num = factorial(str.length());
		String small[] = Permutation(str.substring(1));
		String output[] = new String[num];
		int k =0;
		for(int i = 0; i<small.length; i++) {
			String currStr = small[i];
			for(int j = 0; i<currStr.length(); j++) {
				output[k] = currStr.substring(0, j)+ str.charAt(0)+ currStr.substring(j);
				k++;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
