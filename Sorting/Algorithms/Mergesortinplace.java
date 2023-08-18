package Algorithms;

import java.util.Arrays;

public class Mergesortinplace {
	public static void main(String[] args) {
		int[]arr=new int[]{1,2,3,90,6,10,0};
		mergesort2(arr,0,arr.length-1);
		System.out.print(Arrays.toString(arr));
	}
	static void mergesort2(int[]arr,int start,int end) {
		if(start==end) {return;}
		int mid=1+start+(end-start)/2;
		mergesort2(arr,start,mid-1);
		mergesort2(arr,mid,end);
		merger2(arr,start,mid,end);
		
		
				
	}

	private static void merger2(int[] arr, int start, int mid, int end) {
		// TODO Auto-generated method stub
		int[]temp=new int[end-start+1];
		int x=start;
		int y=mid;
		int z=0;
		while(x<mid && y<end+1) {
			if(arr[x]<arr[y]) {
				temp[z]=arr[x];
				x++;
				z++;
				
			}
			else {
				temp[z]=arr[y];
				z++;
				y++;
			}
		}
		
		while(x<mid) {
			temp[z]=arr[x];
			x++;
			z++;
			
		}
		while(y<end+1) {
			temp[z]=arr[y];
			y++;
			z++;
			
		}
		for(int k=0;k<temp.length;k++) {
			arr[start+k]=temp[k];
		}
		

	}

	

}
