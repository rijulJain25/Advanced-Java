/*QUESTION:
Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).
Return true or false.
Do it recursively.
E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.
Input Format :
Line 1 : String s
Line 2 : String t
Output Format :
true or false
Sample Input 1 :
abchjsgsuohhdhyrikkknddg
coding
Sample Output 1 :
true
Sample Input 2 :
abcde
aeb
Sample Output 2 :
false
*/

package Ques;

public class Ques1 {
	
	public static boolean DoesSContainT(String s, String t) {
		if(s.length() == 0) {
			return false;
		}
		if(t.length() == 0) {
			return true;
		}
		if(s.charAt(0) == t.charAt(0)) {
			return DoesSContainT(s.substring(1), t.substring(1));
		}
		else {
			return DoesSContainT(s.substring(1), t);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
