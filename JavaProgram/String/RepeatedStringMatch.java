package JavaProgram.String;

/*
 * Problem Statement :- Given two strings a and b, 
 * return the minimum number of times you should repeat string a so that string b is a substring of it.
 * If it is impossible for b​​​​​​ to be a substring of a after repeating it, return -1.
 */

public class RepeatedStringMatch {
	
	static int repeatedstringmatch(String A,String B) {
		
		// minimum number of repetitions 
		int repeat=B.length()/A.length();
		String s=A;
		int count=1;
		
		for(int i=0;i<=repeat;i++) {
			if(s.contains(B))
				return count;
			s+=A;
			count++;
		}
		return -1;
	}

	public static void main(String[] args) {
		String A= "abcd";
		String B= "cdabcdab";
		
		System.out.println("The Repeated String Match is: "+repeatedstringmatch(A,B));

	}

}
