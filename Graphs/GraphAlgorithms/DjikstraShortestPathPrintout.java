package GraphAlgorithms;

import java.util.ArrayList;
import java.util.PriorityQueue;

import javafx.util.Pair;

public class DjikstraShortestPathPrintout {
	@SuppressWarnings("serial")
	public static ArrayList<Integer> djikstrashortestpath(int V, ArrayList<ArrayList<ArrayList<Integer>>> adjl,int S,int end) {

		int[]dist=new int[V];
		for(int i=0;i<V;i++)dist[i]=(int)(1e9);
		dist[S]=0;
		int[]parent=new int[V];
		parent[S]=S;
		PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<>();
		pq.add(new Pair<>(0,S));
		while(!pq.isEmpty()) {
			Pair<Integer,Integer> temppair=pq.poll();
			int temp=temppair.getValue1();
			for(ArrayList<Integer> k: adjl.get(temp) ) {
				int newnode=k.get(0);
				int distance=k.get(1);
				if(dist[newnode]>dist[temp]+distance) {dist[newnode]=dist[temp]+distance;
				pq.add(new Pair<>(dist[newnode],newnode));
				parent[newnode]=temp;
				}
				
			}
			}
		
		if(dist[end]==(int)1e9) {return new ArrayList<>(){{add(-1);}};}
		ArrayList<Integer> path=new ArrayList<>();
		int dest=end;
		path.add(end);
		
		while(dest!=S) {
			int before=parent[dest];
			
			dest=before;
			path.add(before);
			
			
		}
		
		return path;
	}
	@SuppressWarnings("serial")
	public static void main(String[] args) {
        int V = 6, E = 6;
        int[][] edges = {{1,2,2},{2,5,5},{2,3,4},{1,4,1},{4,3,3},{3,5,1}};
        ArrayList<Integer> node1 = new ArrayList<Integer>() {{add(2);add(2);}};
	    ArrayList<Integer> node2 = new ArrayList<Integer>() {{add(5);add(5);}};
	    ArrayList<Integer> node3 = new ArrayList<Integer>() {{add(3);add(4);}};
	    ArrayList<Integer> node4 = new ArrayList<Integer>() {{add(4);add(1);}};
	    ArrayList<Integer> node5 = new ArrayList<Integer>() {{add(3);add(3);}};
	    ArrayList<Integer> node6 = new ArrayList<Integer>() {{add(5);add(1);}};
	    ArrayList<Integer> node7 = new ArrayList<Integer>() {{add(1);add(2);}};
	    ArrayList<Integer> node8 = new ArrayList<Integer>() {{add(2);add(5);}};
	    ArrayList<Integer> node9 = new ArrayList<Integer>() {{add(2);add(4);}};
	    ArrayList<Integer> node10 = new ArrayList<Integer>() {{add(1);add(1);}};
	    ArrayList<Integer> node11 = new ArrayList<Integer>() {{add(4);add(3);}};
	    ArrayList<Integer> node12 = new ArrayList<Integer>() {{add(3);add(1);}};
	    

	   
		ArrayList<ArrayList<Integer>> inter1 = new ArrayList<ArrayList<Integer>>(){
	      {
	          add(node1);
	          add(node4);
	      }  
	    };
	   
		ArrayList<ArrayList<Integer>> inter2 = new ArrayList<ArrayList<Integer>>(){
	      {
	          add(node7);
	          add(node2);
	          add(node3);
	      }  
	    };

		ArrayList<ArrayList<Integer>> inter3 = new ArrayList<ArrayList<Integer>>(){
	      {
	          add(node9);
	          add(node11);
	          add(node6);
	      }  
	    };
		ArrayList<ArrayList<Integer>> inter4 = new ArrayList<ArrayList<Integer>>(){
		      {
		          add(node5);
		          add(node10);
		         
		      }  
		    };
		ArrayList<ArrayList<Integer>> inter5 = new ArrayList<ArrayList<Integer>>(){
			      {

			          add(node8);
			          add(node12);
			      }  
			    };
			 
		 
	 
		ArrayList<ArrayList<ArrayList<Integer>>> adj= new ArrayList<ArrayList<ArrayList<Integer>>>(){
	        {	add(new ArrayList<>());
	            add(inter1); // for 1st node
	            add(inter2); // for 2nd node
	            add(inter3); 
	            add(inter4); 
	            add(inter5);
	        }
	    };
        ArrayList < Integer > path = djikstrashortestpath(V,adj,1,5);
        for (int i = path.size()-1; i >=0; i--) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }

}
