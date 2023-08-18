package Algorithms;

import java.util.Arrays;

public class CyclicSort {
	static void cyclesort(int[]arr) {
		int i=0;
		while(i<arr.length) {
			if(arr[i]!=i+1) {
				int temp=arr[arr[i]-1];
				
				arr[arr[i]-1]=arr[i];
				arr[i]=temp;
			}
			else {i++;}
		}
	}
public static void main(String[] args) {
	int[]arr= {3,1,4,5,2,6};
	cyclesort(arr);
	System.out.println(Arrays.toString(arr));
}
}
