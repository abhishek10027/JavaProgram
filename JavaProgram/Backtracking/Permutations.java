package JavaProgram.Backtracking;

/*
 * Problem statement :- Given an array nums of distinct integers, return all the possible permutations in any order.
 */
import java.util.*;
public class Permutations {
	 private static void recurPermute(int index, int[] nums, List < List < Integer >> result) {
	        if (index == nums.length) {
	            // copy the templist to result
	            List < Integer > templist = new ArrayList < > ();
	            for (int i = 0; i < nums.length; i++) {
	                templist.add(nums[i]);
	            }
	            result.add(new ArrayList < > (templist));
	            return;
	        }
	        for (int i = index; i < nums.length; i++) {
	            swap(i, index, nums);
	            recurPermute(index + 1, nums, result);
	            swap(i, index, nums);
	        }
	    }
	    private static void swap(int i, int j, int[] nums) {
	        int t = nums[i];
	        nums[i] = nums[j];
	        nums[j] = t;
	    }
	    public static List < List < Integer >> permute(int[] nums) {
	        List < List < Integer >> ans = new ArrayList < > ();
	        recurPermute(0, nums, ans);
	        return ans;
	    }
	    public static void main(String[] args) {
	        int nums[] = {1,2,3};
	        List < List < Integer >> ls =permute(nums);
	        System.out.println("All Permutations are :-\n"+ ls);
	        
	    }

}
