package Algorithms;

import java.util.*;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Asked in Google
public class MissingNoRepetitive1ton {
	static List<Integer> missingno2(int[]arr) {
		ArrayList<Integer>result=new ArrayList<>();
		int i=0;
		int n=arr.length;
		while(i<arr.length) {
		 if(arr[i]!=i+1 && arr[arr[i]-1]!=arr[i]) {
				int temp=arr[arr[i]-1];
				
				arr[arr[i]-1]=arr[i];
				arr[i]=temp;
			}
			else {i++;}
		}
		i=0;

		
		while(i<arr.length) {
			if(arr[i]==i+1) {
				i++;
			}
			else {
				result.add(i+1);
			
				i++;
			}
		}
		return result ;
	}
	public static void main(String[] args) {
		int[]arr= {3,1,3,5,5,7,6};
		int[]arr2= {4,4,4,4};
		System.out.println(missingno2(arr));
		System.out.println(missingno2(arr2));
	}


}
