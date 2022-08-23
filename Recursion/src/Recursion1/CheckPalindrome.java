/*Question:
Check whether a given String S is a palindrome using recursion. Return true or false.
Input Format :
String S
Output Format :
'true' or 'false'
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
racecar
Sample Output 1:
true
Sample Input 2 :
ninja
Sample Output 2:
false

*/


package Recursion1;

public class CheckPalindrome {

	public static boolean chkPalindrome(String str) {
		if(str.length() == 0 || str.length() == 1) {
			return true;
		}
		if(str.charAt(0) == str.charAt(str.length()-1)) {
			return chkPalindrome(str.substring(1, str.length()-1));
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(chkPalindrome("chanaasdanahc"));
	}

}
