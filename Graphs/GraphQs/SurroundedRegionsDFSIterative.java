package GraphQs;
import java.util.*;

import javafx.util.Pair;
public class SurroundedRegionsDFSIterative {
	static void surrregions(char [][]matrix){
		int n=matrix.length;
		int m=matrix[0].length;
		int[]drow= {-1,1,0,0};
		int[]dcol= {0,0,-1,1};
		int[][]vis=new int[n][m];

		
		for(int j=0;j<m;j++) {
			if(matrix[0][j]=='O' && vis[0][j]==0) {
				vis[0][j]=1;
			
				Stack<Pair<Integer,Integer>> s=new Stack<>();
				s.add(new Pair<>(0,j));
			
				while(!s.isEmpty()) {
					Pair<Integer,Integer> p=s.pop();
					int r=p.getValue0();
					int c=p.getValue1();
					
					vis[r][c]=1;
				
					for(int k=0;k<4;k++) {
						int nr=r+drow[k];
						int nc=c+dcol[k];
						if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0 && matrix[nr][nc]=='O') {
							s.add(new Pair<>(nr,nc));
							
						}
					}
				}
				
			}

			if(matrix[n-1][j]=='O' && vis[n-1][j]==0) {
				vis[n-1][j]=1;
				Stack<Pair<Integer,Integer>> s=new Stack<>();
				s.add(new Pair<>(n-1,j));
				while(!s.isEmpty()) {
					Pair<Integer,Integer> p=s.pop();
					int r=p.getValue0();
					int c=p.getValue1();
//					matrix[r][c]='O';
					vis[r][c]=1;
					
					for(int k=0;k<4;k++) {
						int nr=r+drow[k];
						int nc=c+dcol[k];
						if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0 && matrix[nr][nc]=='O') {
							s.add(new Pair<>(nr,nc));
							
						}
					}
				}
				
			}
			
		}
	

		for(int j=0;j<n;j++) {
			if(matrix[j][0]=='O' && vis[j][0]==0) {
				vis[j][0]=1;
				Stack<Pair<Integer,Integer>> s=new Stack<>();
				s.add(new Pair<>(j,0));
				while(!s.isEmpty()) {
					Pair<Integer,Integer> p=s.pop();
					int r=p.getValue0();
					int c=p.getValue1();
			
					vis[r][c]=1;
					
					for(int k=0;k<4;k++) {
						int nr=r+drow[k];
						int nc=c+dcol[k];
						if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0 && matrix[nr][nc]=='O') {
							s.add(new Pair<>(nr,nc));
							
						}
					}
				}
				
			}
			if(matrix[j][m-1]=='O' && vis[j][m-1]==0) {
				vis[j][m-1]=1;
				Stack<Pair<Integer,Integer>> s=new Stack<>();
				s.add(new Pair<>(j,m-1));
				while(!s.isEmpty()) {
					Pair<Integer,Integer> p=s.pop();
					int r=p.getValue0();
					int c=p.getValue1();

					vis[r][c]=1;
					
					for(int k=0;k<4;k++) {
						int nr=r+drow[k];
						int nc=c+dcol[k];
						if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0 && matrix[nr][nc]=='O') {
							s.add(new Pair<>(nr,nc));
							
						}
					}
				}
				
			}
			
		}
	
		for(int t=0;t<n;t++) {
			for (int h=0;h<m;h++) {
				if(vis[t][h]==0 && matrix[t][h]=='O') {
					matrix[t][h]='X';
				}
			}
		}




		
		
	}
	public static void main(String[] args) {
		char[][]original= {{'X','X','X','X'},{'X','O','X','X'},{'X','O','O','X'},{'X','O','X','X'},{'X','X','O','O'}};
		surrregions(original);
		System.out.println(Arrays.deepToString(original));
	}
	

}
