package oneDdp;
//recursion tc= O(2^n) sc=O(n)
//memoization tc=O(n) sc=O(n)(recursion stack space)+O(n)(dp array)
//tabulation tc=O(n) sc=O(n)(dp array)
//space optimisation tc=O(n) sc=O(1)
import java.util.Arrays;

public class Fibonacci4versionsRecursionMemoTabularSpaceOptim {
	public static int fibrecur(int n) {
		if(n<=1)return n;
		return fibrecur(n-1)+fibrecur(n-2);
	}
	
	public static int fibmemoized(int n,int[]dp) {
		if(n<=1)return n;
		if(dp[n]!=-1) return dp[n];
		return dp[n]=fibmemoized(n-1,dp)+fibmemoized(n-2,dp);
	}
	public static int fibtabular(int n) {
		int[]dp=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int y=2;y<=n;y++) {
			dp[y]=dp[y-1]+dp[y-2];
		}
		return dp[n];
	}
	public static int fibspaceoptim(int n) {
		int prev2=0;
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
		System.out.println(fibrecur(6));
		int[]dp=new int[7];
		Arrays.fill(dp, -1);
		System.out.println(fibmemoized(6,dp));
		System.out.println(fibtabular(6));
		System.out.println(fibspaceoptim(6));
	}
}
