package GraphAlgorithms;
import java.util.*;

import javafx.util.Pair;
public class KruskalsAlgo {
	
	public static int kruskal(int V,
            ArrayList<ArrayList<ArrayList<Integer>>> adj,ArrayList<Pair<Integer,Integer>> mst) {
		
		int sum=0;
		ArrayList<EdgesforKruskal> listofedges=new ArrayList<>();
		for(int i=0;i<V;i++) {
			for(ArrayList<Integer> part: adj.get(i)) {
				int w=part.get(1);
				int end=part.get(0);
				listofedges.add(new EdgesforKruskal(i,end,w));
			}
		}
		Collections.sort(listofedges);
		DisjointSetUnionbyRankandUnionbySize dj=new DisjointSetUnionbyRankandUnionbySize(V);
		for(EdgesforKruskal e:listofedges) {
			if(dj.findUPar(e.from)!=dj.findUPar(e.to)) {
				mst.add(e.p);
				sum+=e.wt;
				dj.UnionbySize(e.from, e.to);
				
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
        
        int sum = kruskal(V, adj,arr);
        System.out.println("The sum of all the edge weights: " + sum);
        System.out.println(arr);
    }

}
