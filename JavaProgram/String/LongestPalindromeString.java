package JavaProgram.String;

/*
 * Problem Statement :- Given String s ,then return the longest palindrome substring.
 */

public class LongestPalindromeString {
	
	static String longestpalindrome(String s) {
		
		int start=0;
		int end=0;
		
		for(int i=0;i<s.length();i++) {
			
			int len1=expandFromcentre(s,i,i+1);// if palindrome string is like that baab
			int len2=expandFromcentre(s,i,i);// if palindrome string is like that bab
			int len=Math.max(len1, len2);
			
			// condition
			if(end-start<len) {
				start=i-(len-1)/2;
				end=i+len/2;
			}
			
			
		}
		return s.substring(start,end+1);
	}
	
	static int expandFromcentre(String s,int i,int j) {
		
		while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j)) {
			i--;
			j++;
		}
		return j-i-1;
	}
	

	public static void main(String[] args) {
		
		String s="babad";
		System.out.println("The longest palindrome string is : "+longestpalindrome(s));

	}

}
