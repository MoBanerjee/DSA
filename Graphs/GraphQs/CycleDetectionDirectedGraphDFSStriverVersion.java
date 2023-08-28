package GraphQs;

import java.util.*;
//Striver's version btr imo
public class CycleDetectionDirectedGraphDFSStriverVersion {
	public static boolean cycledetectrecur(int temp,ArrayList<ArrayList<Integer>> al,int[]visit) {
		for(int i: al.get(temp)) {
			if(visit[i]==2)return true;
			if(visit[i]==1)continue;
			visit[i]=2;
			if(cycledetectrecur(i,al,visit))return true;
			visit[i]--;
		}
		return false;
		
	}
	public static boolean cycledetectmain(ArrayList<ArrayList<Integer>> al) {
		int v=al.size();
		int[]visit=new int[v];
		for(int i=0;i<v;i++) {
			if(visit[i]==1)continue;
			if(cycledetectrecur(i,al,visit))return true;
			
			
		}
		return false;
	}
	public static void main(String[] args) {
		ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList < > ());
        }
 adj.get(3).add(0);
        
        adj.get(0).add(1);
   
        adj.get(1).add(3);
      
        adj.get(2).add(0);
        adj.get(2).add(4);
        adj.get(4).add(5);

      
        
        
        boolean ans = cycledetectmain(adj);
        System.out.println(ans);}
        

}
