package GraphQs;
import javafx.util.Pair;
import java.util.*;
public class Zeroonematrixbfsfindone {
static void zeroone(int[][]matrix,int[][]result){
	int n=matrix.length;
	int m=matrix[0].length;
	int[]drow= {-1,1,0,0};
	int[]dcol= {0,0,-1,1};
	
//	int [][] result=new int[n][m];
	for(int v=0;v<n;v++) {
		for(int v2=0;v2<m;v2++) {
			
			int checker=0;
			Queue<Pair<Pair<Integer,Integer>,Integer>> q=new LinkedList<>();
			boolean[][]marker=new boolean[n][m];
			q.add(new Pair<>(new Pair<>(v,v2),0));
			marker[v][v2]=true;
			while(!q.isEmpty()){
				Pair<Pair<Integer,Integer>,Integer>top=q.poll();
				int r=top.getValue0().getValue0();
				
				int c=top.getValue0().getValue1();
				
				int level=top.getValue1();
				if(matrix[r][c]==1) {
					result[v][v2]=level;
					
					
					break;
				}
				
				
			for(int i=0;i<4;i++) {
				int nr=r+drow[i];
				int nc=c+dcol[i];
				if(nr>=0 && nr<n && nc>=0 && nc<m && !marker[nr][nc]) {
					if(matrix[nr][nc]==1) {
						result[v][v2]=level+1;
						
						checker=1;
						break;
					}
					else {
						q.add(new Pair<>(new Pair<>(nr,nc),level+1));
						marker[nr][nc]=true;
					}
				}
				
			}
			if(checker==1)break;
			}
		}
	}
	
//	return result;
}
public static void main(String[] args) {
	int[][]mat= {{0,0,0,1},{0,0,1,1},{0,1,1,0}};
	int[][]ans=new int[3][4];
	zeroone(mat,ans);
	System.out.println(Arrays.deepToString(ans));
	
}
}

