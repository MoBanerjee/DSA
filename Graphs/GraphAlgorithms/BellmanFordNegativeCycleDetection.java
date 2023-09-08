package GraphAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFordNegativeCycleDetection {
	static boolean bellman_fordnegativecycle(int V,
            ArrayList<ArrayList<Integer>> edges, int S) {
		int n=edges.size();
		int[]dist=new int[n];
		for(int i=0;i<n;i++) {
			if(i==S) {dist[i]=0;
			continue;
			}
			dist[i]=(int)1e9;
		}
		for(int y=0;y<n;y++) {
			//relaxation
			for(int j=0;j<n;j++) {
				int fromnode=edges.get(j).get(0);
				int tonode=edges.get(j).get(1);
				int cost=edges.get(j).get(2);
				if(dist[fromnode]+cost<dist[tonode]) {
					if(y==n-1)return true;
					dist[tonode]=dist[fromnode]+cost;}
			}
			
		}
		
		return false;
		
	}
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		int V = 6;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>() {
            {
                add(new ArrayList<Integer>(Arrays.asList(3, 2, 6)));
                add(new ArrayList<Integer>(Arrays.asList(5, 3, 1)));
                add(new ArrayList<Integer>(Arrays.asList(0, 1, 5)));
                add(new ArrayList<Integer>(Arrays.asList(1, 5, -3)));
                add(new ArrayList<Integer>(Arrays.asList(1, 2, -2)));
                add(new ArrayList<Integer>(Arrays.asList(3, 4, -2)));
                add(new ArrayList<Integer>(Arrays.asList(2, 4, 3)));
                add(new ArrayList<Integer>(Arrays.asList(1, 3, -3)));
                add(new ArrayList<Integer>(Arrays.asList(3, 5, 2)));
                add(new ArrayList<Integer>(Arrays.asList(5, 1, -1)));
            }
        };
        int u=0;
        for(u=0;u<V;u++) {
        	if(bellman_fordnegativecycle(V,edges,u)) {System.out.println("There is a negative cycle");
        	break;}
        	
        }
        if(u==V)
        System.out.println("There is no negative cycle");

        
	}

}
