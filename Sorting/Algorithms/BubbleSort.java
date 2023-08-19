package Algorithms;

import java.util.Arrays;
//Space complexity= O(1)..inplace sorting algo cz no extra space reqd for copying array and likewise stuff
// Best case tc= O(n) and worst case tc= O(nsqr)
public class BubbleSort {
static void bubblesort(int []arr) {
	int n=arr.length;
	boolean swap=false;
	for(int i=0;i<n;i++) {
		swap=false;
		for(int y=0;y<n-1-i;y++) {
			if(arr[y]>arr[y+1]) {
				int temp=arr[y+1];
				arr[y+1]=arr[y];
				arr[y]=temp;
				swap=true;
				
			}
		}
		if(!swap) {break;}
	}
}
public static void main(String[] args) {
	int[]arr= {1,3,42,5,0,6};
	bubblesort(arr);
	System.out.println(Arrays.toString(arr));
}
}
