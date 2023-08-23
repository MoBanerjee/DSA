package GraphQs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//https://www.codingninjas.com/studio/problems/find-the-number-of-states_1377943?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//can be done by either bfs or dfs both work as both visit all nodes in a connected component
public class Numberofprovinces {
	static int solution(int[][] roads, int n) {
		Queue<Integer> q=new LinkedList<>();
		boolean [] var=new boolean[n];
		int provinces=0;
		for(int t=0;t<n;t++) {
		ArrayList<Integer> result=new ArrayList<>();
		if(var[t])continue;
		var[t]=true;
		q.add(t);
		dfsrecversionmat(result,roads,q,var);
		provinces++;
		}
		
		return provinces;
		
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
			dfsrecversionmat(result,adjmatrix,q,var);}
			
		}
	public static void main (String []args) {
		int n=4;
		int adjmat[][] =new int[n+1][n+1];
		//edge 1--2
		adjmat[1][2]=1;
		adjmat[2][1]=1;
		//edge 1--3
		adjmat[1][3]=1;
		adjmat[3][1]=1;
		//edge 2--3
		adjmat[2][3]=1;
		adjmat[3][2]=1;
		//edge 0--3
//		adjmat[0][3]=1;
//		adjmat[3][0]=1;
		System.out.println(solution(adjmat,4));
	}

}
