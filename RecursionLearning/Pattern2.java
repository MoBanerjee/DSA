package Basics;

public class Pattern2 {
	static void pattern1rowcolversion(int r,int c) {
		if(r==0)return;
		if(c<r) {
			
			pattern1rowcolversion(r,c+1);
			System.out.print("*");
		}
		else{
		pattern1rowcolversion(r-1,0);
		System.out.print("\n");}
	}
public static void main(String[] args) {
	pattern1rowcolversion(3,0);
}

}
