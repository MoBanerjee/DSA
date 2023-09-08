package GraphQs;
import java.util.*;

import javafx.util.Pair;
public class ShortestPathBinaryMaze {
	public static int shortestdist(int[][] grid, int[] source, int[] last) {
		if(source[0]==last[0] && source[1]==last[1])return 0;
		Queue<Pair<Pair<Integer,Integer>,Integer>> q=new LinkedList<>();
		int[][]distance=new int[grid.length][grid[0].length];
		int n=grid.length;
		int m=grid[0].length;
		q.add(new Pair<>(new Pair<>(source[0],source[1]),0));
		int[]deltarow= {0,0,-1,1};
		int[]deltacol= {1,-1,0,0};
		while(!q.isEmpty()) {
			Pair <Pair<Integer,Integer>,Integer> p=q.poll();
			Pair<Integer,Integer> pt=p.getValue0();
			int far=p.getValue1();
			int first=pt.getValue0();
			int second=pt.getValue1();
			for(int i=0;i<4;i++) {
				int nr=first+deltarow[i];
				int nc=second+deltacol[i];
				if(nr<n && nr>=0 && nc<m && nc>=0 && !(nr==source[0] && nc==source[1]) && distance[nr][nc]==0) {
					if(nr==last[0] && nc==last[1])return far+1;
					q.add(new Pair<>(new Pair<>(nr,nc),far+1));
					distance[nr][nc]=far+1;
					
					
				}
			}
			
			
		}
		return -1;
		
	}
public static void main(String[] args) {
	int[] source={0,1};
    int[] destination={2,2};
    
    int[][] grid={{1, 1, 1, 1},
        {1, 1, 0, 1},
        {1, 1, 1, 1},
        {1, 1, 0, 0},
        {1, 0, 0, 1}};
    System.out.println(shortestdist(grid,source,destination));
    
}
}
