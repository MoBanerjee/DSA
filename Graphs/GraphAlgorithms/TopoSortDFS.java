package GraphAlgorithms;
import java.util.*;
public class TopoSortDFS {
	public static int[] toposort(ArrayList<ArrayList<Integer>> adjlist){
		int n=adjlist.size();
		int[]vis=new int[n];
		int[]answer=new int[n];
		Stack<Integer>st=new Stack<>();
		for(int s=0;s<n;s++) {
			if(vis[s]==1)continue;
			dfs(s,adjlist,vis,st);
		}
		for(int i=0;i<n;i++) {
			int j=st.pop();
			answer[i]=j;
		}
		return answer;
	}

	private static void dfs(int start,ArrayList<ArrayList<Integer>> adjlist, int[] vis, Stack<Integer> st) {
		// TODO Auto-generated method stub
		for(int it:adjlist.get(start)) {
			if(vis[it]==1)continue;
			
			dfs(it,adjlist,vis,st);
			
		}
		vis[start]=1;
		st.push(start);
	}
	public static void main(String[] args) {
		ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(5).add(0);
        
        adj.get(4).add(0);
   
        adj.get(5).add(2);
      
        adj.get(2).add(3);
        adj.get(4).add(1);
        adj.get(3).add(1);
      
      
        
        
        int[] ans = toposort(adj);
        
        System.out.println(Arrays.toString(ans));
//        int n=5,m=5;
//		int adjmat[][] =new int[n+1][n+1];
//		//edge 0--1
//		adjmat[0][1]=1;
//		adjmat[1][0]=1;
//		//edge 0--2
//		adjmat[0][2]=1;
//		adjmat[2][0]=1;
//		//edge 1--2
//		adjmat[1][2]=1;
//		adjmat[2][1]=1;
//		//edge 2--3
//		adjmat[3][2]=1;
//		adjmat[2][3]=1;
//		//edge 1--4
//		adjmat[1][4]=1;
//		adjmat[4][1]=1;
//		ArrayList < Integer > ans2 = dfsmainmat(5, adjmat);
//		int no2 = ans2.size(); 
//        for(int i = 0;i<no2;i++) {
//            System.out.print(ans2.get(i)+" "); 
//        }
	}

}
