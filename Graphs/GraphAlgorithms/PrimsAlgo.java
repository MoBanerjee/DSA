package GraphAlgorithms;
import java.util.*;

import javafx.util.Pair;
import javafx.util.Triplet;
public class PrimsAlgo {
	public static int spanningTree(int V,
            ArrayList<ArrayList<ArrayList<Integer>>> adj, ArrayList<Pair<Integer,Integer>> arr) {
		PriorityQueue<Triplet<Integer,Integer,Integer>> pq= new PriorityQueue<>();
		int[]vis=new int[V];
		int sum=0;
		pq.add(new Triplet<>(0,4,-1));
		while(!pq.isEmpty()) {
			Triplet<Integer,Integer,Integer> t=pq.poll();
			int weight=t.getValue0();
			int node=t.getValue1();
			int parent=t.getValue2();
			if(vis[node]==1)continue;
			if(parent!=-1)arr.add(new Pair<>(node,parent));
			sum+=weight;
			vis[node]=1;
			for(ArrayList<Integer> part:adj.get(node)) {
				int cost=part.get(1);
				int to=part.get(0);
				if(vis[to]==0)
				pq.add(new Triplet<>(cost,to,node));
			}
		}
		return sum;
	}
	public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
        int[][] edges =  {{0, 1, 2}, {0, 2, 1}, {1, 2, 1}, {2, 3, 2}, {3, 4, 1}, {4, 2, 2}};

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<ArrayList<Integer>>());
        }

        for (int i = 0; i < 6; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];

            ArrayList<Integer> tmp1 = new ArrayList<Integer>();
            ArrayList<Integer> tmp2 = new ArrayList<Integer>();
            tmp1.add(v);
            tmp1.add(w);

            tmp2.add(u);
            tmp2.add(w);

            adj.get(u).add(tmp1);
            adj.get(v).add(tmp2);
        }
        ArrayList<Pair<Integer,Integer>> arr=new ArrayList<>();
        
        int sum = spanningTree(V, adj,arr);
        System.out.println("The sum of all the edge weights: " + sum);
        System.out.println(arr);
    }
}
