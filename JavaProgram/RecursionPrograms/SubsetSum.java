package JavaProgram.RecursionPrograms;

/*
 * Problem Statement: Given an array print all the sum of the subset generated from it.
 */
import java.util.*;
public class SubsetSum {
	static void subsetSums(int index, int sum, ArrayList < Integer > arr, int N, ArrayList < Integer > subSubsetlist) {
        if (index == N) {
            subSubsetlist.add(sum);
            return;
        }

        // pick the element 
        subsetSums(index + 1, sum + arr.get(index), arr, N, subSubsetlist);

        // Do-not pick the element
        subsetSums(index + 1, sum, arr, N, subSubsetlist);
    }

    static ArrayList < Integer > subsetSums(ArrayList < Integer > arr, int N) {

        ArrayList < Integer > subSubsetlist = new ArrayList < > ();
        subsetSums(0, 0, arr, N, subSubsetlist);
        Collections.sort(subSubsetlist);
        return subSubsetlist;
    }



    public static void main(String args[]) {


        ArrayList < Integer > arr = new ArrayList < > ();
        arr.add(5);
        arr.add(2);
        arr.add(1);
        
        ArrayList < Integer > ans = subsetSums(arr, arr.size());
        Collections.sort(ans);
        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }

}
