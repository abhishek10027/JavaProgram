package JavaProgram.RecursionPrograms;

/*
 * Problem Statements :- Given an array of distinct integers candidates and a target integer target, 
 *						 return a list of all unique combinations of candidates where the chosen numbers sum to target. 
 *						 You may return the combinations in any order.
 */

import java.util.*;
public class CombinationSum_1 {
	
	public static List<List<Integer>>combinationsum(int [] candidates,int target){
		List<List<Integer>>combsum=new ArrayList();
		generatecombs(0,candidates,new ArrayList(),combsum,target);
		return combsum;
	}
	
	static void generatecombs(int start,int [] nums,List<Integer>current,List<List<Integer>>combsum,int target) {
		 if(target==0) {
			 combsum.add(new ArrayList(current));
		}
		 if(target<0) return;
		 
		 for(int i=start;i<nums.length;i++) {
			 current.add(nums[i]);
			 generatecombs(i,nums,current,combsum,target-nums[i]);
			 current.remove(current.size()-1);
		 }
		
	}

	public static void main(String[] args) {
		int [] candidates = {2,3,6,7} ;
		int target = 7;
		System.out.println("combination sums are :- \n"+combinationsum(candidates,target));

	}

}
