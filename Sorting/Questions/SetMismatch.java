package Questions;
import java.util.*;
//https://leetcode.com/problems/set-mismatch/
public class SetMismatch {
	static int[] setmismatch(int[]arr) {
		int[]answer=new int[] {-1,-1};
		int i=0;
		while(i<arr.length) {
			if(arr[i]!=i+1 && arr[arr[i]-1]!=arr[i]) {
				int temp=arr[arr[i]-1];
				
				arr[arr[i]-1]=arr[i];
				arr[i]=temp;
			}
			else {i++;}
		}
for(int u=0;u<arr.length;u++) {
	if(arr[u]!=u+1) {
		answer[0]=arr[u];
		answer[1]=u+1;
	}
}
	return answer;}
public static void main(String[] args) {
	int[]arr= {1,2,2,4};

	System.out.println(Arrays.toString(setmismatch(arr)));
}

}
