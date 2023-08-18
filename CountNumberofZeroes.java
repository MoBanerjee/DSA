package Basics;

public class CountNumberofZeroes {
	static int counter(int n) {
		if(n==0)return 1;
		return helper(n,0);
		
	}

	private static int helper(int n, int i) {
		// TODO Auto-generated method stub
//		if(n%10==n)return i;
		if(n==0)return i;
		if(n%10==0)return helper(n/10,i+1);
		if(n%10!=0)return helper(n/10,i);
	return 0;
	}
	public static void main(String[] args) {
		System.out.println(counter(404));
	}

}
