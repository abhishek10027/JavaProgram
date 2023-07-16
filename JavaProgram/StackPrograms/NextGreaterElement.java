package JavaProgram.StackPrograms;

/*
 * Problem Statement: Given a circular integer array A, return the next greater element for every element in A. 
 * The next greater element for an element x is the first element greater than x that we come across while traversing the array in a clockwise manner. 
 * If it doesn’t exist, return -1 for this element.
 */

import java.util.*;
public class NextGreaterElement {
	
	static int[] nextgreaterelement(int nums[]) {
		int n=nums.length;
		int greaterelement[]=new int[n];
		Stack<Integer>st=new Stack<>();
		for(int i=2*n-1;i>=0;i--) {
			while(st.isEmpty()==false &&st.peek()<=nums[i%n]) {
				st.pop();
			}
			if(i<n) {
			if(st.isEmpty()==false) greaterelement[i]=st.peek();
			else greaterelement[i]=-1;
			}
			st.push(nums[i%n]);
		}
		return greaterelement;
	}

	public static void main(String[] args) {
		int [] nums={5,7,1,7,6,0};
		int [] result=nextgreaterelement(nums);
		System.out.println("Next Greater Elements are :- ");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
