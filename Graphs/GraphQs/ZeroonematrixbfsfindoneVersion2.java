package GraphQs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import javafx.util.Pair;

public class ZeroonematrixbfsfindoneVersion2 {
	static int[][]finddist(int[][]matrix){
		int n=matrix.length;
		int m=matrix[0].length;
		int[][]result=new int[n][m];
		int[]drow= {-1,1,0,0};
		int[]dcol= {0,0,-1,1};
		Queue<Pair<Pair<Integer,Integer>,Integer>> q=new LinkedList<>();
		boolean[][]marker=new boolean[n][m];
		for(int v1=0;v1<n;v1++) {
			for(int v2=0;v2<m;v2++) {
				if(matrix[v1][v2]==1) {q.add(new Pair<>(new Pair<>(v1,v2),0));
					marker[v1][v2]=true;}
				
			}
		}
		while(!q.isEmpty()) {
			Pair<Pair<Integer,Integer>,Integer>top=q.poll();
			int r=top.getValue0().getValue0();
			
			int c=top.getValue0().getValue1();
			
			int level=top.getValue1();
			for(int i=0;i<4;i++) {
			int nr=r+drow[i];
			int nc=c+dcol[i];
			if(nr>=0 && nr<n && nc>=0 && nc<m && !marker[nr][nc]) {
				marker[nr][nc]=true;
				result[nr][nc]=level+1;
				q.add(new Pair<>(new Pair<>(nr,nc),level+1));
				
			}}
		}
		return result;
		
	}
	public static void main(String[] args) {
		int[][]mat= {{0,0,0,1},{0,0,1,1},{0,1,1,0}};
		int[][]ans=new int[3][4];
		ans=finddist(mat);
		System.out.println(Arrays.deepToString(ans));
		
	}

}
