package GraphQs;
import java.util.ArrayList;

import GraphAlgorithms.DisjointSetUnionbyRankandUnionbySize;
import javafx.util.Pair;
public class NumberOfProvincesusingDisjointSetDS {
	public static int kruskal(int V,
            ArrayList<ArrayList<Integer>> adj,int base) {
		
		int provinces=0;
		ArrayList<Pair<Integer,Integer>> listofedges=new ArrayList<>();
		for(int i=0;i<V;i++) {
			for(int part: adj.get(i)) {
				listofedges.add(new Pair<>(i,part));
			}
		}
		DisjointSetUnionbyRankandUnionbySize dj=new DisjointSetUnionbyRankandUnionbySize(V);
		for(Pair<Integer,Integer> p:listofedges) {
			dj.UnionbySize(p.getValue0(), p.getValue1());
			
		}
		if(base==0) {
		for(int i=0;i<V;i++) {
			if(dj.parent.get(i)==i)provinces++;
		}}
		else {
			for(int i=1;i<V+1;i++) {
				if(dj.parent.get(i)==i)provinces++;
			}
		}
		
	return provinces;}
	public static void main(String[] args) {
		int n=7;
		ArrayList<ArrayList<Integer>> adjlist=new ArrayList<>();
		for(int i=0;i<=n;i++) {
			adjlist.add(new ArrayList<Integer>());
			
		}
		
		adjlist.get(1).add(2);
		
		
		adjlist.get(2).add(1);
		
		
		adjlist.get(2).add(3);
		adjlist.get(3).add(2);
		adjlist.get(4).add(5);
		adjlist.get(5).add(4);
		adjlist.get(6).add(7);
		adjlist.get(7).add(6);
		System.out.println(kruskal(n,adjlist,0));
	}
		

}
