package GraphQs;
import java.util.*;
// tc=O(n+2e)+O(n)
//sc=O(n)+O(n)
import javafx.util.Pair;
public class CycleDetectionUndirectedGraphBFS {
	static boolean cycledetect(ArrayList<ArrayList<Integer>> adjlist) {
		int n=adjlist.size();
		boolean []v=new boolean[n];
		for(int ver=0;ver<n;ver++) {
				if(v[ver])continue;
				Queue<Pair<Integer,Integer>> q=new LinkedList<>();
				q.add(new Pair<>(ver,-1));
				v[ver]=true;
				while(!q.isEmpty()) {
					Pair<Integer,Integer> temp=q.poll();
					int k=temp.getValue0();
					int parent=temp.getValue1();
					for(int o :adjlist.get(k)) {
						if(!v[o]) {
							v[o]=true;
							q.add(new Pair<>(o,k));
							
						}
						else if(v[o] && o!=parent) {
							
							return true;}
						continue;
					}
				}
				
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
		
		System.out.println(cycledetect(adjlist));
	
		
		
	}

}
