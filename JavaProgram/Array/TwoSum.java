package JavaProgram.Array;

public class TwoSum {
	public static int[] sum(int arr[],int t) {
		int ans[]=new int[2];
		ans[0]=ans[1]=-1;
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(arr[i]+arr[j]==t) {
					arr[0]=i;
					arr[1]=j;
					return ans;
				}
			}
		}
		return ans;
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,9};
		sum(arr,11);
		System.out.println("["+arr[0]+","+arr[1]+"]");
		
	}

}
