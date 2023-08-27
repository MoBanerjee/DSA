package GraphQs;

import java.util.*;

public class EventualSafeStatesusingTopoSortBFS {
	public static ArrayList<Integer> safestates(ArrayList<ArrayList<Integer>> adjlist){
		ArrayList<Integer>answer=new ArrayList<>();
		ArrayList<ArrayList<Integer>> transpose=new ArrayList<>();
		int v=adjlist.size();
		int[]indegree=new int[v];
		for(int y=0;y<v;y++) {
			transpose.add(new ArrayList<Integer>());
			
		}
		for(int i=0;i<v;i++) {
			for(int u:adjlist.get(i)) {
				transpose.get(u).add(i);
				indegree[i]++;
			}
		}
		Queue<Integer>q=new LinkedList<>();
		for(int h=0;h<indegree.length;h++) {
			if(indegree[h]==0)q.add(h);
			
		}

		while(!q.isEmpty()) {
			
			int k=q.poll();
			answer.add(k);
			for(int g:transpose.get(k)) {
				if(--indegree[g]==0)q.add(g);
			}
			
		}
		Collections.sort(answer);
		return answer;
		
	}
	public static void main(String[] args) {
		int n=6,m=7;
		ArrayList<ArrayList<Integer>> adjlist=new ArrayList<>();
		for(int i=0;i<=n;i++) {
			adjlist.add(new ArrayList<Integer>());
			
		}
	
		adjlist.get(0).add(1);
		adjlist.get(1).add(3);
		adjlist.get(3).add(0);
		adjlist.get(1).add(2);
		adjlist.get(0).add(2);
		adjlist.get(2).add(5);
		adjlist.get(4).add(5);
		ArrayList<Integer> ans=safestates(adjlist);
		System.out.println(ans);
	}
	



}
