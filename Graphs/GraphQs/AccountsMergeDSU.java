package GraphQs;

import java.util.*;
import GraphAlgorithms.DisjointSetUnionbyRankandUnionbySize;
public class AccountsMergeDSU {
	
	
	static List<List<String>> accountsMerge(List<List<String>> details){
		int n=details.size();
		DisjointSetUnionbyRankandUnionbySize dj=new DisjointSetUnionbyRankandUnionbySize(n);
		HashMap<String,Integer> hmap= new HashMap<String,Integer>();
		for(int y=0;y<n;y++) {
			for(int h=1;h<details.get(y).size();h++) {
				if(!hmap.containsKey(details.get(y).get(h)))
					hmap.put(details.get(y).get(h), y);
				else
				{
					
					dj.UnionbySize(y, hmap.get(details.get(y).get(h)) );
				}
			}
		}
		
		ArrayList<ArrayList<String>> merged=new ArrayList<>();
	
		for(int i=0;i<n;i++)merged.add(new ArrayList<>());
		for(Map.Entry<String,Integer> it:hmap.entrySet()) {
			int val=it.getValue();
			int par=dj.findUPar(val);
			merged.get(par).add(it.getKey());
			}
		List<List<String>> result=new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(merged.get(i).isEmpty())continue;
			List<String> temp=new ArrayList<>();
			temp.add(details.get(i).get(0));
			Collections.sort(merged.get(i));
			for(int h=0;h<merged.get(i).size();h++) {
				temp.add(merged.get(i).get(h));
			}
			result.add(temp);
			
		}
		return result;
		}
	@SuppressWarnings({ "serial" })
	public static void main (String[] args) {
        List<List<String>> accounts = new ArrayList<>() {
            {
                add(new ArrayList<String>(Arrays.asList("John", "j1@com", "j2@com", "j3@com")));
                add(new ArrayList<String>(Arrays.asList("John", "j4@com")));
                add(new ArrayList<String>(Arrays.asList("Raj", "r1@com", "r2@com")));
                add(new ArrayList<String>(Arrays.asList("John", "j1@com", "j5@com")));
                add(new ArrayList<String>(Arrays.asList("Raj", "r2@com", "r3@com")));
                add(new ArrayList<String>(Arrays.asList("Mary", "m1@com")));

            }
        };


        List<List<String>> ans =accountsMerge(accounts);

        int n = ans.size();
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i).get(0) + ": ");
            int size = ans.get(i).size();
            for (int j = 1; j < size; j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }

            System.out.println("");
        }

    }
}
