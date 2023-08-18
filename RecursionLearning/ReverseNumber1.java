package Basics;

public class ReverseNumber1 {
	static int Revwithhelper(int n) {
		int length=(int)(Math.log10(n))+1;
		return helper(n,length);
		
	}

	private static int helper(int n, int length) {
		// TODO Auto-generated method stub
		if(n/10==0)return n;
		return (n%10)*(int)(Math.pow(10, length-1))+helper(n/10,length-1);
	}
	
	public static void main(String[] args) {
		System.out.println(Revwithhelper(1386));
		System.out.println(Revwithhelper(13789));
	}
	

}
