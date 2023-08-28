package GraphQs;
import java.util.*;

public class CycleDetectionDirectedGraphDFSMyVersion {
	static boolean dfsrecversion(int temp,ArrayList<ArrayList<Integer> > al,boolean [] var,int[]pathvis){

		
		for(int i: al.get(temp)) {
			
			if(var[i]) {
			
				if( pathvis[i]==temp) {
					
					return true;
				}
				else continue;
			}
			var[i]=true;
			pathvis[i]=temp;
			return dfsrecversion(i,al,var,pathvis);
		}
		return false;
		
		
		
		
	}
	static boolean dfsmain(ArrayList<ArrayList<Integer> > al) {
		int n=al.size();
		boolean[]vis=new boolean[n];
		int[]pathvis=new int[n];
		for(int j=0;j<n;j++)pathvis[j]=-1;
		for(int v=0;v<n;v++) {
//			if(vis[v]) {
//				continue;}
			vis[v]=true;
			if(dfsrecversion(v,al,vis,pathvis)) {
			
				return true;
			}
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

      
        
        
        boolean ans = dfsmain(adj);
        System.out.println(ans);}
        

}
