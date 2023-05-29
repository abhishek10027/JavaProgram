package JavaProgram.Array;

// Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

public class EquilibriumPoint {
	static int point(long arr[],int n) {
		int leftsum=0;
		int rightsum=0;
		for(int i=0;i<n;i++) {
			leftsum+=arr[i];
		}
		for(int i=0;i<n;i++) {
			leftsum-=arr[i];
			if(leftsum==rightsum) {
				return i;
			}
			rightsum +=arr[i];
			
			
		}
		// return -1 if there is no Equilibrium Point;
		return -1 ;
		
	}
	

	public static void main(String[] args) {
		long arr[]= {2,4,5,1,1,3,1} ;
		int n=arr.length;
		System.out.print("The Equilibrium Point is :"+point(arr,n));

	}

}
