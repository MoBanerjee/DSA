package Algorithms;

import java.util.Arrays;

public class BubbleSortRecursive{
	static void bbsrec(int[] arr,int r,int c) {
		if(r==0)return;
		if(c<r) {
			if(arr[c]>arr[c+1]) {
				int temp=arr[c];
				arr[c]=arr[c+1];
				arr[c+1]=temp;
				
			}
		
			bbsrec(arr,r,c+1);
		}
		else {
			
		bbsrec(arr,r-1,0);}
	}
	public static void main(String[] args) {
		int[]arr=new int[] {1,2,5,3};
	
		bbsrec(arr,3,0);
		System.out.println(Arrays.toString(arr));
	
		
	}

}
