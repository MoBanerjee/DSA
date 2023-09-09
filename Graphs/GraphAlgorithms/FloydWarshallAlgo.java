package GraphAlgorithms;

public class FloydWarshallAlgo {
	public static void shortest_distance(int[][] matrix) {
		int n=matrix.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(matrix[i][j]==-1)matrix[i][j]=(int)(1e9);
				if(i==j)matrix[i][j]=0;
			}
		}
		for(int via=0;via<n;via++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(matrix[i][j]>matrix[i][via]+matrix[via][j] && matrix[i][via]!=(int)(1e9) && matrix[via][j]!=(int)(1e9) ) {
						if(i==j) {System.out.println("Negative cycle!! "+i+via);
						}
						matrix[i][j]=matrix[i][via]+matrix[via][j];
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(matrix[i][j]==(int)(1e9))matrix[i][j]=-1;
			}
		}
	
	}
	

	public static void main(String[] args) {
        int V = 4;
        int[][] matrix = new int[V][V];

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                matrix[i][j] = -1;
            }
        }

        matrix[2][0] = -2;
        matrix[0][1] = -2;
        matrix[1][3] = 1;
//        matrix[3][0] = -2;

  
        shortest_distance(matrix);
        	for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println("");
            }
        

        
    }
}
