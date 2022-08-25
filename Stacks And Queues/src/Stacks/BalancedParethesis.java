package Stacks;

import java.util.Stack;

public class BalancedParethesis {
	
	public static boolean BalancedBracket(String expression) {
		Stack<Character> st = new Stack<>();
        for(int i = 0; i< expression.length(); i++){
            char x = expression.charAt(i);
            if(x == '(' || x == '{' || x == '['){
                st.push(x);
            }
            else if(x == ')' || x == '}' || x == ']'){
                if(st.isEmpty()){
                    return false;
                }
                char check;
                switch(x){
                    case ')':
                        check = st.pop();
                        if(check == '{' || check == '['){
                            return false;
                        }
                        break;
                     case ']':
                        check = st.pop();
                        if(check == '{' || check == '('){
                            return false;
                        }
                        break;
                     case '}':
                        check = st.pop();
                        if(check == '(' || check == '['){
                            return false;
                        }
                        break;
                }  
            } 
        }  
        return st.isEmpty();  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
