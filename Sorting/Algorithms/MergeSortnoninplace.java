package Algorithms;

import java.util.Arrays;
//Space complexity-: O(n), time complexity-: O(nlogn)
public class MergeSortnoninplace {
	static int[] mergesort1(int[] arr) {
		if(arr.length==1)return arr;
		int mid=arr.length/2;
		int[]lp=mergesort1(Arrays.copyOfRange(arr,0,mid));
		int[]rp=mergesort1(Arrays.copyOfRange(arr, mid, arr.length));
		return merger(lp,rp);
		
	}

	private static int[] merger(int[] left, int[] right) {
		// TODO Auto-generated method stub
		int x=0;
		int y=0;
		int z=0;
		int[]combo=new int[left.length+right.length];
		while(x<left.length && y<right.length) {
			if(left[x]<right[y]) {
				combo[z]=left[x];
				x++;
				z++;
				
			}
			else {
				combo[z]=right[y];
				y++;
				z++;
				
			}
		}
		if(left.length>right.length) {
			while(x<left.length) {
				combo[z]=left[x];
				x++;
				z++;
				
			}
		}
		else if(left.length<right.length) {
			while(y<right.length) {
				combo[z]=right[y];
				y++;
				z++;
				
			}
		}
		return combo;
	}
	public static void main(String[] args) {
		int[]arr=new int[]{1,2,3,90,6,10,0};
		int[]arr2=new int[]{1,2,3,90};
		int[]arr21=new int[]{0,6,10};
		arr = mergesort1(arr);
		System.out.print(Arrays.toString(arr));
		System.out.print(Arrays.toString(merger(arr2,arr21)));
	}

}
