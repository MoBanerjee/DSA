package Algorithms;

import java.util.Arrays;

public class Mergesorttotallyinplace {
	public static void main(String[] args) {
		int[]arr=new int[]{5,4,3,5};
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
		int x=start;
		int y=mid;
		int tempo;
		while(x<mid && y<end+1) {
			System.out.println(Arrays.toString(arr));
			if(arr[x]<arr[y]) {
				
				x++;
				
				
			}
			else if(arr[x]==arr[y]) {
				if(x==end-1 && y==end) {
					
					break;}
				tempo=arr[y++];
				for(int g=mid++;g>x;g--) {
					arr[g]=arr[g-1];
				}
				x+=2;
				
				
			}
			else {
				tempo=arr[y++];
				for(int g=mid++;g>x;g--) {
					arr[g]=arr[g-1];
				}
				arr[x]=tempo;
				x++;
			}
		}
		
		

	}

	

}

