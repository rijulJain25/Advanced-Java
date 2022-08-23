/*Question:
Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
Do this recursively.
Input Format :
Line 1 : Input String S
Line 2 : Character c1 and c2 (separated by space)
Output Format :
Updated string
Constraints :
1 <= Length of String S <= 10^6
Sample Input :
abacd
a x
Sample Output :
xbxcd
*/


package Recursion1;

public class RelpaceCharacter {

	public static String ReplaceChar(String str, char c1, char c2) {
		if(str.length() == 0) {
			return "";
		}
		if(str.charAt(0) == c1) {
			System.out.print(c2);
			return ReplaceChar(str.substring(1), c1, c2);
		}
		else {
			System.out.print(str.charAt(0));
			return ReplaceChar(str.substring(1), c1, c2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(ReplaceChar("ryjul jayn", 'y', 'i'));
	}

}
