package Basics;

import java.util.ArrayList;

public class LinSearchMultipleRecursive {
	static void LinSearch(int [] arr,int target,int index) {
		if(index>arr.length-1 )return;
		if( arr[index]==target) {
			indexes.add(index);
		}
		LinSearch(arr,target,index+1);
	}
	static ArrayList<Integer> indexes=new ArrayList<>();
	static ArrayList<Integer> LinSearch2(int [] arr,int target,int index,ArrayList<Integer> indli) {
		if(index>arr.length-1 )return indli;
		if( arr[index]==target) {
			indli.add(index);
		}
		return LinSearch2(arr,target,index+1,indli);
	}
	static ArrayList<Integer> LinSearch3(int [] arr,int target,int index){
		ArrayList<Integer> list=new ArrayList<>();
		if(index>arr.length-1 )return list;
		if( arr[index]==target) {
			list.add(index);
		}
		ArrayList<Integer> below=LinSearch3(arr,target,index+1);
		list.addAll(below);
		return list;
	}
public static void main(String[] args) {
	int[]arr=new int[] {1,4,2,35,6,6,90};
	LinSearch(arr,6,0);
	ArrayList<Integer> temp=new ArrayList<>();
	LinSearch2(arr,6,0,temp);
	System.out.println(indexes);
	System.out.println(temp);
	System.out.println(LinSearch3(arr,6,0));
}

}
