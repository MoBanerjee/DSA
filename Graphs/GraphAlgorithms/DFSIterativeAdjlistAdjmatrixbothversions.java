package GraphAlgorithms;
import java.util.*;
//sc of adjlist is O(3n)=O(n)+O(n)+O(n)
//tc of adjlist version is O(n)+O(2E)...n is number of vertices and E is number of edges.
public class DFSIterativeAdjlistAdjmatrixbothversions {
	static ArrayList<Integer> dfsiterative(ArrayList<ArrayList<Integer>> adjlist,int n){
		boolean []varray=new boolean [n];
		Stack<Integer> sholder=new Stack<>();
		sholder.push(0);
	
		ArrayList<Integer>answer=new ArrayList<>();
		while(!sholder.isEmpty()) {
			int front=sholder.pop();
			if(varray[front])continue;
			answer.add(front);
			varray[front]=true;
			for(int o:adjlist.get(front)) {
//				if(varray[o])continue;
				sholder.push(o);
				
				
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        
        
        ArrayList < Integer > ans = dfsiterative(adj,5);
        int no = ans.size(); 
        for(int i = 0;i<no;i++) {
            System.out.print(ans.get(i)+" "); 
        }
        System.out.println();
//        int n=5,m=5;
//		int adjmat[][] =new int[n+1][n+1];
//		//edge 0--1
//		adjmat[0][1]=1;
//		adjmat[1][0]=1;
//		//edge 0--2
//		adjmat[0][2]=1;
//		adjmat[2][0]=1;
//		//edge 1--2
//		adjmat[1][2]=1;
//		adjmat[2][1]=1;
//		//edge 2--3
//		adjmat[3][2]=1;
//		adjmat[2][3]=1;
//		//edge 1--4
//		adjmat[1][4]=1;
//		adjmat[4][1]=1;
//		ArrayList < Integer > ans2 = dfsmainmat(5, adjmat);
//		int no2 = ans2.size(); 
//        for(int i = 0;i<no2;i++) {
//            System.out.print(ans2.get(i)+" "); 
//        }
	}

}
