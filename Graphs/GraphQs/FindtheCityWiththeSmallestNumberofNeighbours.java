package GraphQs;

public class FindtheCityWiththeSmallestNumberofNeighbours {
	
	public static int findCity(int n, int m, int edges[][],
            int distanceThreshold) {
		int[][]adjmat=new int[n][n];
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                adjmat[i][j] = Integer.MAX_VALUE;
        }
		for(int i=0;i<m;i++) {
			int from=edges[i][0];
			int to=edges[i][1];
			int cost=edges[i][2];
			adjmat[from][to]=cost;
			
		}
		for(int via=0;via<n;via++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(adjmat[i][via]!=Integer.MAX_VALUE && adjmat[via][j]!=Integer.MAX_VALUE && adjmat[i][j]>adjmat[i][via]+adjmat[via][j] ) {
						adjmat[i][j]=adjmat[i][via]+adjmat[via][j];
					}
				}
			}
		}
		int cntmax=n;
		int city=-1;
		for(int h=0;h<n;h++) {
			int count=0;
			for(int i=0;i<n;i++) {
				if(count>cntmax)break;
				if(adjmat[h][i]<=distanceThreshold)count++;
				
			}
			if(count<cntmax)cntmax=count;
			city=h;
		}
		return city;
	}
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int[][] edges =  {{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}};
        int distanceThreshold = 4;

       
        int cityNo = findCity(n, m, edges, distanceThreshold);
        System.out.println("The answer is node: " + cityNo);
    }
}
