package JavaProgram;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter your numbers:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			int count =0;
			for(int div=1;div<=num;div++) {
				if(num % div==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("prime");
			}else {
				System.out.println("not prime");
				}
		}
	}

}
