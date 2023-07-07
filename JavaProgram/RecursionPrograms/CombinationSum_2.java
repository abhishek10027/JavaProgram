package JavaProgram.RecursionPrograms;

/*
 *Problem Statement :-  Given a collection of candidate numbers (candidates) and a target number (target), 
 * 						find all unique combinations in candidates where the candidate numbers sum to target.
 */

import java.util.*;
public class CombinationSum_2 {
	static void findCombinations(int start, int[] arr, int target, List < List < Integer >> ans, List < Integer > current) {
        if (target == 0) {
            ans.add(new ArrayList < > (current));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            current.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], ans, current);
            current.remove(current.size() - 1);
        }
    }
    public static List < List < Integer >> combinationSum2(int[] candidates, int target) {
        List < List < Integer >> ans = new ArrayList < > ();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }

    public static void main(String args[]) {
        int [] candidates = {2,5,2,1,2};
        int target = 5;
        List < List < Integer >> comb = combinationSum2(candidates, target);
        System.out.println("The unique combinations are :- \n"+comb);
    }
	

}
