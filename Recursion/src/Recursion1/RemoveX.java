/*Question:
Given a string, compute recursively a new string where all 'x' chars have been removed.
Input format :
String S
Output format :
Modified String
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 
Sample Input 1 :
xaxb
Sample Output 1:
ab
Sample Input 2 :
abc
Sample Output 2:
abc
Sample Input 3 :
xx
Sample Output 3:
*/


package Recursion1;

public class RemoveX {

	public static String RemovingX(String str) {
		if(str.length() == 0) {
			String str2 = "";
			return str2;
		}
		if(str.charAt(0) == 'x') {
			return RemovingX(str.substring(1, str.length()));
		}
		else {
			System.out.print(str.charAt(0));
			return RemovingX(str.substring(1, str.length()));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(RemovingX("myxxhjfnkjxmjjxxx"));
	}

}
