package GraphQs;

import java.util.*;

import javafx.util.Pair;


public class MinimumMultiplicationstoReachEnd {
	public static int mulmin(int[] arr, 
		    int start, int end) {
	Queue<Pair<Integer,Integer>> q=new LinkedList<>();
	q.add(new Pair<>(0,start));
	int[]vis=new int[100000];
	vis[start]=1;
	while(!q.isEmpty()) {
		Pair<Integer, Integer> p=q.poll();
		int steps=p.getValue0();
		int node=p.getValue1();
		for(int i=0;i<arr.length;i++) {
			int newnode=(node*arr[i])%100000;
			if(vis[newnode]==1)continue;
			if(newnode==end)return steps+1;
			vis[newnode]=1;
			q.add(new Pair<>(steps+1,newnode));
			
			
		}
		
	}
	return -1;
	}
	public static void main(String[] args) {
		
	
	 int start=3, end=30;
     int[] arr = {2,5,7};

     int ans = mulmin(arr,start,end);
     
     System.out.print(ans);}
	

}
