package Basics;

public class Sortedornot {
static boolean sortedchecker(int[] arr,int i) {
	if(i<arr.length-1 &&  arr[i]<=arr[i+1] )
	return sortedchecker(arr,i+1);
	if(i==arr.length-1)return true;
	return false;
	}
public static void main(String[] args) {
	int[]x=new int[] {0,1,5,3};
	boolean o=sortedchecker(x,0);
	System.out.println(o);
}
}

