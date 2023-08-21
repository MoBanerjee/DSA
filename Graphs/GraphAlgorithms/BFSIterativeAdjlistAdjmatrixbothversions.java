package GraphAlgorithms;
//adjlist tc is O(No. of vertices)+O(2*No. of edges)
//adjlist sc is O(3n) which is similar to O(n)
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSIterativeAdjlistAdjmatrixbothversions {
	static ArrayList<Integer> bfstraversal(int v,ArrayList<ArrayList<Integer>> adjlist){
		ArrayList<Integer>bfs=new ArrayList<>();
		boolean [] varray=new boolean[v];
		Queue<Integer>q=new LinkedList<>();
		varray[0]=true;
		q.add(0);
		while(!q.isEmpty()) {
			int temp=q.poll();
			bfs.add(temp);
			for(int x:adjlist.get(temp)) {
				if(varray[x])continue;
				varray[x]=true;
				q.add(x);
				
			}
		}
		
		
		return bfs;
		
	}
	static ArrayList<Integer> bfstraversalmatrix(int v,int[][]adjmatrix){
		ArrayList<Integer>bfs=new ArrayList<>();
		boolean [] varray=new boolean[v];
		Queue<Integer>q=new LinkedList<>();
		varray[0]=true;
		q.add(0);
		while(!q.isEmpty()) {
			int temp=q.poll();
			bfs.add(temp);
			ArrayList<Integer>holder=new ArrayList<>();
			for(int d=0;d<adjmatrix[temp].length;d++) {
				if(adjmatrix[temp][d]==1)holder.add(d);
			}
			for(int x:holder) {
				if(varray[x])continue;
				varray[x]=true;
				q.add(x);
				
			}
		}
		
		
		return bfs;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        
        
        ArrayList < Integer > ans = bfstraversal(5, adj);
        int no = ans.size(); 
        for(int i = 0;i<no;i++) {
            System.out.print(ans.get(i)+" "); 
        }
        System.out.println();
        int n=5,m=5;
		int adjmat[][] =new int[n+1][n+1];
		//edge 0--1
		adjmat[0][1]=1;
		adjmat[1][0]=1;
		//edge 0--2
		adjmat[0][2]=1;
		adjmat[2][0]=1;
		//edge 1--2
		adjmat[1][2]=1;
		adjmat[2][1]=1;
		//edge 2--3
		adjmat[3][2]=1;
		adjmat[2][3]=1;
		//edge 1--4
		adjmat[1][4]=1;
		adjmat[4][1]=1;
		ArrayList < Integer > ans2 = bfstraversalmatrix(5, adjmat);
		int no2 = ans2.size(); 
        for(int i = 0;i<no2;i++) {
            System.out.print(ans2.get(i)+" "); 
        }

	}
	

}
