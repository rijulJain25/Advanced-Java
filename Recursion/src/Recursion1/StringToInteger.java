/*Question:
Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
Input format :
Numeric string S (string, Eg. "1234")
Output format :
Corresponding integer N (int, Eg. 1234)
Constraints :
0 < |S| <= 9
where |S| represents length of string S.
Sample Input 1 :
00001231
Sample Output 1 :
1231
Sample Input 2 :
12567
Sample Output 2 :
12567

*/


package Recursion1;

public class StringToInteger {
	
	static int count = 0;
	
	public static int StringToInt(String str) {
		if(str.length() == 1) {
			return str.charAt(0) -'0';	
		}
		if(str.charAt(0) == '0' && count == 0) {
			return StringToInt(str.substring(1));
		}
		int a = str.charAt(0) - '0';
		System.out.print(a);
		count++;
		return StringToInt(str.substring(1));
	}
	
	public static void main(String[] args){
		System.out.print(StringToInt("00102020102"));
	}
	
}
