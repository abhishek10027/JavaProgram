package JavaProgram.RecursionPrograms;

/*
 * Problem Statement :- Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
 * 							The solution set must not contain duplicate subsets. Return the solution in any order.
 */


import java.util.*;
public class SubSets_II {
	
	public static void findSubsets(int index, int[] nums, List<Integer> temp, List<List<Integer>> ansList) {
        ansList.add(new ArrayList<>(temp)); 
        for(int i = index;i<nums.length;i++) {
            if(i!=index && nums[i] == nums[i-1]) continue; 
            temp.add(nums[i]); 
            findSubsets(i+1, nums, temp, ansList); 
            temp.remove(temp.size() - 1);
        }
        
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> ansList = new ArrayList<>(); 
        findSubsets(0, nums, new ArrayList<>(), ansList); 
        return ansList; 
    }

    public static void main(String args[]) {
    	
    	int nums[]={1,2,2};
   
		 List < List<Integer>> ans = subsetsWithDup(nums);
		 System.out.println("The unique subsets are :- ");
		 System.out.println(ans.toString().replace(","," "));
   
}

}
