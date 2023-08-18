package Basics;

public class CountNumberOfSteps {
	static int stepcounter(int n) {
		return helper(n,0);
	}

	private static int helper(int n, int i) {
		// TODO Auto-generated method stub
		if(n==0)return i;
		if(n%2==0)return helper(n/2,i+1);
		return helper(n-1,i+1);
		
	}
	public static void main(String[] args) {
		System.out.println(stepcounter(14));
	}

}
