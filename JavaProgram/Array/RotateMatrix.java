package JavaProgram.Array;

public class RotateMatrix {
	static void rotate(int matrix[][]) {
		int n=matrix.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
				
			}
		}
		
        int ind = n-1;
        for (int i=0;i<n;i++){
            for (int j=0;j<n/2;j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[ind][i];
                matrix[ind][i] = temp;
                ind--;
            }
            ind = n-1;
        }
			
		
	}

	public static void main(String[] args) {
		 int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
	        int n = matrix.length;
	 
	        rotate(matrix);
	        System.out.println( "Matrix after 90 degree rotation:");
	        for (int i=0;i<n;i++){
	            for (int j=0;j<n;j++){
	                System.out.print(matrix[i][j]+" ");
	            }
	            System.out.println();
	        }

	}

}
