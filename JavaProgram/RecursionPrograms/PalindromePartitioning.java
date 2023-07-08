package JavaProgram.RecursionPrograms;

/*
 * Problem Statement :-  Given a string s, partition s such that every substring of the partition is a palindrome,
  							Return all possible palindrome partitioning of s.
 */

import java.util.*;
public class PalindromePartitioning {
	
	public static List < List < String >> partition(String s) {
        List < List < String >> result = new ArrayList < > ();
        List < String > current = new ArrayList < > ();
        partitionHelper(0, s, current, result);
        return result;
    }

    static void partitionHelper(int index, String s, List < String > current, List < List < String >> result) {
        if (index == s.length()) {
            result.add(new ArrayList < > (current));
            return;
        }
        for (int i = index; i < s.length(); ++i) {
            if (isPalindrome(s, index, i)) {
                current.add(s.substring(index, i + 1));
                partitionHelper(i + 1, s, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        String s = "aab";
        List < List < String >> ans = partition(s);
        System.out.println("The Palindromic partitions are :-");
        System.out.println(ans);

    }

}
