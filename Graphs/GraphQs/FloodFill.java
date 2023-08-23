package GraphQs;

import java.util.*;


import javafx.util.Pair;

public class FloodFill {
	static int[][] floodfill(int[][] image, int n, int m, int x, int y, int p) {
		
		int[][]newfloodfill=new int[n][m];
		 Queue < Pair<Integer,Integer> > q = new LinkedList < > ();
		q.add(new Pair<>(x,y));
		
		int[][]marker=new int[n][m];
		int inicolor=0;
		for(int tr=0;tr<n;tr++) {
			for(int h=0;h<m;h++) {
				newfloodfill[tr][h]=image[tr][h];
				if(tr==x && h==y) {
					marker[x][y]=1;
					inicolor=image[x][y];
					
				}
				else marker[tr][h]=0;
			
			}
		}

		int[]deltarow= {0,0,-1,1};
		int[]deltacol= {1,-1,0,0};
		while(!q.isEmpty()) {
			int row=q.peek().getValue0();
			int col=q.peek().getValue1();
			newfloodfill[row][col]=p;
			q.remove();
			for(int step=0;step<4;step++) {
				int newr=row+deltarow[step];
				int newc=col+deltacol[step];
				if(newr<n&&newr>=0&&newc>=0 && newc<m && image[newr][newc]==inicolor && marker[newr][newc]==0) {
					q.add(new Pair<>(newr,newc));
					marker[newr][newc]=1;
					

				}
			}
			
			
		}
	
		return newfloodfill;
	}
	public static void main(String[] args) {
		int [][]photo= {{1,1,1},{2,2,0},{2,2,2}};
		System.out.println(Arrays.deepToString(floodfill(photo,photo.length,photo[0].length,2,0,3)));
	}

}
