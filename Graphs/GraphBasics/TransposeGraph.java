package GraphLearningBasics;

import java.util.ArrayList;
import java.util.Arrays;

public class TransposeGraph {
	public static ArrayList<ArrayList<Integer>> transposeadjlist(ArrayList<ArrayList<Integer>>adjlist){
	ArrayList<ArrayList<Integer>> transpose=new ArrayList<>();
	int v=adjlist.size();;
	for(int y=0;y<v;y++) {
		transpose.add(new ArrayList<Integer>());
		
	}
	for(int i=0;i<v;i++) {
		for(int u:adjlist.get(i)) {
			transpose.get(u).add(i);
		}
	}
	return transpose;
	}
	public static int[][] transposeadjmat(int[][]matrix){
		int v=matrix.length;
		int[][]transposenew=new int[v][v];
		
		for(int i=0;i<v;i++) {
			for(int k=0;k<v;k++) {
				if(matrix[i][k]!=0) {
				
					transposenew[k][i]=matrix[i][k];
				}
			}
		}
		return transposenew;
	}
	public static void main(String[] args) {
		int n=3,m=3;
		ArrayList<ArrayList<Integer>> adjlist=new ArrayList<>();
		for(int i=0;i<=n;i++) {
			adjlist.add(new ArrayList<Integer>());
			
		}
		//edge 1--2
		adjlist.get(1).add(2);
		adjlist.get(2).add(3);
		System.out.println(adjlist);
		System.out.println(transposeadjlist(adjlist));
		
		int adjmat[][] =new int[n+1][n+1];
		//edge 1-->2
		adjmat[1][2]=1;
	
		//edge 1-->3
		adjmat[1][3]=1;

		//edge 3-->2
		
		adjmat[3][2]=1;
		System.out.println(Arrays.deepToString(adjmat));
		System.out.println(Arrays.deepToString(transposeadjmat(adjmat)));
	}
}
