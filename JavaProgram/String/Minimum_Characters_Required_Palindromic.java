package JavaProgram.String;

import java.util.Scanner;

/* 
 * Problem Statement :- Given string str of length N. 
 * The task is to find the minimum character to be added at front to make the string Palindrome.
 */

public class Minimum_Characters_Required_Palindromic {
	
	static int minchar(String str) {
		int i=0;
		int j=str.length()-1;
		int temp=j;
		int result=0;
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}
			else {
				result ++;
				i=0;
				j=--temp;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.print("Enter your string : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Minimum characters required to make a Palindrome String is : "+minchar(str));

	}

}
