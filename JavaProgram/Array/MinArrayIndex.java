package JavaProgram.Array;

public class MinArrayIndex {
	public static int minindex(int arr[]) {
		int n=arr.length;
		int min=-1;
		int index=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				index=index+min;
				min=0;
			}
			else {
				min=1;
			}
		}
		if(index==0) {
			return -1;
			
		}
		else if(index==-1) {
			return 0;
		}
		else {
			return (index+min);
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,5,7,9};
		System.out.println("The index that containing min value in given array: "+minindex(arr));
	}

}
