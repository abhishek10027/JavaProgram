package JavaProgram.StackPrograms;

import java.util.Stack;

/*
 * Problem statement :- Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
 		determine if the input string is valid.
 */

public class ValidParentheses {
	static boolean isvalid(String s) {
		Stack<Character>st=new Stack<Character>();
		for(char it:s.toCharArray()) {
			if(it=='('||it=='{'||it=='[')
				st.push(it);
			else {
				if(st.isEmpty()) return false;
				
				char ch=st.pop();
				
				if((it==')'&&ch=='(')||(it=='}'&&ch=='{')||(it==']'&&ch=='['))
					continue;
				else
					return false;
				
			}
			
		}
		return st.isEmpty();
	}
	public static void main(String args[]) {
		String str="()[]{}";
		if(isvalid(str)==true)
			System.out.println("The given is a valid parentheses");
		else
			System.out.println("The given is not a valid parentheses ");
	}

}
