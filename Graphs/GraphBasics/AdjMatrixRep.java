package GraphLearningBasics;

import java.util.Arrays;
//space consumed is O(nsqr)...too costly..only use for small graphs
public class AdjMatrixRep {
	static int[][]adjmatrix(){
		int n=3,m=3;
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
		return adjmat;
		
		
	}
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(adjmatrix()));
		int[][]temp=adjmatrix();
		for(int u=0;u<temp.length;u++) {
			System.out.println(Arrays.toString(temp[u]));
		}
		
	}

}
