package Algorithms;

import java.util.Arrays;

public class SelectionSortRecursive {
	static void ssrec(int[] arr,int r,int c,int maxindex) {
		if(r==0)return;
		if(c<=r) {
			if(arr[c]>arr[maxindex])
		
			{ssrec(arr,r,c+1,c);}
			else {ssrec(arr,r,c+1,maxindex);}
		}
		else {
			int temp=arr[maxindex];
			arr[maxindex]=arr[r];
			arr[r]=temp;
		ssrec(arr,r-1,0,0);}
	}
	public static void main(String[] args) {
		int[]arr=new int[] {1,2,5,3,45,6};
	
		ssrec(arr,arr.length-1,0,0);
		System.out.println(Arrays.toString(arr));
	
		
	}

}
