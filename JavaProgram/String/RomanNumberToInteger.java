package JavaProgram.String;

/*
 * Problem statement :- covert the given Roman numeral into an integer.
 */

import java.util.*;
public class RomanNumberToInteger {
	
	static int romanTointeger(String s) {
		
		Map<Character,Integer>map=new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result=0;
		
		for(int i=0;i<s.length();i++) {
			int first=map.get(s.charAt(i));
			int second ;
			if(i+1<s.length()) {
				second=map.get(s.charAt(i+1));
				if(second>first) {
					result+=second-first;
					i++;
				}
				else {
					result+=first;
				}
			}
			else {
				result+=first;
			}
			
		}
		return result;
	}

	public static void main(String[] args) {
		
		System.out.print("Enter the Roman numeral : ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		System.out.println("An integer number is : "+romanTointeger(s));

	}

}
