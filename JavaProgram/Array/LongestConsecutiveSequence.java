package JavaProgram.Array;
import java.util.*;

public class LongestConsecutiveSequence {
	static int lognestsequence(int arr[]) {
		Set<Integer>st=new HashSet<Integer>();
		for(int num:arr) {
			st.add(num);
			}
		int longestsequence=0;
		for(int i:arr) {
			if(!st.contains(i-1)) {
				int currentnum=i;
				int currentsequence=1;
				while(st.contains(currentnum+1)) {
					currentnum+=1;
					currentsequence+=1;
					
				}
				longestsequence=Math.max(currentsequence, longestsequence);
				
			}
			
			
		}
		return longestsequence;
	}

	public static void main(String[] args) {
		int arr[]= {100,4,200,1,3,2};
		System.out.println("The lognestsequence is :"+lognestsequence(arr));
		}

}
