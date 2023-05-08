package JavaProgram.patterns;
import java.util.Scanner;

public class UpperTriangle {
	public static void print(int n) {
		for(int i=n;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		System.out.print("enter the size for Upper Triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n);
		
	}

}

