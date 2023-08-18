package Basics;

public class BinarySearchRecursive {
static int BinSearch(int[] arr,int target,int start, int end) {
	if(start>end) {return -1;}
	int mid=start+(end-start)/2;
	if(target==arr[mid]) {return mid;}
	if(target<arr[mid]) {return BinSearch(arr,target,start,mid-1);}
	if(target>arr[mid]) {return BinSearch(arr,target,mid+1,end);}
	return mid;
}
public static void main(String[]args) {
	int[] arr=new int[] {2,3,4,5};
	System.out.println(BinSearch(arr,3,0,arr.length-1));
}
}
