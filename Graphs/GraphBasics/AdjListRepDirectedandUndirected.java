package GraphLearningBasics;
import java.util.*;
//space taken is O(2m)..m is number of edges
public class AdjListRepDirectedandUndirected {
	static ArrayList<ArrayList<Integer>> adjlist(){
		int n=3,m=3;
		ArrayList<ArrayList<Integer>> adjlist=new ArrayList<>();
		for(int i=0;i<=n;i++) {
			adjlist.add(new ArrayList<Integer>());
			
		}
		//edge 1--2
		adjlist.get(1).add(2);
		adjlist.get(2).add(1);
		//edge 1--3
		adjlist.get(1).add(3);
		adjlist.get(3).add(1);
		//edge 2--3
		adjlist.get(2).add(3);
		adjlist.get(3).add(2);
		return adjlist;
		
		
	}
	static ArrayList<ArrayList<Integer>> diradjlist(){
		int n=3,m=3;
		ArrayList<ArrayList<Integer>> adjlist=new ArrayList<>();
		for(int i=0;i<=n;i++) {
			adjlist.add(new ArrayList<Integer>());
			
		}
		//edge 1-->2
		adjlist.get(1).add(2);
		
		//edge 1-->3
		adjlist.get(1).add(3);
		
		//edge 2-->3
		adjlist.get(2).add(3);
		
		return adjlist;
		
		
	}
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> temp=adjlist();
		for (int u=1;u<temp.size();u++) {
			for(int j=0;j<temp.get(u).size();j++) {
				System.out.print(temp.get(u).get(j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		ArrayList<ArrayList<Integer>> temp2=diradjlist();
		for (int u=1;u<temp2.size();u++) {
			for(int j=0;j<temp2.get(u).size();j++) {
				System.out.print(temp2.get(u).get(j)+" ");
			}
			System.out.println();
		}
		
	}

}
