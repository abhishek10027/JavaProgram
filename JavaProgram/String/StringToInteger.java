package JavaProgram.String;

/*
 * Problem Statement :- Implement ATOI/STRSTR which convert a string to integer. 
 */

import java.util.Scanner;
public class StringToInteger {
	
	static int stringtointeger(String s) {
		int i=0;
		
		while(i<s.length()&&s.charAt(i)==' ')
			i++;
		if(i>=s.length())
			return 0;
		int sign=1;
		
		if(s.charAt(i)=='+'||s.charAt(i)=='-') {
			sign=(s.charAt(i)=='+')?1:-1;
			i++;
		}
		if(i>=s.length())
			return 0;
		
		int num=0;
		for (; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c < '0' || c > '9')
                break;

            int digit = c - '0';

            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10))
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            num = num * 10 + digit;
        }

		
		return num*sign;
		
	}

	public static void main(String[] args) {
		System.out.print("Enter your string :");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("An integer is : "+stringtointeger(str));
	}

}
