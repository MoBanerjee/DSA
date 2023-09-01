package GraphAlgorithms;
import java.util.*;

import javafx.util.Pair;
public class DjikstraQueueBadImplementationButStill {
		@SuppressWarnings("serial")
		public static void main(String[] args) {
			   int V = 3, E=3,S=2;
			    ArrayList<Integer> node1 = new ArrayList<Integer>() {{add(1);add(1);}};
			    ArrayList<Integer> node2 = new ArrayList<Integer>() {{add(2);add(6);}};
			    ArrayList<Integer> node3 = new ArrayList<Integer>() {{add(2);add(3);}};
			    ArrayList<Integer> node4 = new ArrayList<Integer>() {{add(0);add(1);}};
			    ArrayList<Integer> node5 = new ArrayList<Integer>() {{add(1);add(3);}};
			    ArrayList<Integer> node6 = new ArrayList<Integer>() {{add(0);add(6);}};
			    

			   
				ArrayList<ArrayList<Integer>> inter1 = new ArrayList<ArrayList<Integer>>(){
			      {
			          add(node1);
			          add(node2);
			      }  
			    };
			   
				ArrayList<ArrayList<Integer>> inter2 = new ArrayList<ArrayList<Integer>>(){
			      {
			          add(node3);
			          add(node4);
			      }  
			    };
		
				ArrayList<ArrayList<Integer>> inter3 = new ArrayList<ArrayList<Integer>>(){
			      {
			          add(node5);
			          add(node6);
			      }  
			    };
			 
				ArrayList<ArrayList<ArrayList<Integer>>> adj= new ArrayList<ArrayList<ArrayList<Integer>>>(){
			        {
			            add(inter1); // for 1st node
			            add(inter2); // for 2nd node
			            add(inter3); // for 3rd node
			        }
			    };
			    System.out.println(Arrays.toString(djikstra(V,adj,2)));
			
		}
		public static int[] djikstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adjl,int S) {
			int[]dist=new int[V];
			for(int i=0;i<V;i++)dist[i]=(int)(1e9);
			dist[S]=0;
			Queue<Pair<Integer,Integer>> pq=new LinkedList<>();
			pq.add(new Pair<>(0,S));
			while(!pq.isEmpty()) {
				Pair<Integer,Integer> temppair=pq.poll();
				int temp=temppair.getValue1();
				for(ArrayList<Integer> k: adjl.get(temp) ) {
					int newnode=k.get(0);
					int distance=k.get(1);
					if(dist[newnode]>dist[temp]+distance) {dist[newnode]=dist[temp]+distance;
					pq.add(new Pair<>(dist[newnode],newnode));}
					
				}
				}
			return dist;
		}

	}



