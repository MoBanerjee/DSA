package Algorithms;
//tc is O(nlogn)
//maxheapify tc is O(n)
//sc ?
import java.util.Arrays;

public class HeapSortascending {
	static void maxHeapify(int[] A,int n,int i) {
		int largest=i;
		int left=2*i+1;
		int right=left+1;
		if(left<n && A[left]>A[i]) {
			largest=left;
		}
		if(right<n && A[right]>A[largest]) {
			largest=right;
		}
			
		
			if(largest!=i) {
				int t=A[largest];
				A[largest]=A[i];
				A[i]=t;
				maxHeapify(A,n,largest);
			}
			
		
		
		
	}
	static void heapsort(int[]A,int n) {
		int s=n/2-1;
		for(int i=s;i>=0;i--) {
			maxHeapify(A,n,i);
			
		}
		for(int j=n-1;j>=0;j--) {
			
			int t=A[j];
			A[j]=A[0];
			A[0]=t;
			maxHeapify(A,j,0);
		}
		
	}
	public static void main(String[] args) {
		int[]test= {5,4,3,2,1,0};
		heapsort(test,test.length);
		System.out.println(Arrays.toString(test));
	}

}
