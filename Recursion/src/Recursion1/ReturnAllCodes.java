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

public class ReturnAllCodes {
	
	public static String[] ReturnCodes(String str) {
		if(str.length() == 0) {
			return new String[0];
		}
		
		String small1[] = ReturnCodes(str.substring(1));
		char firstChar = (char)(str.charAt(0)-'0'+'a'-1);
		for(int i = 0; i<small1.length; i++) {
			small1[i] = firstChar + small1[i];
		}
		String small2[] = new String[0];
		if(str.length()>=2) {
			char firstTwoChar = (char)((str.charAt(0)-'0')*10+(str.charAt(1)-'0') + 'a' -1);
			if(firstTwoChar >= 'a' && firstTwoChar<='z') {
				small2 = ReturnCodes(str.substring(2));
				for(int i = 0; i<small2.length; i++) {
					small2[i] = firstTwoChar + small2[i];
				}
			}
		}
		String ans[] = new String[small1.length+small2.length];
		int k = 0;
        for(int i = 0; i< small1.length; i++){
            ans[k] = small1[i];
            k++;
        }
        
        for(int i = 0; i<small2.length; i++){
            ans[k] = small2[i];
            k++;
        }
        return ans;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
