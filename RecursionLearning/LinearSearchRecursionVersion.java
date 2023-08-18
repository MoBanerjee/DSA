package Basics;

public class LinearSearchRecursionVersion {
	static int LinSearch(int [] arr,int target,int index) {
		if(index>arr.length-1 )return -1;
		if( arr[index]==target) {
			return index;
		}
		return LinSearch(arr,target,index+1);
	}
public static void main(String[] args) {
	int[]arr=new int[] {1,4,2,35,6,90};
	System.out.println(LinSearch(arr,35,0));
}
}
