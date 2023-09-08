package GraphQs;
import java.util.*;

import javafx.util.Pair;

public class NetworkDelayTime {
	@SuppressWarnings("serial")
	public static int networkDelayTime(int[][] edges, int n, int k) {
		ArrayList<ArrayList<ArrayList<Integer>>> adj=new ArrayList<>();
		for(int h=0;h<n+1;h++) {
			adj.add(new ArrayList<ArrayList<Integer>>());
		}
		for(int j=0;j<edges.length;j++) {
			int[]i=edges[j];
			adj.get(i[0]).add( new ArrayList<Integer>() {{add(i[1]);add(i[2]);}});
			
			
		}
		int[]dist=new int[n+1];
		for(int i=0;i<n+1;i++)dist[i]=(int)(1e9);
		dist[k]=0;
		PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<>();
		pq.add(new Pair<>(0,k));
		while(!pq.isEmpty()) {
			Pair<Integer,Integer> temppair=pq.poll();
			int temp=temppair.getValue1();
			for(ArrayList<Integer> kt: adj.get(temp) ) {
				int newnode=kt.get(0);
				int distance=kt.get(1);
				if(dist[newnode]>dist[temp]+distance) {dist[newnode]=dist[temp]+distance;
				pq.add(new Pair<>(dist[newnode],newnode));}
				
			}
			}
		int time=0;
		for(int y=1;y<n+1;y++) {
			if(dist[y]==(int)1e9)return -1;
			if(dist[y]>time)time=dist[y];
		}
		return time;
		
	}
	public static void main(String[] args) {
		int[][]arr=new int[][]{{1,2,2},{1,3,1},{3,4,2}};
		int[][]arr2=new int[][] {{1,2,1},{3,2,3}};
		System.out.println(networkDelayTime(arr,4,1));
		System.out.println(networkDelayTime(arr2,3,1));
		
	}

}
