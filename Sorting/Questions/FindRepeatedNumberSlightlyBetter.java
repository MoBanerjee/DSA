package Algorithms;

public class FindRepeatedNumberSlightlyBetter {
	static int findduplicate2(int[]arr) {
		int i=0;
		while(i<arr.length) {
			if(arr[i]!=i+1) {if(arr[arr[i]-1]!=arr[i]) {
				int temp=arr[arr[i]-1];
				
				arr[arr[i]-1]=arr[i];
				arr[i]=temp;
			}else{
				return arr[i];
				}
			}
			else {i++;}
		}
		return 0;
	}
public static void main(String[] args) {
	int[]arr= {3,1,4,5,2,6,1};
	findduplicate2(arr);
	System.out.println(findduplicate2(arr));
}

}
