package oneDdp;

import java.util.Arrays;
//complexities for all 4 versions exactly same as fibonacci dp problem as this is basically fibo only
public class ClimbingStairs_LearnHowtoWrite1DRecurrenceRelations {
	public static int climbstairsrecur(int n) {
		if(n==0)return 1;
		if(n==1)return 1;
		
		return climbstairsrecur(n-1)+climbstairsrecur(n-2);
	}
	public static int climbstairsmemo(int n,int[]dp) {
		if(n==0) {
			return 1;}
		if(n==1)return 1;
	
		if(dp[n]!=-1)return dp[n];
		
		return dp[n]=climbstairsmemo(n-1,dp)+climbstairsmemo(n-2,dp);
	}
	public static int climbstairstabular(int n) {
		int[]dp=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int y=2;y<=n;y++) {
		dp[y]=dp[y-1]+dp[y-2];}
		return dp[n];
	}
	public static int climbstairsspaceoptim(int n) {
		int prev2=1;
		int prev=1;
		int index=2;
		while(index!=n+1) {
			prev=prev+prev2;
			prev2=prev-prev2;
			index++;
			
		}
		return prev;
	}
	public static void main(String[] args) {
		System.out.println(climbstairsrecur(5));
		int[]dp=new int[7];
		Arrays.fill(dp, -1);
		System.out.println(climbstairsmemo(5,dp));
		System.out.println(climbstairstabular(5));
		System.out.println(climbstairsspaceoptim(5));
	}

}
