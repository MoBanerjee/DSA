package oneDdp;

import java.util.Arrays;
//complexities for all 4 versions exactly same as fibonacci dp problem as this is basically fibo only
public class FrogJump1or2steps {
public static int fjrecur(int ind,int[] height) {
	if(ind==1)return 0;
	if(ind==2)return Math.absExact(height[1]-height[0]);
	int left=fjrecur(ind-1,height)+Math.absExact(height[ind-1]-height[ind-2]);
	int right=fjrecur(ind-2,height)+Math.absExact(height[ind-1]-height[ind-3]);
	return Math.min(left, right);
}
public static int fjmemo(int ind,int[] height,int[]dp) {
	if(dp[ind-1]!=-1)return dp[ind-1];
	if(ind==1)return 0;
	if(ind==2) {dp[1]= Math.absExact(height[1]-height[0]);
		return Math.absExact(height[1]-height[0]);}
	if(dp[ind-1]!=-1)return dp[ind-1];
	int left=fjrecur(ind-1,height)+Math.absExact(height[ind-1]-height[ind-2]);
	int right=fjrecur(ind-2,height)+Math.absExact(height[ind-1]-height[ind-3]);
	dp[ind-1]=Math.min(left, right);
	return Math.min(left, right);
}
public static int fjtab(int ind, int[]height) {
	int[]dp=new int[ind];
	Arrays.fill(dp, -1);
	dp[0]=0;
	dp[1]=Math.absExact(height[1]-height[0]);
	for(int y=2;y<ind;y++) {
		dp[y]=Math.min(dp[y-1]+Math.absExact(height[y]-height[y-1]),dp[y-2]+Math.absExact(height[y]-height[y-2]));
		
	}
	return dp[ind-1];
}
public static int fjspaceoptim(int ind,int[]height) {
	int prev2=0;
	int prev=1;
	int index=2;
	while(index!=ind) {
		if(prev+Math.absExact(height[index]-height[index-1])<=prev2+Math.absExact(height[index]-height[index-2])){
		prev=prev+Math.absExact(height[index]-height[index-1]);
		prev2=prev-Math.absExact(height[index]-height[index-1]);
		}
		else {
			int temp=prev;
			prev=prev2+Math.absExact(height[index]-height[index-2]);
			prev2=temp;
			
		}
		index++;
	}
	return prev;
	
}
public static void main(String[] args) {
	  int height[]={30,10,60 , 10 , 60 , 50};
	  int n=height.length;
	  int dp[]=new int[n];
	  Arrays.fill(dp,-1);
	  System.out.println(fjmemo(n,height,dp));
	  System.out.println(fjrecur(n,height));
	  System.out.println(fjtab(n,height));
	  System.out.println(fjspaceoptim(n,height));
}
}
