package JavaProgram.String;

/* 
 * Problem Statement :-Given a positive integer n, return the nth term of the count-and-say sequence. 
 */

import java.util.Scanner;
public class CountAndSay {
	
	static String countandsay(int n) {
		String val="1";
		for(int i=1;i<n;i++) {
			char c=val.charAt(0);
			StringBuilder s=new StringBuilder();
			int count=1;
			for(int j=1;j<val.length();j++) {
				if(c!=val.charAt(j)) {
					s.append(count);
					s.append(c);
					count=0;
					c=val.charAt(j);
				}
				count ++;
			}
			s.append(count);
			s.append(c);
			val=s.toString();
		}
		return val;
	}

	public static void main(String[] args) {
		System.out.print("Enter the value of n: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("count-and-say sequence is: "+countandsay(n));

	}

}
