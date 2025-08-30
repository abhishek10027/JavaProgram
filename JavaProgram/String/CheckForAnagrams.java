package JavaProgram.String;

/* 
 * Problem Statement :- Given two strings s and t, return true if t is an anagram of s, and false otherwise. 
 */

import java.util.Arrays;

public class CheckForAnagrams {
	
	static String  sortstring(String str) {
		char [] c=str.toCharArray();
		Arrays.sort(c);
		return new String(c);
		
	}
	
	static boolean checkanagram(String s1,String s2) {
		// check for length 
		
		if(s1.length()!=s2.length())
			return false;
	
		s1=sortstring(s1);
		s2=sortstring(s2);
		
		// check for each elements of both strings 
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String str1= "anagram";
		String str2="nagaram";
		
		// if both string are same then it will return true as output 
		// else it will return false as output.
		
		System.out.println(checkanagram(str1,str2));
		
		

	}

}

