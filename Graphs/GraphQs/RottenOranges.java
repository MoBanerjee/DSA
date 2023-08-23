package GraphQs;

import java.util.*;
import javafx.util.Pair;
public class RottenOranges {

static int rottenoranges(int[][]grid) {
	int n=grid.length;
	int m=grid[0].length;
	
	 Queue < Pair<Pair<Integer,Integer>,Integer> > q = new LinkedList < > ();
	int freshori=0;
	int[][]marker=new int[n][m];
	for(int x=0;x<n;x++) {
		for(int h=0;h<m;h++) {
			if(grid[x][h]==2) {
				q.add(new Pair<>(new Pair<>(x,h),0));
				marker[x][h]=2;
				continue;
			}
			else marker[x][h]=0;
			if(grid[x][h]==1)freshori++;
		}
	}

	int timestep=0;
	int countnew=0;
	int[]deltarow= {0,0,-1,1};
	int[]deltacol= {1,-1,0,0};
	while(!q.isEmpty()) {
		int row=q.peek().getValue0().getValue0();
		int col=q.peek().getValue0().getValue1();
		timestep=q.peek().getValue1();
		q.remove();
		for(int step=0;step<4;step++) {
			int newr=row+deltarow[step];
			int newc=col+deltacol[step];
			if(newr<n&&newr>=0&&newc>=0 && newc<m && grid[newr][newc]==1 && marker[newr][newc]==0) {
				q.add(new Pair<>(new Pair<>(newr,newc),timestep+1));
				marker[newr][newc]=2;
				countnew++;

			}
		}
		
		
	}
	if(countnew!=freshori)return -1;
	return timestep;
}
public static void main(String[] args) {
	int [][]grid= {{2,1,0},{1,1,0},{1,0,1}};
	System.out.println(rottenoranges(grid));
}

}
