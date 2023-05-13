package JavaProgram.Array;

public class SortArrayOf012 {
	public static void sort(int arr[]) {
		int n=arr.length;
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<=i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,1,2,0,0,1,2,0};
		int n=arr.length;
		sort(arr);
		System.out.println("the sorted array is :\n");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
