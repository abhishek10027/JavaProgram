package JavaProgram.RecursionPrograms;

/*
 * Problem Statement :- Given N and K, where N is the sequence of numbers from 1 to N([1,2,3….. N]) find the Kth permutation sequence.
 */


import java.util.*;
public class K_th_Permutation_Sequence {
	static String getPermutation(int n, int k) {
        int fact = 1;
        ArrayList < Integer > list = new ArrayList < > ();
        for (int i = 1; i < n; i++) {
            fact = fact * i;
            list.add(i);
        }
        list.add(n);
        String result = "";
        k = k - 1;
        while (true) {
            result = result+ list.get(k / fact);
            list.remove(k / fact);
            if (list.size() == 0) {
                break;
            }

            k = k % fact;
            fact = fact / list.size();
        }
        return result;
    }


    public static void main(String args[]) {
        int n = 4, k = 9;
        String ans = getPermutation(n, k);
        System.out.println("The Kth permutation sequence is :- " + ans);


    }

}
