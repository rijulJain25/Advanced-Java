/*Question:
Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to return the list of all possible codes that can be generated from the given string.
Note : The order of codes are not important. And input string does not contain 0s.
Input format :
A numeric string
Constraints :
1 <= Length of String S <= 10
Sample Input:
1123
Sample Output:
aabc
kbc
alc
aaw
kw
*/


package Recursion1;

public class PrintAllCodes {
	
	public static char helper(int c) {
		return (char)('a'+c-1);
	}
	
	public static void printCodes(String str, String output) {
		if(str.length() == 0) {
			System.out.println(output);
			return;
		}
		char firstChar = helper(str.charAt(0)-'0');
		printCodes(str.substring(1), output+firstChar);
		if(str.length()>=2) {
			int ch1 = str.charAt(0)-'0';
			int ch2 = str.charAt(1)-'0';
			int firstTwoChar = (ch1*10)+ch2;
			if(firstTwoChar>=10 && firstTwoChar<=26) {
				char ch = helper(firstTwoChar);
				printCodes(str.substring(2), output+ch);
			}
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
