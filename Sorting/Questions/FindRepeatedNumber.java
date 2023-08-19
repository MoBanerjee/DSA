package Algorithms;

import java.util.*;
//https://leetcode.com/problems/find-the-duplicate-number/
public class FindRepeatedNumber {
	static int findduplicate(int[]arr) {
		int i=0;
		while(i<arr.length) {
			if(arr[i]!=i+1 && arr[arr[i]-1]!=arr[i]) {
				int temp=arr[arr[i]-1];
				
				arr[arr[i]-1]=arr[i];
				arr[i]=temp;
			}
			else {i++;}
		}
		return arr[arr.length-1];
	}
public static void main(String[] args) {
	int[]arr= {3,1,4,5,2,1,6};
	findduplicate(arr);
	System.out.println(findduplicate(arr));
}
}
