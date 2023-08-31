package GraphAlgorithms;

import java.util.*;

import javafx.util.Pair;

public class ShortestPathDAGTopoSortWithWeightsAnySrc {
	private static void toposort(int node,ArrayList<ArrayList<Pair<Integer,Integer>>> al,int[]vis,Stack<Integer> st) {
		for(Pair<Integer,Integer> p:al.get(node)) {
			if(vis[p.getValue0()]==1)continue;
			toposort(p.getValue0(),al,vis,st);
		}
		vis[node]=1;
		st.add(node);
		
	}
	public static int[] shortestdist(int N, int M, int[][] edges,int start) {
		ArrayList<ArrayList<Pair<Integer,Integer>>> adjl=new ArrayList<>();
		for(int y=0;y<N;y++) {
			adjl.add(new ArrayList<>());
		}
		for(int i=0;i<M;i++) {
			int first=edges[i][0];
			int second=edges[i][1];
			int weight=edges[i][2];
			adjl.get(first).add(new Pair<>(second,weight));
			
		}
		int[]vis=new int[N];
		Stack<Integer> s=new Stack<>();
		for(int x=0;x<N;x++) {
			if(vis[x]==1)continue;
			toposort(x,adjl,vis,s);
		}
		int[]dis=new int[N];
	
		for(int j=0;j<N;j++)dis[j]=(int)(1e9);
		dis[start]=0;
		while(!s.isEmpty()) {
			int temp=s.pop();
			for(Pair<Integer,Integer> pa:adjl.get(temp)) {
				int nodenext=pa.getValue0();
				int wt=pa.getValue1();
				if(dis[temp]+wt<dis[nodenext])dis[nodenext]=dis[temp]+wt;
				
			}
		}
		 for (int i = 0; i < N; i++) {
		      if (dis[i] == 1e9) dis[i] = -1;
		    }
		return dis;
		
	}
	public static void main(String[] args) {
		 int n = 6, m = 7;
		    int[][] edge = {{0,1,2},{0,4,1},{4,5,4},{4,2,2},{1,2,3},{2,3,6},{5,3,1}};
		    int res[] = shortestdist(n, m, edge,0);
		    for (int i = 0; i < n; i++) {
		      System.out.print(res[i] + " ");
		    }
		    System.out.println();
		  }
		
	

}
