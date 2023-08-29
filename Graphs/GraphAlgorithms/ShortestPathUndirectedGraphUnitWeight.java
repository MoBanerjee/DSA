package GraphAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// G-28
public class ShortestPathUndirectedGraphUnitWeight {
	public static int[] shortestdistance(int[][] edges,int n,int m ,int src) {
		ArrayList<ArrayList<Integer>> adjlist=new ArrayList<>();
		for(int i=0;i<n;i++) {
			adjlist.add(new ArrayList<Integer>());
			
		}
		for(int j=0;j<m;j++) {
			adjlist.get(edges[j][0]).add(edges[j][1]);
			adjlist.get(edges[j][1]).add(edges[j][0]);
		}
	
		int [] distances=new int[n];
		for(int k=0;k<n;k++) {
			distances[k]=(-1);
		}
		Queue<Integer>q=new LinkedList<>();
		distances[src]=0;
		q.add(src);
		while(!q.isEmpty()) {
			int temp=q.poll();
			for(int x:adjlist.get(temp)) {
				if(distances[x]!=-1)continue;
				distances[x]=distances[temp]+1;
				q.add(x);
				
			}
		}
		return distances;
		
	}
	public static void main(String[] args) {
		int n = 8, m = 10;
		int[][]Edges =new int[][] {{1,0},{2,1},{0,3},{3,7},{3,4},{7,4},{7,6},{4,5},{4,6},{6,5}};
		int[][]edges2=new int[][] {{0,1},{0,2}};
		int[] ans=shortestdistance(edges2,8,2,0);
		System.out.println(Arrays.toString(ans));
	}
	
}
