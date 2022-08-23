/*Question:
Given a string S, remove consecutive duplicates from it recursively.
Input Format :
String S
Output Format :
Output string
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
*/


package Recursion1;

public class RemoveDuplicates {

	public static String RemoveDuplicate(String str) {
		if(str.length() <= 1) {
			return str; 
		}
		if(str.charAt(0) == str.charAt(1)) {
			return RemoveDuplicate(str.substring(1));
		}
		else {
			return str.charAt(0)+RemoveDuplicate(str.substring(1));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(RemoveDuplicate("xxxxxxuuuuuueeeeejjjj"));

	}

}
