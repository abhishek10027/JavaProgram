package JavaProgram.String;

/*
 * Problem Statement: The task is reverse the words of the given string.
 */
import java.util.*;
public class ReverseWordsinaString {
	static String result(String s)
	{
		int left = 0;
		int right = s.length() - 1;

		String temp = "";
		String res = "";

		//Iterate the string and keep on adding to form a word
		//If empty space is encountered then add the current word to the result
		while (left <= right)
		{
			char ch = s.charAt(left);
			if (ch != ' ')
			{
				temp += ch;
			}
			else if (ch == ' ')
			{
				if (!res.equals(""))
				{
					res = temp + " " + res;
				}
				else
				{
					res = temp;
				}
				temp = "";
			}
			left++;
		}

		//If not empty string then add to the result(Last word is added)
		if (!temp.equals(""))
		{
			if (!res.equals(""))
			{
				res = temp + " " + res;
			}
			else
			{
				res = temp;
			}
		}

		return res;
	}
	public static void main(String[] args){
		
		System.out.print("Enter your string :");
		Scanner sc=new Scanner(System.in);
		String st = sc.nextLine();
		System.out.println("\nBefore reversing words: ");
	    System.out.println(st);
	    System.out.println("\nAfter reversing words: ");
		System.out.print(result(st));
	}

}
