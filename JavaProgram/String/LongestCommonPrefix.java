package JavaProgram.String;

/*
 * Problem Statement :-  To find the longest common prefix String among an array of string.
 */

import java.util.*;
public class LongestCommonPrefix {
	
	static String longestcommonprefix(String [] s) {
		
		Arrays.sort(s);
		String str1=s[0];
		String str2=s[s.length-1];
		
		int index=0;
		
		while(index<str1.length()) {
			if(str1.charAt(index)==str2.charAt(index))
				index++;
			else
				break;
			
		}
		return index==0?"":str1.substring(0,index);
	}

	public static void main(String[] args) {
		String [] s ={"flower","flow","flight"};
		System.out.println("Longest common prefix string is : "+longestcommonprefix(s));

	}

}
