package GraphAlgorithms;

import java.util.*;

public class bfsrecursive {
	static void bfsrecversion(ArrayList<Integer> result,ArrayList<ArrayList<Integer> > al,Queue<Integer> q,boolean [] var){
		if(q.isEmpty())return;
		int temp=q.poll();
		result.add(temp);
		for(int i: al.get(temp)) {
			if(var[i])continue;
			var[i]=true;
			q.add(i);
		}
		
		bfsrecversion(result,al,q,var);
	}
	static ArrayList<Integer> bfsmain(int v, ArrayList<ArrayList<Integer> > al){
		Queue<Integer> q=new LinkedList<>();
		ArrayList<Integer> result=new ArrayList<>();
		boolean [] var=new boolean[v];
		var[0]=true;
		q.add(0);
		bfsrecversion(result,al,q,var);
		
		return result;
		
	}
	public static void main(String[] args) {
		ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        
        
        ArrayList < Integer > ans = bfsmain(5, adj);
        int no = ans.size(); 
        for(int i = 0;i<no;i++) {
            System.out.print(ans.get(i)+" "); 
        }
	}

}
