package JavaProgram.Array;

public class ReverseCountPairs {
	
	static int reversepairs(int arr[]) {
		int n=arr.length;
		int countpairs=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>2*arr[j]) {
					countpairs++;
				}
			}
		}
		return countpairs;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,1,2,3,1,2};
		
		System.out.println("The total reverse pairs are : "+reversepairs(arr));

	}

}
