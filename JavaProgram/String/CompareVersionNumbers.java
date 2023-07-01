package JavaProgram.String;

public class CompareVersionNumbers {
	
	static int compareversion(String version1,String version2) {
		// split() method return array substring
		String [] s1=version1.split("\\.");
		String [] s2=version2.split("\\.");
		
		int maxlength=Math.max(s1.length,s2.length);
		
		for(int i=0;i<maxlength;i++) {
			
			int v1=i<s1.length?Integer.parseInt(s1[i]):0;
			int v2=i<s2.length?Integer.parseInt(s2[i]):0;
			
			if(v1>v2)
				return 1;
			else if(v2>v1)
				return -1;
			}
		return 0;
	}

	public static void main(String[] args) {
		String version1="1.0";
		String version2="1.0.0";
		int ans=compareversion(version1,version2);
		
		if(ans==0) {
			System.out.println(ans+" : because both versions are same");
		}
		else if(ans==1) {
			System.out.println(ans+" : because version1 > version2");
		}
		else
			System.out.println(ans+" : because version 1 < version 2");
		}

}
