package GraphAlgorithms;

import java.util.ArrayList;

import javafx.util.Pair;

public class ShortestPathDAGMyVersionPerhapsNotSoEfficientButStill {
	
	public static int[]shortest(int N, int M, int[][] edges,int start){
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
		int[]dis=new int[N];
		
		for(int j=0;j<N;j++)dis[j]=(int)(1e9);
		dis[start]=0;
		dfs(dis,adjl,start);
		return dis;
	}

	private static void dfs(int[] dis, ArrayList<ArrayList<Pair<Integer, Integer>>> adjl, int start) {
		// TODO Auto-generated method stub
		for(Pair<Integer,Integer> u:adjl.get(start)) {
			if(dis[start]+u.getValue1()<dis[u.getValue0()])dis[u.getValue0()]=dis[start]+u.getValue1();
		dfs(dis,adjl,u.getValue0());
		}
		
		
		
	}
	public static void main(String[] args) {
		 int n = 6, m = 7;
		    int[][] edge = {{0,1,2},{0,4,1},{4,5,4},{4,2,2},{1,2,3},{2,3,6},{5,3,1}};
		    int res[] = shortest(n, m, edge,0);
		    for (int i = 0; i < n; i++) {
		      System.out.print(res[i] + " ");
		    }
		    System.out.println();
		  }
	

}
