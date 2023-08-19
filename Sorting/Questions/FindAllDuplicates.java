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
				result.add(arr[i]);
				i++;
				}
			}
			else {i++;}
		}
		return result;
	}
public static void main(String[] args) {
	int[]arr= {1,1,4,4,5,7,5};
	System.out.println(findallduplicates(arr));
}

}
