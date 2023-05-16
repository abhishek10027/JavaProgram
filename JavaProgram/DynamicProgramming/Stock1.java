package JavaProgram.DynamicProgramming;

public class Stock1 {
	public static int Maxprofit(int prices[]) {
		int mini=prices[0];
		int maxprofit=0;
		int n=prices.length;
		for(int i=1;i<n;i++) {
			int cost=prices[i]-mini;
			maxprofit=Math.max(maxprofit, cost);
			mini=Math.min(mini,prices[i]);
		}
		return maxprofit;
	}
	public static void main(String args[]) {
		
		int prices[]= {1,4,5,6,8};
		System.out.println("the maximum profit is :"+Maxprofit(prices));
	}

}
