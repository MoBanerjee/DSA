package Questions;
import java.util.*;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllDuplicates {
	static List<Integer> findallduplicates(int[]arr) {
		ArrayList<Integer> result=new ArrayList<>();
		int i=0;
		while(i<arr.length) {
			if(arr[i]!=i+1) {if(arr[arr[i]-1]!=arr[i]) {
				int temp=arr[arr[i]-1];
				
				arr[arr[i]-1]=arr[i];
				arr[i]=temp;
			}else{
				i++;
				}
			}
			else {i++;}
		}
		for(int h=0;h<arr.length;h++) {
			if(arr[h]!=h+1)result.add(arr[h]);
		}
		return result;
	}
public static void main(String[] args) {
	int[]arr= {4,3,2,7,8,2,3,1};
	System.out.println(findallduplicates(arr));
}

}
