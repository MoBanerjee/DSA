package Basics;

public class RotatedBinarySearch {
	static int searcher(int[]array,int target,int s,int e) {
		if(s==e) {
		
			if(array[s]==target)return s;
			else return -1;
		}
		int mid=s+(e-s)/2;
	
		if(array[mid]==target) {
		
			return mid;
		
		}
		if(array[s]<array[mid-1]) {

			if(target>=array[s] && target<=array[mid-1]) {
				return searcher(array,target,s,mid-1);
			}
			else return searcher(array,target,mid+1,e);
		}
		else {
		
			if(target>=array[mid+1] && target<=array[e]) {
				return searcher(array,target,mid+1,e);
			}
			else return searcher(array,target,s,mid-1);
		}
			
		}
		
	public static void main(String[] args) {
		int[]test= {4,5,6,7,1,2,3};
		int[]test2= {23,23,24,21,22};
		System.out.println(searcher(test,5,0,test.length-1));
	}

}
