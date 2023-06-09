package JavaProgram.Array;

/*
 * Problem Statement:Find the maximum product subarray from the given an array that contains both negative and positive integers.
 */

public class MaximumSubProduct {
	static int maxproduct(int arr[]) {
		int n=arr.length;
		
		int product1=arr[0];
		int product2=arr[0];
		int ans=arr[0];
		for(int i=1;i<n;i++) {
			int product=Math.max(arr[i], Math.max(product1*arr[i], product2*arr[i]));
			product2=Math.min(arr[i], Math.min(product1*arr[i], product2*arr[i]));
			product1=product;
			
			ans=Math.max(ans, product1);
		}
		return ans;
	}

	public static void main(String[] args) {
		int nums[] = {1,2,-3,0,-4,-5,-2,-1};
		int result = maxproduct(nums);
		System.out.print("The maximum product subarray is: "+result);

	}

}
