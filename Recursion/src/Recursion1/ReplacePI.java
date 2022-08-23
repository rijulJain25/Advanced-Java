/*Question:
Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
Constraints :
1 <= |S| <= 50
where |S| represents the length of string S. 
Sample Input 1 :
xpix
Sample Output :
x3.14x
Sample Input 2 :
pipi
Sample Output :
3.143.14
Sample Input 3 :
pip
Sample Output :
3.14p
Constraints:-
1<=|S|<=50
*/


package Recursion1;

public class ReplacePI {

	public static String ReplacePi(String str) {
		if(str.length() == 0) {
			String str2 = "";
			return str2;
		}
		if(str.length()== 1) {
			return str;
		}
		if(str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			System.out.print("3.14");
			return str.substring(2, str.length());
		}
		else {
			System.out.print(str.charAt(0));
			return str.substring(1, str.length());
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
