package Algorithms;
//tc is O(nlogn)
//minheapify tc is O(n)
//sc ?
import java.util.Arrays;

public class HeapSortdescending {
	static void minHeapify(int[] A,int n,int i) {
		int smallest=i;
		int left=2*i+1;
		int right=left+1;
		if(left<n && A[left]<A[i]) {
			smallest=left;
		}
		if(right<n && A[right]<A[smallest]) {
			smallest=right;
		}
			
		
			if(smallest!=i) {
				int t=A[smallest];
				A[smallest]=A[i];
				A[i]=t;
				minHeapify(A,n,smallest);
			}
			
		
		
		
	}
	static void heapsort(int[]A,int n) {
		int s=n/2-1;
		for(int i=s;i>=0;i--) {
			minHeapify(A,n,i);
			
		}
		for(int j=n-1;j>=0;j--) {
			
			int t=A[j];
			A[j]=A[0];
			A[0]=t;
			minHeapify(A,j,0);
		}
		
	}
	public static void main(String[] args) {
		int[]test= {5,4,3,2,1,0};
		heapsort(test,test.length);
		System.out.println(Arrays.toString(test));
	}

}

