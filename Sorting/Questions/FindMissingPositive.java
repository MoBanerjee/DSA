package Questions;

import java.util.Arrays;
//https://leetcode.com/problems/first-missing-positive/
public class FindMissingPositive {
static int findpositive(int[]arr) {
	int i=0;
	int n=arr.length;
	while(i<arr.length) {
		if(arr[i]<=0 ||arr[i]>n) {

			i++;
			continue;
		}
		if(arr[i]!=i+1 && arr[arr[i]-1]!=arr[i]) {
			
			int temp=arr[i];
			
			arr[i]=arr[temp-1];
			arr[temp-1]=temp;
		}
		else {i++;}
		
	}

	for(int y=0;y<n;y++) {
		if(arr[y]!=y+1) {
			return (y+1);
		}
	}
	return n+1;
}

public static void main(String[] args) {
	int[]arr= {7,-90,89,9,1,2,3,4,5,6,8,11};

	System.out.println(findpositive(arr));
	
	
	}
}

