package GraphQs;

import java.util.*;

public class AlienDictionary {
	public static String aliendictionary(String[]dictionary,int n,int k) {
		ArrayList<ArrayList<Integer>> al=new ArrayList<>();
		for(int o=0;o<k;o++) {
			al.add(new ArrayList<>());
		}
		for(int i=0;i<n-1;i++) {
			String st1=dictionary[i];
			String st2=dictionary[i+1];
			if(st1.length()>st2.length())return "";
			int length=st1.length();
			for(int p=0;p<length;p++) {
				if(st1.charAt(p)!=st2.charAt(p)) {
					al.get(st1.charAt(p)-'a').add(st2.charAt(p)-'a');
					
				}
			}
			
		}
		int[] intlist=toposortbfs(al);
		if(intlist.length!=k)return "";
		String answer="";
		for(int y=0;y<k;y++) {
			answer=answer+(char)(intlist[y]+(int)('a'));
		}
		return answer;
		
	}
	public static int[]toposortbfs(ArrayList<ArrayList<Integer>> adjlist){
		
		int n=adjlist.size();
		int[]answer=new int[n];
		int[]indegree=new int[n];
		for(int i=0;i<n;i++) {
			for(int it:adjlist.get(i)) {
				indegree[it]++;
				
			}
		}

		Queue<Integer>q=new LinkedList<>();
		for(int h=0;h<indegree.length;h++) {
			if(indegree[h]==0)q.add(h);
			
		}

		int index=0;
		while(!q.isEmpty()) {
			int k=q.poll();
			answer[index++]=k;
			for(int g:adjlist.get(k)) {
				if(--indegree[g]==0)q.add(g);
			}
			
		}
		if(index!=n)return new int[0];
		return answer;
	}
public static void main(String[] args) {
	String[] givendict= {"caa","aaa","aab"};
	int N=3;
	int K=3;
	System.out.println(aliendictionary(givendict,N,K));
	
	
}
}
