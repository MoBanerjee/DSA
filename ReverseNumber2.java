package Basics;

public class ReverseNumber2 {
	private static int sum=0;
	static int Revwithouthelper(int n) {
		if(n==0)return sum;
		sum=(sum*10)+(n%10);
		Revwithouthelper(n/10);
		return sum;
	}
public static void main(String[] args) {
System.out.println(Revwithouthelper(987));
}
}
