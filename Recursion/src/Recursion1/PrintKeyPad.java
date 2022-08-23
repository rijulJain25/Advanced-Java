package Recursion1;

public class PrintKeyPad {
	
	public static String helper(int n) {
		if(n == 2) {
			String s = "abc";
			return s; 
		}
		if(n == 3) {
			String s = "def";
			return s; 
		}
		if(n == 4) {
			String s = "ghi";
			return s;  
		} 
		if(n == 5) {
			String s = "jkl";
			return s;  
		}
		if(n == 6) {
			String s = "mnop";
			return s; 
		}
		if(n == 7) {
			String s = "qrs";
			return s; 
		}
		if(n == 8) {
			String s = "tuv";
			return s;  
		}
		if(n == 9) {
			String s = "wxyz";
			return s; 
		}
		else {
			String s ="";
			return s; 
		}
	}
	
	public static void PrintKeypadComb(int n, String output) {
		if(n==0) {
			System.out.println(output);
		}
		String code = helper(n%10);
		for(int i = 0; i< code.length(); i++) {
			PrintKeypadComb(n/10, code.charAt(i)+output);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 23;
		PrintKeypadComb(n, "");
	}

}
