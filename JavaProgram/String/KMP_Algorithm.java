package JavaProgram.String;

/*
 * Problem Statement: Implement the Knuth-Morris-Pratt( KMP ) string matching algorithm.
 */

public class KMP_Algorithm {
	
	static int kmp(String str,String pat) {
		int i=0;
		int j=0;
		int n=str.length();
		int m=pat.length();
		pat=' '+pat;
		// prefix array
		int prefix[]=new int[m+1];
		for(i=2;i<=m;i++) {
			while(j<=m&&pat.charAt(j+1)==pat.charAt(i))
				prefix[i++]=++j;
			j=0;
		}
		
		for(i=0;i<n;i++) {
			if(pat.charAt(j+1)!=str.charAt(i)) {
				while(j!=0&&pat.charAt(j+1)!=str.charAt(i))
					j=prefix[j];
			}
			j++;
			if(j==m)
				return i-m+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		String str="aaaaaaaamaaaaaab";
		String pattern="aaaaaab";
		int ans=kmp(str,pattern);
		if (ans == -1) 
			System.out.println("The pattern is not found");
		
		else 
			System.out.println("The pattern "+pattern+" is found in the given string "+str+" at "+ans);

	}

}
