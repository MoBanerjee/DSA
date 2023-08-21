package GraphQs;
import java.lang.Math;
public class Numberofundirectedgraphs {
	static int numberofgraphs(int n) {
		int x = n * (n - 1) / 2;
		return  (int)Math.pow(2, x);
		
	}
	public static void main(String[] args) {
		System.out.println(numberofgraphs(3));
		
	}

}
