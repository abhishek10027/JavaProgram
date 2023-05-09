package JavaProgram.Array;

public class MaxElementInArray {
	static int max(int arr[]) {
		int maxval=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>maxval) {
				maxval=arr[i];
			}
		}
		return maxval;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,8,5,6,7};
		System.out.println("The maxmum of the given array is:"+max(arr));
	}

}
