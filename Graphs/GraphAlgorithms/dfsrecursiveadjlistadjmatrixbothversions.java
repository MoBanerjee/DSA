package GraphAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class dfsrecursiveadjlistadjmatrixbothversions {
	static void dfsrecversion(ArrayList<Integer> result,ArrayList<ArrayList<Integer> > al,Queue<Integer> q,boolean [] var){
		if(q.isEmpty())return;
		int temp=q.poll();
		result.add(temp);
		for(int i: al.get(temp)) {
			if(var[i])continue;
			var[i]=true;
			q.add(i);
			dfsrecversion(result,al,q,var);
		}
		
		
	}
	static void dfsrecversionmat(ArrayList<Integer> result,int[][]adjmatrix,Queue<Integer> q,boolean [] var){
		if(q.isEmpty())return;
		int temp=q.poll();
		result.add(temp);
		ArrayList<Integer>holder=new ArrayList<>();
		for(int d=0;d<adjmatrix[temp].length;d++) {
			if(adjmatrix[temp][d]==1)holder.add(d);
		}
		for(int x:holder) {
			if(var[x])continue;
			var[x]=true;
			q.add(x);
			dfsrecversionmat(result,adjmatrix,q,var);
			
		}
		
		
	}
	static ArrayList<Integer> dfsmain(int v, ArrayList<ArrayList<Integer> > al){
		Queue<Integer> q=new LinkedList<>();
		ArrayList<Integer> result=new ArrayList<>();
		boolean [] var=new boolean[v];
		var[0]=true;
		q.add(0);
		dfsrecversion(result,al,q,var);
		
		return result;
		
	}
	public static void main(String[] args) {
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
        
        
        ArrayList < Integer > ans = dfsmain(5, adj);
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
		ArrayList < Integer > ans2 = dfsmainmat(5, adjmat);
		int no2 = ans2.size(); 
        for(int i = 0;i<no2;i++) {
            System.out.print(ans2.get(i)+" "); 
        }
	}
	private static ArrayList<Integer> dfsmainmat(int i, int[][] adjmat) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<>();
		ArrayList<Integer> result=new ArrayList<>();
		boolean [] var=new boolean[i];
		var[0]=true;
		q.add(0);
		dfsrecversionmat(result,adjmat,q,var);
		
		return result;
	
	}

}
