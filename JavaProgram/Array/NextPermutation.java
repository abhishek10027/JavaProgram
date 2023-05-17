package JavaProgram.Array;
import java.util.*;

public class NextPermutation {
	public static List<Integer> permutation(List<Integer>A){
		int idx=-1;
		int n=A.size();
		for(int i=n-2;i>=0;i--) {
			if(A.get(i)<A.get(i+1)) {
				idx=1;
				break;
			}
		}
		if(idx==-1) {
			Collections.reverse(A);
			return A;
		}
		for(int i=n-1;i>idx;i--) {
			if(A.get(i)>A.get(idx)) {
				int temp=A.get(i);
				A.set(i, A.get(idx));
				A.set(idx, temp);
				
				break;
			}
		}
		List<Integer>sublist=A.subList(idx+1, n);
		Collections.reverse(sublist);
		return A;
		
	}

	public static void main(String[] args) {
		List<Integer>A=Arrays.asList(new Integer[] {3,1,2});
		List<Integer>ans=permutation(A);
		System.out.print("The next permutation is:[");
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
		System.out.print("]");

	}

}
