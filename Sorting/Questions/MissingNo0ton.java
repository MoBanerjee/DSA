package Algorithms;

import java.util.Arrays;

public class MissingNo0ton {
	static int missingno(int[]arr) {
		int i=0;
		int n=arr.length;
		while(i<arr.length) {
			if(arr[i]==n) {
				i++;
			
			}
			else if(arr[i]!=i) {
				int temp=arr[arr[i]];
				
				arr[arr[i]]=arr[i];
				arr[i]=temp;
			}
			else {i++;}
		}
		i=0;
		while(i<arr.length) {
			if(arr[i]==i) {
				i++;
			}
			else {
				return i;
			}
		}
		return n;
	}
	public static void main(String[] args) {
		int[]arr= {3,0,4,5,2,6};
		int[]arr2= {3,1,4,5,2,0};
		System.out.println(missingno(arr));
		System.out.println(missingno(arr2));
	}

}
