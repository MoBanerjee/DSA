package Algorithms;

import java.util.Arrays;
//Tc-Best-O(nsqr)
//Worst-O(nsqr)
//Average-O(nsqr)
//Space-O(1)
public class SelectionSort {
	static void selsort(int[]arr) {
		int n=arr.length;
		for(int u=0;u<n-1;u++) {
			int max=0;
			for(int i=0;i<n-u;i++) {
				if(arr[i]>arr[max])max=i;
			}
			if(n-1-u!=max) {
				int temp=arr[n-1-u];
				arr[n-1-u]=arr[max];
				arr[max]=temp;
			}
		}
	}
	public static void main(String[] args) {
		int[]arr= {1,3,42,5,10,7};
		selsort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
