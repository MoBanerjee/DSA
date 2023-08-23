package GraphQs;
import java.util.*;
public class CycleDetectionUndirectedGraphDFSrecursive {
	static boolean cycledetecthelp(int node, int parent,ArrayList<ArrayList<Integer>> adjlist,boolean[]vis) {

		vis[node]=true;

			for(int id:adjlist.get(node)) {
				if(vis[id] && id!=parent)return true;
				else if(vis[id])continue;
				else {
					if(cycledetecthelp(id,node,adjlist,vis))return true;
					
				}
			}

		return false;
	}
	static boolean cycledetectmain(ArrayList<ArrayList<Integer>> adjlist) {
		int n=adjlist.size();
		boolean[]vis=new boolean[n];
		for(int v=0;v<n;v++) {
			if(vis[v])continue;
			if(cycledetecthelp(v,-1,adjlist,vis))return true;
		}
		return false;
		
	}
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
		
		System.out.println(cycledetectmain(adjlist));
	
		
		
	}

}
