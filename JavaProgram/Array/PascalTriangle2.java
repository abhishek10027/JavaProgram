package JavaProgram.Array;
import java.util.*;
public class PascalTriangle2 {
	// this is for NCR formula
		static int ncr(int n,int r) {
			long result=1;
			for(int i=0;i<r;i++) {
				result=result*(n-i);
				result=result/(i+1);
			}
			return (int)result;
		}
		public static List<List<Integer>>pascaltriangle(int n){
			List<List<Integer>>pt=new ArrayList<>();
			for(int row=1;row<=n;row++) {
				List<Integer>templist=new ArrayList<>();
				for(int col=1;col<=row;col++) {
					templist.add(ncr(row-1,col-1));
				}
				pt.add(templist);
				
			}
			return pt;
		}
		

	public static void main(String[] args) {
		
		System.out.println("Enter the size of the pacsal triangle:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		// it will print  the entire pascal's triangle
		
		System.out.println("***********The pacsal triangle is***********\n ");
		
		List<List<Integer>> printtriangle = pascaltriangle(n);
        for (List<Integer> i : printtriangle) {
            for (int ele : i) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
		



	}

}
