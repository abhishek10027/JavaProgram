package JavaProgram.Array;

public class CountSumArrays {
	static int countsubarrays(int arr[],int sum ) {
		int count=0;  
		
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sumcnt=0;
				for(int k=i;k<=j;k++) {
					sumcnt=sumcnt+arr[k];
					
					
				}
				if (sumcnt==sum) {
					count ++;
					
				}
			}
			
		}
		// it will return/print the total count sum arrays which are equal to sum value.
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 4,1,2,-5,-3,9};
        int sum = 7;
        int cnt = countsubarrays(arr, sum);
        System.out.println("The number of subarrays is: " + cnt);
		}

	}
