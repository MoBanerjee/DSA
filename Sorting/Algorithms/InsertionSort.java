package Algorithms;

import java.util.Arrays;
//Tc-Best-O(n)
//Worst-O(nsqr)
//Average-O(nsqr)
//Space-O(1)
public class InsertionSort {
	static void inssort(int[]arr) {
		int n=arr.length;
		for(int h=1;h<n;h++) {
			for(int i=h;i>0;i--) {
				if(arr[i]<arr[i-1]) {
					int temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
				}
				else {break;}
				
			}
		}
		
	}
	public static void main(String[] args) {
		int[]arr= {1,3,42,5,0,6,7,10};
		
		inssort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
