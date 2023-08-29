package GraphAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
//why do we follow the queue method and
//why not the standard algorithms that we
//are going to learn in the future so if
//you clearly see that since it is
//increasing by plus one as you saw in the
//explanation the queue will always store
//like the first it will store source
//which will take distance zero then the
//next guys who will come at that will
//always come at distance one because the
//edge weight is increasing by one then
//the distance two will come then the
//distance three will come so if you look
//at the queue it's already sorted first
//the source at zero then distance one
//then distance two distance three it's
//already in the sorted order so do you
//need so you don't need something like a
//sorted data structure to sort them in
//distance that is why q does work in a
//proper way and the time complexity taken
//will be similar to what we usually take
//in a bfs algorithm so you can call this
//as a bfs algorithm where we have applied
//a slide of greedy algorithm to make sure
//that we always compress the distance and
//this is how you can easily store it
//and if i talk about the overall space we
//are creating the graph so that's going
//to take some space here using the
//distance by using the queue so these
//three are taking some space and about
//the time complexity it is more uh
//similar to what the bfs generally takes
//which is v plus 2 e so that is what the
//time complexity will be if you omit
//these uh things in overall you can say v
//plus 2 e 
public class ShortestPathUndirectedGraphUnitWeightStriversVersion1e9 {
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
			distances[k]=(int) 1e9;
		}
		Queue<Integer>q=new LinkedList<>();
		distances[src]=0;
		q.add(src);
		while(!q.isEmpty()) {
			int temp=q.poll();
			for(int x:adjlist.get(temp)) {
				if(distances[x]>distances[temp]+1) {
				distances[x]=distances[temp]+1;
				q.add(x);
				
			}
		}}
			for(int i = 0;i<n;i++) {
	            if(distances[i] == 1e9) {
	                distances[i] = -1; 
	            }
	        }
	   
		
	    return distances; }
	public static void main(String[] args) {
		int n = 8, m = 10;
		int[][]Edges =new int[][] {{1,0},{2,1},{0,3},{3,7},{3,4},{7,4},{7,6},{4,5},{4,6},{6,5}};
		int[][]edges2=new int[][] {{0,1},{0,2}};
		int[] ans=shortestdistance(edges2,8,2,0);
		System.out.println(Arrays.toString(ans));
	}
	

}
