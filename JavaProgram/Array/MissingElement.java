package JavaProgram.Array;

public class MissingElement {
	static int missing(int arr[]) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			 int flag=0;
			 for(int j=0;j<n-1;j++) {
				 if(arr[j]==i) {
						flag=1;
						break;
					}
				 
			 }
			 if(flag==0) {
				 return i;
			 }
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,6};
		System.out.print("the missing element is: "+missing(arr));
		

	}

}
