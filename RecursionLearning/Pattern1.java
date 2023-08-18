package Basics;

public class Pattern1 {
	static void pattern1(int n){
		if(n==0)return;
		int k=n;
		while(0!=(k--)) {
			System.out.print("*");
			
			
		}
		System.out.println("");
		pattern1(n-1);
	}
	static void pattern1rowcolversion(int r,int c) {
		if(r==0)return;
		if(c<r) {
			System.out.print("*");
			pattern1rowcolversion(r,c+1);
		}
		else{System.out.print("\n");
		pattern1rowcolversion(r-1,0);}
	}
public static void main(String[] args) {
	pattern1(4);
	pattern1rowcolversion(3,0);
}
}
