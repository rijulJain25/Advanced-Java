/*Question:
Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
Input format :
String S
Output format :
Modified string
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
hello
Sample Output 1:
hel*lo
Sample Input 2 :
aaaa
Sample Output 2 :
a*a*a*a
*/


package Recursion1;

public class PairStar {

	public static String PairStarAdd(String str) {
		if(str.length() == 1) {
			return str;
		}
		if(str.charAt(0) == str.charAt(1)) {
			System.out.print(str.charAt(0)+"*");
			return PairStarAdd(str.substring(1));
		}
		else {
			System.out.print(str.charAt(0));
			return PairStarAdd(str.substring(1));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(PairStarAdd("hellllo"));
	}

}
