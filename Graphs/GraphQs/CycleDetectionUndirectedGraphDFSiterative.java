package GraphQs;


import java.util.*;

import javafx.util.Pair;

public class CycleDetectionUndirectedGraphDFSiterative {

	static boolean cycledetect(ArrayList<ArrayList<Integer>> adjlist) {
		int n=adjlist.size();
		boolean []varray=new boolean [n];
		for(int ver=0;ver<n;ver++) {
			if(varray[ver])continue;
		Stack<Pair<Integer,Integer>> sholder=new Stack<>();
		sholder.push(new Pair<>(ver,-1));
		
		
		while(!sholder.isEmpty()) {
			Pair<Integer,Integer> temp=sholder.pop();
			int k=temp.getValue0();
			int parent=temp.getValue1();
			if(varray[k])continue;
	
			varray[k]=true;
			for(int o:adjlist.get(k)) {
				
				sholder.push(new Pair<>(o,k));
				if(varray[o]&& o!=parent)return true;
				
				
			}
		}
		
	}return false;}
	
	
	public static void main(String[] args) {
		int n=4;
		ArrayList<ArrayList<Integer>> adjlist=new ArrayList<>();
		for(int i=0;i<=n;i++) {
			adjlist.add(new ArrayList<Integer>());
			
		}
		//edge 1--2
		adjlist.get(1).add(2);
		adjlist.get(2).add(1);
		//edge 1--3
		adjlist.get(1).add(3);
		adjlist.get(3).add(1);
		//edge 2--3
		adjlist.get(2).add(3);
		adjlist.get(3).add(2);
		
		System.out.println(cycledetect(adjlist));
	
		
		
	}

}
